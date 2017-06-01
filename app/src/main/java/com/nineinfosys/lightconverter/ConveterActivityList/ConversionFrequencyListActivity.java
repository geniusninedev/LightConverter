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
import com.nineinfosys.lightconverter.Engin.FrequencyConverter;
import com.nineinfosys.lightconverter.R;
import com.nineinfosys.lightconverter.Supporter.ItemList;
import com.nineinfosys.lightconverter.Supporter.Settings;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionFrequencyListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    DecimalFormat formatter = null;


    private RecyclerView rView;
    RecyclerViewConversionListAdapter rcAdapter;
    List<ItemList> rowListItem,rowListItem1;
    private static final int REQUEST_CODE = 100;
    private File imageFile;
    private Bitmap bitmap;
    private PrintHelper printhelper;

  private  String strhertz=null,strexahertz=null,strpetahertz=null,strterahertz=null,strgigahertz=null,strmegahertz=null,strkilohertz=null,strhectohertz=null,strdekahertz=null,strdecihertz=null,
            strcentihertz=null,strmillihertz=null,strmicrohertz=null,strnanohertz=null,strpicohertz=null,strfemtohertz =null,strattohertz=null,strcyclepersecond=null,strwavelengthinexametres=null,
            strwavelengthinpetametres=null,strwavelengthinterametres=null,strwavelengthingigametres=null,strwavelengthinmegametres=null,strwavelengthinkilometres =null,strwavelengthinhectometres=null,
            strwavelengthindekametres=null,strwavelengthinmetres=null,strwavelengthindecimetres=null,strwavelengthincentimetres=null,strwavelengthinmillimetres=null,strwavelengthinmicrometres =null,
            strElectronComptonwavelength=null,strProtonComptonwavelength=null,strNeutronComptonwavelength=null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);
        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        MobileAds.initialize(ConversionFrequencyListActivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverterList);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#db290d")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#a10000"));
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
            case "Hertz -Hz":
                textconversionFrom.setText("Hertz");                 textViewConversionShortform.setText("Hz");
                break;
            case "Exahertz -EHz":
                textconversionFrom.setText("Exahertz");                 textViewConversionShortform.setText("EHz");
                break;
            case "Petahertz -PHz":
                textconversionFrom.setText("Petahertz");                 textViewConversionShortform.setText("PHz");
                break;
            case "Terahertz -THz":
                textconversionFrom.setText("Terahertz");                 textViewConversionShortform.setText("THz");
                break;
            case "Gigahertz -GHz":
                textconversionFrom.setText("Gigahertz");                 textViewConversionShortform.setText("GHz");
                break;
            case "Megahertz -MHz":
                textconversionFrom.setText("Megahertz");                 textViewConversionShortform.setText("MHz");
                break;
            case "Kilohertz -kHz":
                textconversionFrom.setText("Kilohertz");                 textViewConversionShortform.setText("kHz");
                break;
            case "Hectohertz -hHz":
                textconversionFrom.setText("Hectohertz");                 textViewConversionShortform.setText("hHz");
                break;
            case "Dekahertz -daHz":
                textconversionFrom.setText("Dekahertz");                 textViewConversionShortform.setText("daHz");
                break;
            case "Decihertz -dHz":
                textconversionFrom.setText("Decihertz");                 textViewConversionShortform.setText("dHz");
                break;
            case "Centihertz -cHz":
                textconversionFrom.setText("Centihertz");                 textViewConversionShortform.setText("cHz");
                break;
            case "Millihertz -mHz":
                textconversionFrom.setText("Millihertz");                 textViewConversionShortform.setText("mHz");
                break;
            case "Microhertz -μHz":
                textconversionFrom.setText("Microhertz");                 textViewConversionShortform.setText("μHz");
                break;
            case "Nanohertz -nHz":
                textconversionFrom.setText("Nanohertz");                 textViewConversionShortform.setText("nHz");
                break;
            case "Picohertz -pHz":
                textconversionFrom.setText("Picohertz");                 textViewConversionShortform.setText("pHz");
                break;
            case "Femtohertz -fHz":
                textconversionFrom.setText("Femtohertz");                 textViewConversionShortform.setText("fHz");
                break;
            case "Attohertz -aHz":
                textconversionFrom.setText("Attohertz");                 textViewConversionShortform.setText("aHz");
                break;
            case "Cycle/second -c/s":
                textconversionFrom.setText("Cycle/second ");                 textViewConversionShortform.setText("c/s");
                break;
            case "Wavelength in exametres -Em":
                textconversionFrom.setText("Wavelength in exametres ");                 textViewConversionShortform.setText("Em");
                break;
            case "Wavelength in petametres -Pm":
                textconversionFrom.setText("Wavelength in petametres ");                 textViewConversionShortform.setText("Pm");
                break;
            case "Wavelength in terametres -Tm":
                textconversionFrom.setText("Wavelength in terametres ");                 textViewConversionShortform.setText("Tm");
                break;
            case "Wavelength in gigametres -Gm":
                textconversionFrom.setText("Wavelength in gigametres ");                 textViewConversionShortform.setText("Gm");
                break;
            case "Wavelength in megametres -Mm":
                textconversionFrom.setText("Wavelength in megametres ");                 textViewConversionShortform.setText("Mm");
                break;
            case "Wavelength in kilometres -km":
                textconversionFrom.setText("Wavelength in kilometres ");                 textViewConversionShortform.setText("km");
                break;
            case "Wavelength in hectometres -hm":
                textconversionFrom.setText("Wavelength in hectometres ");                 textViewConversionShortform.setText("hm");
                break;
            case "Wavelength in dekametres -dam":
                textconversionFrom.setText("Wavelength in dekametres ");                 textViewConversionShortform.setText("dam");
                break;
            case "Wavelength in metres -m":
                textconversionFrom.setText("Wavelength in metres ");                 textViewConversionShortform.setText("m");
                break;
            case "Wavelength in decimetres -dm":
                textconversionFrom.setText("Wavelength in decimetres ");                 textViewConversionShortform.setText("dm");
                break;
            case "Wavelength in centimetres -cm":
                textconversionFrom.setText("Wavelength in centimetres ");                 textViewConversionShortform.setText("cm");
                break;
            case "Wavelength in millimetres -mm":
                textconversionFrom.setText("Wavelength in millimetres ");                 textViewConversionShortform.setText("mm");
                break;
            case "Wavelength in micrometres -μm":
                textconversionFrom.setText("Wavelength in micrometres ");                 textViewConversionShortform.setText("μm");
                break;
            case "Electron Compton wavelength -e-":
                textconversionFrom.setText("Electron Compton wavelength ");                 textViewConversionShortform.setText("e-");
                break;
            case "Proton Compton wavelength -p":
                textconversionFrom.setText("Proton Compton wavelength ");                 textViewConversionShortform.setText("p");
                break;
            case "Neutron Compton wavelength -n":
                textconversionFrom.setText("Neutron Compton wavelength ");                 textViewConversionShortform.setText("n");
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

        FrequencyConverter c = new  FrequencyConverter(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<FrequencyConverter.ConversionResults> results = c.calculateFrequencyConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            FrequencyConverter.ConversionResults item = results.get(i);

            strhertz=String.valueOf(formatter.format(item.getHertz()));
            strexahertz=String.valueOf(formatter.format(item.getExahertz()));
            strpetahertz=String.valueOf(formatter.format(item.getPetahertz()));
            strterahertz=String.valueOf(formatter.format(item.getTerahertz()));
            strgigahertz=String.valueOf(formatter.format(item.getGigahertz()));
            strmegahertz=String.valueOf(formatter.format(item.getMegahertz()));
            strkilohertz=String.valueOf(formatter.format(item.getKilohertz()));
            strhectohertz=String.valueOf(formatter.format(item.getHectohertz()));
            strdekahertz=String.valueOf(formatter.format(item.getDekahertz()));
            strdecihertz=String.valueOf(formatter.format(item.getDecihertz()));
            strcentihertz=String.valueOf(formatter.format(item.getCentihertz()));
            strmillihertz=String.valueOf(formatter.format(item.getMillihertz()));
            strmicrohertz=String.valueOf(formatter.format(item.getMicrohertz()));
            strnanohertz=String.valueOf(formatter.format(item.getNanohertz()));
            strpicohertz=String.valueOf(formatter.format(item.getPicohertz()));
            strfemtohertz=String.valueOf(formatter.format(item.getFemtohertz()));
            strattohertz=String.valueOf(formatter.format(item.getAttohertz()));
            strcyclepersecond=String.valueOf(formatter.format(item.getCyclepersecond()));
            strwavelengthinexametres=String.valueOf(formatter.format(item.getWavelengthinexametres()));
            strwavelengthinpetametres=String.valueOf(formatter.format(item.getWavelengthinpetametres()));
            strwavelengthinterametres=String.valueOf(formatter.format(item.getWavelengthinterametres()));
            strwavelengthingigametres=String.valueOf(formatter.format(item.getWavelengthingigametres()));
            strwavelengthinmegametres=String.valueOf(formatter.format(item.getWavelengthinmegametres()));
            strwavelengthinkilometres=String.valueOf(formatter.format(item.getWavelengthinkilometres()));
            strwavelengthinhectometres=String.valueOf(formatter.format(item.getWavelengthinhectometres()));
            strwavelengthindekametres=String.valueOf(formatter.format(item.getWavelengthindekametres()));
            strwavelengthinmetres=String.valueOf(formatter.format(item.getWavelengthinmetres()));
            strwavelengthindecimetres=String.valueOf(formatter.format(item.getWavelengthindecimetres()));
            strwavelengthincentimetres=String.valueOf(formatter.format(item.getWavelengthincentimetres()));
            strwavelengthinmillimetres=String.valueOf(formatter.format(item.getWavelengthinmillimetres()));
            strwavelengthinmicrometres=String.valueOf(formatter.format(item.getWavelengthinmicrometres()));
            strElectronComptonwavelength=String.valueOf(formatter.format(item.getElectronComptonwavelength()));
            strProtonComptonwavelength=String.valueOf(formatter.format(item.getProtonComptonwavelength()));
            strNeutronComptonwavelength=String.valueOf(formatter.format(item.getNeutronComptonwavelength()));

            list.add(new ItemList("Hz","Hertz ",strhertz,"Hz"));
            list.add(new ItemList("EHz","Exahertz ",strexahertz,"EHz"));
            list.add(new ItemList("PHz","Petahertz ",strpetahertz,"PHz"));
            list.add(new ItemList("THz","Terahertz ",strterahertz,"THz"));
            list.add(new ItemList("GHz","Gigahertz ",strgigahertz,"GHz"));
            list.add(new ItemList("MHz","Megahertz ",strmegahertz,"MHz"));
            list.add(new ItemList("kHz","Kilohertz ",strkilohertz,"kHz"));
            list.add(new ItemList("hHz","Hectohertz ",strhectohertz,"hHz"));
            list.add(new ItemList("daHz","Dekahertz ",strdekahertz,"daHz"));
            list.add(new ItemList("dHz","Decihertz ",strdecihertz,"dHz"));
            list.add(new ItemList("cHz","Centihertz ",strcentihertz,"cHz"));
            list.add(new ItemList("mHz","Millihertz ",strmillihertz,"mHz"));
            list.add(new ItemList("μHz","Microhertz ",strmicrohertz,"μHz"));
            list.add(new ItemList("nHz","Nanohertz ",strnanohertz,"nHz"));
            list.add(new ItemList("pHz","Picohertz ",strpicohertz,"pHz"));
            list.add(new ItemList("fHz","Femtohertz ",strfemtohertz,"fHz"));
            list.add(new ItemList("aHz","Attohertz ",strattohertz,"aHz"));
            list.add(new ItemList("c/s","Cycle/second ",strcyclepersecond,"c/s"));
            list.add(new ItemList("Em","Wavelength in exametres ",strwavelengthinexametres,"Em"));
            list.add(new ItemList("Pm","Wavelength in petametres ",strwavelengthinpetametres,"Pm"));
            list.add(new ItemList("Tm","Wavelength in terametres ",strwavelengthinterametres,"Tm"));
            list.add(new ItemList("Gm","Wavelength in gigametres ",strwavelengthingigametres,"Gm"));
            list.add(new ItemList("Mm","Wavelength in megametres ",strwavelengthinmegametres,"Mm"));
            list.add(new ItemList("km","Wavelength in kilometres ",strwavelengthinkilometres,"km"));
            list.add(new ItemList("hm","Wavelength in hectometres ",strwavelengthinhectometres,"hm"));
            list.add(new ItemList("dam","Wavelength in dekametres ",strwavelengthindekametres,"dam"));
            list.add(new ItemList("m","Wavelength in metres ",strwavelengthinmetres,"m"));
            list.add(new ItemList("dm","Wavelength in decimetres ",strwavelengthindecimetres,"dm"));
            list.add(new ItemList("cm","Wavelength in centimetres ",strwavelengthincentimetres,"cm"));
            list.add(new ItemList("mm","Wavelength in millimetres ",strwavelengthinmillimetres,"mm"));
            list.add(new ItemList("μm","Wavelength in micrometres ",strwavelengthinmicrometres,"μm"));
            list.add(new ItemList("e-","Electron Compton wavelength ",strElectronComptonwavelength,"e-"));
            list.add(new ItemList("p","Proton Compton wavelength ",strProtonComptonwavelength,"p"));
            list.add(new ItemList("n","Neutron Compton wavelength ",strNeutronComptonwavelength,"n"));

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
