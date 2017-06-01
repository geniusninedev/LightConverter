package com.nineinfosys.lightconverter.ConveterActivityList;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.print.PrintHelper;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.nineinfosys.lightconverter.Adapter.RecyclerViewConversionListAdapter;
import com.nineinfosys.lightconverter.Engin.IlluminationConverter;
import com.nineinfosys.lightconverter.R;
import com.nineinfosys.lightconverter.Supporter.ItemList;
import com.nineinfosys.lightconverter.Supporter.Settings;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionIlluminationListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    DecimalFormat formatter = null;
    private String strlux=null,strmetercandle=null,strcentimetercandle=null,strfootcandle=null,strflame=null,strphot=null,strnox=null,strcandelasteradiansqmeter=null,strlumensquaremeter=null,
            strlumensquarecentimeter=null,strlumensquarefoot=null,strwattsqcm=null;



    private RecyclerView rView;
    RecyclerViewConversionListAdapter rcAdapter;
    List<ItemList> rowListItem,rowListItem1;
    private static final int REQUEST_CODE = 100;
    private File imageFile;
    private Bitmap bitmap;
    private PrintHelper printhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);
        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        MobileAds.initialize(ConversionIlluminationListActivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverterList);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#fbc02d")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#c49000"));
        }

        //format of decimal pint
        formatsetting();


        edittextConversionListvalue=(EditText)findViewById(R.id.edittextConversionListvalue) ;
        textconversionFrom=(TextView) findViewById(R.id.textViewConversionFrom) ;
        textViewConversionShortform=(TextView) findViewById(R.id.textViewConversionShortform) ;

        //get the value from temperture activity
        stringSpinnerFrom = getIntent().getExtras().getString("stringSpinnerFrom");
        doubleEdittextvalue= getIntent().getExtras().getDouble("doubleEdittextvalue");
        edittextConversionListvalue.setText(String.valueOf(doubleEdittextvalue));

        NamesAndShortform(stringSpinnerFrom);

        //   Toast.makeText(this,"string1 "+stringSpinnerFrom,Toast.LENGTH_LONG).show();
        rowListItem = getAllunitValue(stringSpinnerFrom,doubleEdittextvalue);

        //Initializing Views
        rView = (RecyclerView) findViewById(R.id.recyclerViewConverterList);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(new GridLayoutManager(this, 1));


        //Initializing our superheroes list
        rcAdapter = new RecyclerViewConversionListAdapter(this,rowListItem);
        rView.setAdapter(rcAdapter);

        edittextConversionListvalue.addTextChangedListener(this);



    }

    private void NamesAndShortform(String stringSpinnerFrom) {
        switch (stringSpinnerFrom) {
            case "Lux -lx":
                textconversionFrom.setText("Lux ");                 textViewConversionShortform.setText("lx");
                break;
            case "Meter-candle -m*c":
                textconversionFrom.setText("Meter-candle ");                 textViewConversionShortform.setText("m*c");
                break;
            case "Centimeter-candle -cm*c":
                textconversionFrom.setText("Centimeter-candle ");                 textViewConversionShortform.setText("cm*c");
                break;
            case "Foot-candle -ft*c,fc":
                textconversionFrom.setText("Foot-candle ");                 textViewConversionShortform.setText("ft*c,fc");
                break;
            case "Flame -fl":
                textconversionFrom.setText("Flame ");                 textViewConversionShortform.setText("fl");
                break;
            case "Phot -ph":
                textconversionFrom.setText("Phot ");                 textViewConversionShortform.setText("ph");
                break;
            case "Nox -nox":
                textconversionFrom.setText("Nox ");                 textViewConversionShortform.setText("nox");
                break;
            case  "Candela steradian/sq. meter -cd srad/m^2":
                textconversionFrom.setText("Candela steradian/sq. meter ");                 textViewConversionShortform.setText("cd srad/m^2");
                break;
            case "Lumen/square meter -lm/m^2":
                textconversionFrom.setText("Lumen/square meter ");                 textViewConversionShortform.setText("lm/m^2");
                break;
            case "Lumen/square centimeter -lm/cm^2":
                textconversionFrom.setText("Lumen/square centimeter ");                 textViewConversionShortform.setText("lm/cm^2");
                break;
            case "Lumen/square foot -lm/ft^2":
                textconversionFrom.setText("Lumen/square foot ");                 textViewConversionShortform.setText("lm/ft^2");
                break;
            case "Watt/sq. cm (at 555 nm) -W/cm^2(at 555 nm)":
                textconversionFrom.setText("Watt/sq. cm (at 555 nm) ");                 textViewConversionShortform.setText("W/cm^2(at 555 nm)");
                break;
        }
    }

    private void formatsetting() {
        //fetching value from sharedpreference
        SharedPreferences sharedPreferences =this.getSharedPreferences(Settings.SHARED_PREF_NAME, Context.MODE_PRIVATE);
        //Fetching thepatient_mobile_Number value form sharedpreferences
        String  FormattedString = sharedPreferences.getString(Settings.Format_Selected_SHARED_PREF,"Thousands separator");
        String DecimalplaceString= sharedPreferences.getString(Settings.Decimal_Place_Selected_SHARED_PREF,"2");
        Settings settings=new Settings(FormattedString,DecimalplaceString);
        formatter= settings.setting();
    }

    private List<ItemList> getAllunitValue(String strSpinnerFrom,double doubleEdittextvalue1) {

        IlluminationConverter c = new  IlluminationConverter(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<IlluminationConverter.ConversionResults> results = c.calculateIlluminationConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            IlluminationConverter.ConversionResults item = results.get(i);

            strlux=String.valueOf(formatter.format(item.getLux()));
            strmetercandle=String.valueOf(formatter.format(item.getMetercandle()));
            strcentimetercandle=String.valueOf(formatter.format(item.getCentimetercandle()));
            strfootcandle=String.valueOf(formatter.format(item.getFootcandle()));
            strflame=String.valueOf(formatter.format(item.getFlame()));
            strphot=String.valueOf(formatter.format(item.getPhot()));
            strnox=String.valueOf(formatter.format(item.getNox()));
            strcandelasteradiansqmeter=String.valueOf(formatter.format(item.getCandelasteradiansqmeter()));
            strlumensquaremeter=String.valueOf(formatter.format(item.getLumensquaremeter()));
            strlumensquarecentimeter=String.valueOf(formatter.format(item.getLumensquarecentimeter()));
            strlumensquarefoot=String.valueOf(formatter.format(item.getLumensquarefoot()));
            strwattsqcm=String.valueOf(formatter.format(item.getWattsqcm()));

            list.add(new ItemList("lx","Lux ",strlux,"lx"));
            list.add(new ItemList("m*c","Meter-candle ",strmetercandle,"m*c"));
            list.add(new ItemList("cm*c","Centimeter-candle ",strcentimetercandle,"cm*c"));
            list.add(new ItemList("ft*c,fc","Foot-candle ",strfootcandle,"ft*c,fc"));
            list.add(new ItemList("fl","Flame ",strflame,"fl"));
            list.add(new ItemList("ph","Phot ",strphot,"ph"));
            list.add(new ItemList("nox","Nox ",strnox,"nox"));
            list.add(new ItemList("cd srad/m^2","Candela steradian/sq. meter ",strcandelasteradiansqmeter,"cd srad/m^2"));
            list.add(new ItemList("lm/m^2","Lumen/square meter ",strlumensquaremeter,"lm/m^2"));
            list.add(new ItemList("lm/cm^2","Lumen/square centimeter ",strlumensquarecentimeter,"lm/cm^2"));
            list.add(new ItemList("lm/ft^2","Lumen/square foot ",strlumensquarefoot,"lm/ft^2"));
            list.add(new ItemList("W/cm^2(at 555 nm)","Watt/sq. cm (at 555 nm) ",strwattsqcm,"W/cm^2(at 555 nm)"));



        }
        return list;

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {


        rowListItem.clear();
        try {

           double value = Double.parseDouble(edittextConversionListvalue.getText().toString().trim());

            rowListItem1 = getAllunitValue(stringSpinnerFrom,value);


            rcAdapter = new RecyclerViewConversionListAdapter(this,rowListItem1);
            rView.setAdapter(rcAdapter);

        }
        catch (NumberFormatException e) {
            doubleEdittextvalue = 0;

        }
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Take appropriate action for each action item click
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                this.finish();
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}

