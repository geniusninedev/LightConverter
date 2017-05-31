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


import com.nineinfosys.lightconverter.Adapter.RecyclerViewConversionListAdapter;
import com.nineinfosys.lightconverter.Engin.Luminance;
import com.nineinfosys.lightconverter.R;
import com.nineinfosys.lightconverter.Supporter.ItemList;
import com.nineinfosys.lightconverter.Supporter.Settings;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionLuminanceListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    DecimalFormat formatter = null;

    private static final int REQUEST_CODE = 100;
    private File imageFile;
    private Bitmap bitmap;
    private PrintHelper printhelper;

  private  String strcandelasquaremeter=null,strcandelasquarecentimeter=null,strcandelasquarefoot=null,strcandelasquareinch=null,strkilocandelasquaremeter=null,strstilb=null,strlumensqmetersteradian=null,
            strlumensqcmsteradian=null,strlumensquarefootsteradian=null,strwattsqcmsteradian=null,strnit=null,strmillinit=null,strlambert=null,strmillilambert=null,strfootlambert=null,strapostilb=null,
            strblondel=null,strbril=null,strskot=null;


    private RecyclerView rView;
    RecyclerViewConversionListAdapter rcAdapter;
    List<ItemList> rowListItem,rowListItem1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);
        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#6fd684")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#52ae64"));
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
            case "Candela/square meter -cd/m^2":
                textconversionFrom.setText("Candela/square meter ");                 textViewConversionShortform.setText("cd/m^2");
                break;
            case "Candela/square centimeter -cd/cm^2":
                textconversionFrom.setText("Candela/square centimeter ");                 textViewConversionShortform.setText("cd/cm^2");
                break;
            case "Candela/square foot -cd/ft^2":
                textconversionFrom.setText("Candela/square foot ");                 textViewConversionShortform.setText("cd/ft^2");
                break;
            case "Candela/square inch -cd/in^2":
                textconversionFrom.setText("Candela/square inch ");                 textViewConversionShortform.setText("cd/in^2");
                break;
            case "Kilocandela/square meter -kcd/m^2":
                textconversionFrom.setText("Kilocandela/square meter ");                 textViewConversionShortform.setText("kcd/m^2");
                break;
            case "Stilb -sb":
                textconversionFrom.setText("Stilb ");                 textViewConversionShortform.setText("sb");
                break;
            case "Lumen/sq. meter/steradian -l/m^2/srad":
                textconversionFrom.setText("Lumen/sq. meter/steradian ");                 textViewConversionShortform.setText("l/m^2/srad");
                break;
            case "Lumen/sq. cm/steradian -l/cm^2/srad":
                textconversionFrom.setText("Lumen/sq. cm/steradian ");                 textViewConversionShortform.setText("l/cm^2/srad");
                break;
            case "Lumen/square foot/steradian -l/ft^2/srad":
                textconversionFrom.setText("Lumen/square foot/steradian ");                 textViewConversionShortform.setText("l/ft^2/srad");
                break;
            case "Watt/sq. cm/steradian (at 555 nm) -W/cm^2/srad (at 555 nm)":
                textconversionFrom.setText("Watt/sq. cm/steradian (at 555 nm) ");                 textViewConversionShortform.setText("W/cm^2/srad (at 555 nm)");
                break;
            case "Nit -nt":
                textconversionFrom.setText("Nit ");                 textViewConversionShortform.setText("nt");
                break;
            case "Millinit -mnt":
                textconversionFrom.setText("Millinit ");                 textViewConversionShortform.setText("mnt");
                break;
            case "Lambert -L":
                textconversionFrom.setText("Lambert ");                 textViewConversionShortform.setText("L");
                break;
            case "Millilambert -mL":
                textconversionFrom.setText("Millilambert ");                 textViewConversionShortform.setText("mL");
                break;
            case "Foot-lambert -fL":
                textconversionFrom.setText("Foot-lambert ");                 textViewConversionShortform.setText("fL");
                break;
            case "Apostilb -apo":
                textconversionFrom.setText("Apostilb ");                 textViewConversionShortform.setText("apo");
                break;
            case "Blondel -blo":
                textconversionFrom.setText("Blondel ");                 textViewConversionShortform.setText("blo");
                break;
            case "Bril -br":
                textconversionFrom.setText("Bril ");                 textViewConversionShortform.setText("br");
                break;
            case "Skot -sk":
                textconversionFrom.setText("Skot ");                 textViewConversionShortform.setText("sk");
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

        Luminance c = new  Luminance(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<Luminance.ConversionResults> results = c.calculateinertiaConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            Luminance.ConversionResults item = results.get(i);


            strcandelasquaremeter=String.valueOf(formatter.format(item.getCandelasquaremeter()));
            strcandelasquarecentimeter=String.valueOf(formatter.format(item.getCandelasquarecentimeter()));
            strcandelasquarefoot=String.valueOf(formatter.format(item.getCandelasquarefoot()));
            strcandelasquareinch=String.valueOf(formatter.format(item.getCandelasquareinch()));
            strkilocandelasquaremeter=String.valueOf(formatter.format(item.getKilocandelasquaremeter()));
            strstilb=String.valueOf(formatter.format(item.getStilb()));
            strlumensqmetersteradian=String.valueOf(formatter.format(item.getLumensqmetersteradian()));
            strlumensqcmsteradian=String.valueOf(formatter.format(item.getLumensqcmsteradian()));
            strlumensquarefootsteradian=String.valueOf(formatter.format(item.getLumensquarefootsteradian()));
            strwattsqcmsteradian=String.valueOf(formatter.format(item.getWattsqcmsteradian()));
            strnit=String.valueOf(formatter.format(item.getNit()));
            strmillinit=String.valueOf(formatter.format(item.getMillinit()));
            strlambert=String.valueOf(formatter.format(item.getLambert()));
            strmillilambert=String.valueOf(formatter.format(item.getMillilambert()));
            strfootlambert=String.valueOf(formatter.format(item.getFootlambert()));
            strapostilb=String.valueOf(formatter.format(item.getApostilb()));
            strblondel=String.valueOf(formatter.format(item.getBlondel()));
            strbril=String.valueOf(formatter.format(item.getBril()));
            strskot=String.valueOf(formatter.format(item.getSkot()));

            list.add(new ItemList("cd/m^2","Candela/square meter ",strcandelasquaremeter,"cd/m^2"));
            list.add(new ItemList("cd/cm^2","Candela/square centimeter ",strcandelasquarecentimeter,"cd/cm^2"));
            list.add(new ItemList("cd/ft^2","Candela/square foot ",strcandelasquarefoot,"cd/ft^2"));
            list.add(new ItemList("cd/in^2","Candela/square inch ",strcandelasquareinch,"cd/in^2"));
            list.add(new ItemList("kcd/m^2","Kilocandela/square meter ",strkilocandelasquaremeter,"kcd/m^2"));
            list.add(new ItemList("sb","Stilb ",strstilb,"sb"));
            list.add(new ItemList("l/m^2/srad","Lumen/sq. meter/steradian ",strlumensqmetersteradian,"l/m^2/srad"));
            list.add(new ItemList("l/cm^2/srad","Lumen/sq. cm/steradian ",strlumensqcmsteradian,"l/cm^2/srad"));
            list.add(new ItemList("l/ft^2/srad","Lumen/square foot/steradian ",strlumensquarefootsteradian,"l/ft^2/srad"));
            list.add(new ItemList("W/cm^2/srad (at 555 nm)","Watt/sq. cm/steradian (at 555 nm) ",strwattsqcmsteradian,"W/cm^2/srad (at 555 nm)"));
            list.add(new ItemList("nt","Nit ",strnit,"nt"));
            list.add(new ItemList("mnt","Millinit ",strmillinit,"mnt"));
            list.add(new ItemList("L","Lambert ",strlambert,"L"));
            list.add(new ItemList("mL","Millilambert ",strmillilambert,"mL"));
            list.add(new ItemList("fL","Foot-lambert ",strfootlambert,"fL"));
            list.add(new ItemList("apo","Apostilb ",strapostilb,"apo"));
            list.add(new ItemList("blo","Blondel ",strblondel,"blo"));
            list.add(new ItemList("br","Bril ",strbril,"br"));
            list.add(new ItemList("sk","Skot ",strskot,"sk"));
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
