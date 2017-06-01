package com.nineinfosys.lightconverter.ConveterActivity;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.nineinfosys.lightconverter.ConveterActivityList.ConversionFrequencyListActivity;
import com.nineinfosys.lightconverter.Engin.FrequencyConverter;
import com.nineinfosys.lightconverter.R;
import com.nineinfosys.lightconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class FrequencyActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;

    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    List<String> listtempFirstfrom, listFirsttempTo, listtempfrom, listtempTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 17;
    private int allunit = 34;
    DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;

    FrequencyConverter.ConversionResults item;
   private String strhertz=null,strexahertz=null,strpetahertz=null,strterahertz=null,strgigahertz=null,strmegahertz=null,strkilohertz=null,strhectohertz=null,strdekahertz=null,strdecihertz=null,
            strcentihertz=null,strmillihertz=null,strmicrohertz=null,strnanohertz=null,strpicohertz=null,strfemtohertz =null,strattohertz=null,strcyclepersecond=null,strwavelengthinexametres=null,
            strwavelengthinpetametres=null,strwavelengthinterametres=null,strwavelengthingigametres=null,strwavelengthinmegametres=null,strwavelengthinkilometres =null,strwavelengthinhectometres=null,
            strwavelengthindekametres=null,strwavelengthinmetres=null,strwavelengthindecimetres=null,strwavelengthincentimetres=null,strwavelengthinmillimetres=null,strwavelengthinmicrometres =null,
            strElectronComptonwavelength=null,strProtonComptonwavelength=null,strNeutronComptonwavelength=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#db290d")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Frequency Wavelength");
        formatsetting();

        MobileAds.initialize(FrequencyActivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverter);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //initalization of tools and variables
        spinnerConvertFrom = (Spinner) findViewById(R.id.spinnerConvertFrom);
        spinnerConvertTo = (Spinner) findViewById(R.id.spinnerConvertTo);
        textViewBasicUnit = (TextView) findViewById(R.id.textViewBasicUnit);
        textViewAllUnit = (TextView) findViewById(R.id.textViewAllUnit);
        textViewConvert=(TextView) findViewById(R.id.buttonUnitConverter);
        editTextValue = (EditText) findViewById(R.id.edittextFrom);
        editTextValueTo = (EditText) findViewById(R.id.edittextTo);
        buttonCopy = (FloatingActionButton) findViewById(R.id.button_copy);
        buttonList = (FloatingActionButton) findViewById(R.id.button_list_fullreport);
        buttonShare = (FloatingActionButton) findViewById(R.id.button_list_share);
        buttonMail = (FloatingActionButton) findViewById(R.id.button_list_mail);
        switchChangeType = (SwitchCompat) findViewById(R.id.switchButton);

        //changing color dynamically
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedorange)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedorange)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedorange)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedorange)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedorange)));
       // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedorange)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#a10000"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listtempFirstfrom = new ArrayList<String>();
        listFirsttempTo = new ArrayList<String>();


        //for first time running spinner
        listtempFirstfrom.add("Cycle/second -c/s");
        listtempFirstfrom.add("Wavelength in exametres -Em");
        listtempFirstfrom.add("Wavelength in petametres -Pm");
        listtempFirstfrom.add("Wavelength in terametres -Tm");
        listtempFirstfrom.add("Gigahertz -GHz");
        listtempFirstfrom.add("Hertz -Hz");
        listtempFirstfrom.add("Kilohertz -kHz");
        listtempFirstfrom.add("Megahertz -MHz");
        listtempFirstfrom.add("Petahertz -PHz");
        listtempFirstfrom.add("Wavelength in gigametres -Gm");
        listtempFirstfrom.add("Wavelength in megametres -Mm");
        listtempFirstfrom.add("Wavelength in kilometres -km");
        listtempFirstfrom.add("Wavelength in hectometres -hm");
        listtempFirstfrom.add("Wavelength in dekametres -dam");
        listtempFirstfrom.add("Wavelength in metres -m");
        listtempFirstfrom.add("Wavelength in decimetres -dm");
        listtempFirstfrom.add("Terahertz -THz");

        //for first time running spinner
        listFirsttempTo.add("Cycle/second -c/s");
        listFirsttempTo.add("Wavelength in exametres -Em");
        listFirsttempTo.add("Wavelength in petametres -Pm");
        listFirsttempTo.add("Wavelength in terametres -Tm");
        listFirsttempTo.add("Gigahertz -GHz");
        listFirsttempTo.add("Hertz -Hz");
        listFirsttempTo.add("Kilohertz -kHz");
        listFirsttempTo.add("Megahertz -MHz");
        listFirsttempTo.add("Petahertz -PHz");
        listFirsttempTo.add("Wavelength in gigametres -Gm");
        listFirsttempTo.add("Wavelength in megametres -Mm");
        listFirsttempTo.add("Wavelength in kilometres -km");
        listFirsttempTo.add("Wavelength in hectometres -hm");
        listFirsttempTo.add("Wavelength in dekametres -dam");
        listFirsttempTo.add("Wavelength in metres -m");
        listFirsttempTo.add("Wavelength in decimetres -dm");
        listFirsttempTo.add("Terahertz -THz");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(FrequencyActivity.this, android.R.layout.simple_spinner_item, listtempFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(FrequencyActivity.this, android.R.layout.simple_spinner_item, listFirsttempTo);


        // Drop down layout style - list view with radio button
        Adapter.setDropDownViewResource(android.R.layout.simple_list_item_checked);
        AdapterTempTo.setDropDownViewResource(android.R.layout.simple_list_item_checked);

        // attaching data adapter to spinner
        spinnerConvertFrom.setAdapter(Adapter);
        spinnerConvertTo.setAdapter(AdapterTempTo);

        //switch converttype
        switchChangeType.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                listtempfrom = new ArrayList<String>();
                listtempTo = new ArrayList<String>();
                String stringSwitchSate = String.valueOf(isChecked);
                String strBasic = "Basic";
                String strAdvance = "All";
                switch (stringSwitchSate) {

                    case "false":
                        Snackbar.make(buttonView, "You switched to " + strBasic + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Cycle/second -c/s");
                        listtempfrom.add("Wavelength in exametres -Em");
                        listtempfrom.add("Wavelength in petametres -Pm");
                        listtempfrom.add("Wavelength in terametres -Tm");
                        listtempfrom.add("Gigahertz -GHz");
                        listtempfrom.add("Hertz -Hz");
                        listtempfrom.add("Kilohertz -kHz");
                        listtempfrom.add("Megahertz -MHz");
                        listtempfrom.add("Petahertz -PHz");
                        listtempfrom.add("Wavelength in gigametres -Gm");
                        listtempfrom.add("Wavelength in megametres -Mm");
                        listtempfrom.add("Wavelength in kilometres -km");
                        listtempfrom.add("Wavelength in hectometres -hm");
                        listtempfrom.add("Wavelength in dekametres -dam");
                        listtempfrom.add("Wavelength in metres -m");
                        listtempfrom.add("Wavelength in decimetres -dm");
                        listtempfrom.add("Terahertz -THz");


                        //2 spinner
                        listtempTo.add("Cycle/second -c/s");
                        listtempTo.add("Wavelength in exametres -Em");
                        listtempTo.add("Wavelength in petametres -Pm");
                        listtempTo.add("Wavelength in terametres -Tm");
                        listtempTo.add("Gigahertz -GHz");
                        listtempTo.add("Hertz -Hz");
                        listtempTo.add("Kilohertz -kHz");
                        listtempTo.add("Megahertz -MHz");
                        listtempTo.add("Petahertz -PHz");
                        listtempTo.add("Wavelength in gigametres -Gm");
                        listtempTo.add("Wavelength in megametres -Mm");
                        listtempTo.add("Wavelength in kilometres -km");
                        listtempTo.add("Wavelength in hectometres -hm");
                        listtempTo.add("Wavelength in dekametres -dam");
                        listtempTo.add("Wavelength in metres -m");
                        listtempTo.add("Wavelength in decimetres -dm");
                        listtempTo.add("Terahertz -THz");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Hertz -Hz");
                        listtempfrom.add("Exahertz -EHz");
                        listtempfrom.add("Petahertz -PHz");
                        listtempfrom.add("Terahertz -THz");
                        listtempfrom.add("Gigahertz -GHz");
                        listtempfrom.add("Megahertz -MHz");
                        listtempfrom.add("Kilohertz -kHz");
                        listtempfrom.add("Hectohertz -hHz");
                        listtempfrom.add("Dekahertz -daHz");
                        listtempfrom.add("Decihertz -dHz");
                        listtempfrom.add("Centihertz -cHz");
                        listtempfrom.add("Millihertz -mHz");
                        listtempfrom.add("Microhertz -μHz");
                        listtempfrom.add("Nanohertz -nHz");
                        listtempfrom.add("Picohertz -pHz");
                        listtempfrom.add("Femtohertz -fHz");
                        listtempfrom.add("Attohertz -aHz");
                        listtempfrom.add("Cycle/second -c/s");
                        listtempfrom.add("Wavelength in exametres -Em");
                        listtempfrom.add("Wavelength in petametres -Pm");
                        listtempfrom.add("Wavelength in terametres -Tm");
                        listtempfrom.add("Wavelength in gigametres -Gm");
                        listtempfrom.add("Wavelength in megametres -Mm");
                        listtempfrom.add("Wavelength in kilometres -km");
                        listtempfrom.add("Wavelength in hectometres -hm");
                        listtempfrom.add("Wavelength in dekametres -dam");
                        listtempfrom.add("Wavelength in metres -m");
                        listtempfrom.add("Wavelength in decimetres -dm");
                        listtempfrom.add("Wavelength in centimetres -cm");
                        listtempfrom.add("Wavelength in millimetres -mm");
                        listtempfrom.add("Wavelength in micrometres -μm");
                        listtempfrom.add("Electron Compton wavelength -e-");
                        listtempfrom.add("Proton Compton wavelength -p");
                        listtempfrom.add("Neutron Compton wavelength -n");


                        //second spinner
                        listtempTo.add("Hertz -Hz");
                        listtempTo.add("Exahertz -EHz");
                        listtempTo.add("Petahertz -PHz");
                        listtempTo.add("Terahertz -THz");
                        listtempTo.add("Gigahertz -GHz");
                        listtempTo.add("Megahertz -MHz");
                        listtempTo.add("Kilohertz -kHz");
                        listtempTo.add("Hectohertz -hHz");
                        listtempTo.add("Dekahertz -daHz");
                        listtempTo.add("Decihertz -dHz");
                        listtempTo.add("Centihertz -cHz");
                        listtempTo.add("Millihertz -mHz");
                        listtempTo.add("Microhertz -μHz");
                        listtempTo.add("Nanohertz -nHz");
                        listtempTo.add("Picohertz -pHz");
                        listtempTo.add("Femtohertz -fHz");
                        listtempTo.add("Attohertz -aHz");
                        listtempTo.add("Cycle/second -c/s");
                        listtempTo.add("Wavelength in exametres -Em");
                        listtempTo.add("Wavelength in petametres -Pm");
                        listtempTo.add("Wavelength in terametres -Tm");
                        listtempTo.add("Wavelength in gigametres -Gm");
                        listtempTo.add("Wavelength in megametres -Mm");
                        listtempTo.add("Wavelength in kilometres -km");
                        listtempTo.add("Wavelength in hectometres -hm");
                        listtempTo.add("Wavelength in dekametres -dam");
                        listtempTo.add("Wavelength in metres -m");
                        listtempTo.add("Wavelength in decimetres -dm");
                        listtempTo.add("Wavelength in centimetres -cm");
                        listtempTo.add("Wavelength in millimetres -mm");
                        listtempTo.add("Wavelength in micrometres -μm");
                        listtempTo.add("Electron Compton wavelength -e-");
                        listtempTo.add("Proton Compton wavelength -p");
                        listtempTo.add("Neutron Compton wavelength -n");

                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(FrequencyActivity.this, android.R.layout.simple_spinner_item, listtempfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(FrequencyActivity.this, android.R.layout.simple_spinner_item, listtempTo);


                // Drop down layout style - list view with radio button
                Adapter2.setDropDownViewResource(android.R.layout.simple_list_item_checked);
                AdapterTempTo2.setDropDownViewResource(android.R.layout.simple_list_item_checked);

                // attaching data adapter to spinner
                spinnerConvertFrom.setAdapter(Adapter2);
                spinnerConvertTo.setAdapter(AdapterTempTo2);

            }
        });

        editTextValue.addTextChangedListener(this);
        buttonList.setOnClickListener(this);
        buttonShare.setOnClickListener(this);
        buttonMail.setOnClickListener(this);
        buttonCopy.setOnClickListener(this);
        textViewConvert.setOnClickListener(this);


        spinnerConvertFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (editTextValue.getText().toString().trim().equals("")) {
                    Snackbar.make(adapterView, "Provide Unit Value for Conversion", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                } else {
                    doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
                    stringSpinnerFrom = spinnerConvertFrom.getSelectedItem().toString().trim();
                    stringSpinnerTo = spinnerConvertTo.getSelectedItem().toString().trim();

                    calcualteValue(stringSpinnerFrom, stringSpinnerTo, doubleEdittextvalue);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinnerConvertTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (editTextValue.getText().toString().trim().equals("")) {
                    Snackbar.make(adapterView, "Provide Unit Value for Conversion", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                } else {
                    doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
                    stringSpinnerFrom = spinnerConvertFrom.getSelectedItem().toString().trim();
                    stringSpinnerTo = spinnerConvertTo.getSelectedItem().toString().trim();

                    calcualteValue(stringSpinnerFrom, stringSpinnerTo, doubleEdittextvalue);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    private void formatsetting() {
        //fetching value from sharedpreference
        SharedPreferences sharedPreferences = this.getSharedPreferences(Settings.SHARED_PREF_NAME, Context.MODE_PRIVATE);
        //Fetching thepatient_mobile_Number value form sharedpreferences
        String FormattedString = sharedPreferences.getString(Settings.Format_Selected_SHARED_PREF, "Thousands separator");
        String DecimalplaceString = sharedPreferences.getString(Settings.Decimal_Place_Selected_SHARED_PREF, "2");
        Settings settings = new Settings(FormattedString, DecimalplaceString);
        formatter = settings.setting();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonUnitConverter:
                //switch spinner value
                int spinner1Index = spinnerConvertFrom.getSelectedItemPosition();
                spinnerConvertFrom.setSelection(spinnerConvertTo.getSelectedItemPosition());
                spinnerConvertTo.setSelection(spinner1Index );
                break;

            case R.id.button_list_fullreport:
                doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
                Intent i = new Intent(this, ConversionFrequencyListActivity.class);
                i.putExtra("stringSpinnerFrom", stringSpinnerFrom);
                i.putExtra("doubleEdittextvalue", doubleEdittextvalue);
                startActivity(i);
                break;

            case R.id.button_copy:
                String text = editTextValueTo.getText().toString().trim();
                android.content.ClipboardManager clipboardMgr = (android.content.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Copied text", text);
                clipboardMgr.setPrimaryClip(clip);
                Snackbar.make(v, "Conversion Value Copied", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                break;

            case R.id.button_list_share:
                String textTo = editTextValueTo.getText().toString().trim();
                String textFrom = editTextValueTo.getText().toString().trim();

                String shareMessage = textFrom + " " + stringSpinnerFrom + ": " + textTo + " " + stringSpinnerTo;

                try {
                    Intent share = new Intent();
                    share.setAction("android.intent.action.SEND");
                    share.setType("text/plain");
                    share.putExtra("android.intent.extra.TEXT", shareMessage);
                    startActivity(Intent.createChooser(share, ""));

                } catch (Exception e) {
                    e.printStackTrace();
                }
             break;

            case R.id.button_list_mail:
                String textmailTo = editTextValueTo.getText().toString().trim();
                String textmailFrom = editTextValueTo.getText().toString().trim();
                String message = textmailTo + " " + stringSpinnerFrom + " :  " + textmailFrom + "  " + stringSpinnerTo;
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{});
                email.putExtra(Intent.EXTRA_SUBJECT, "Conversion Details");
                email.putExtra(Intent.EXTRA_TEXT, message);
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Select Email Client"));
                break;

        }

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

        try {

            doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
            stringSpinnerFrom = spinnerConvertFrom.getSelectedItem().toString().trim();
            stringSpinnerTo = spinnerConvertTo.getSelectedItem().toString().trim();
            calcualteValue(stringSpinnerFrom, stringSpinnerTo, doubleEdittextvalue);

        } catch (NumberFormatException e) {
            doubleEdittextvalue = 0;

        }


    }

    public void calcualteValue(String strSpinnerFromvalue1, String strSpinnerTovalue2, double doubleEdittextvalue1) {



        try {

            FrequencyConverter c = new FrequencyConverter(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<FrequencyConverter.ConversionResults> results = c.calculateFrequencyConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

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


                switch (strSpinnerFromvalue1) {
                    case "Hertz -Hz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Exahertz -EHz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Petahertz -PHz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Terahertz -THz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gigahertz -GHz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Megahertz -MHz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilohertz -kHz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hectohertz -hHz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dekahertz -daHz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Decihertz -dHz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Centihertz -cHz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millihertz -mHz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Microhertz -μHz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nanohertz -nHz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Picohertz -pHz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Femtohertz -fHz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Attohertz -aHz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cycle/second -c/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Wavelength in exametres -Em":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Wavelength in petametres -Pm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Wavelength in terametres -Tm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Wavelength in gigametres -Gm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Wavelength in megametres -Mm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Wavelength in kilometres -km":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Wavelength in hectometres -hm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Wavelength in dekametres -dam":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Wavelength in metres -m":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Wavelength in decimetres -dm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Wavelength in centimetres -cm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Wavelength in millimetres -mm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Wavelength in micrometres -μm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Electron Compton wavelength -e-":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Proton Compton wavelength -p":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Neutron Compton wavelength -n":
                        conversion(strSpinnerTovalue2);
                        break;
                }
            }


        } catch (NumberFormatException e) {
            doubleEdittextvalue = 0;

        }
    }

    private void conversion(String strSpinnerTovalue2) {

        switch (strSpinnerTovalue2) {
            case "Hertz -Hz":
                editTextValueTo.setText(strhertz);
                break;
            case "Exahertz -EHz":
                editTextValueTo.setText(strexahertz);
                break;
            case "Petahertz -PHz":
                editTextValueTo.setText(strpetahertz);
                break;
            case "Terahertz -THz":
                editTextValueTo.setText(strterahertz);
                break;
            case "Gigahertz -GHz":
                editTextValueTo.setText(strgigahertz);
                break;
            case "Megahertz -MHz":
                editTextValueTo.setText(strmegahertz);
                break;
            case "Kilohertz -kHz":
                editTextValueTo.setText(strkilohertz);
                break;
            case "Hectohertz -hHz":
                editTextValueTo.setText(strhectohertz);
                break;
            case "Dekahertz -daHz":
                editTextValueTo.setText(strdekahertz);
                break;
            case "Decihertz -dHz":
                editTextValueTo.setText(strdecihertz);
                break;
            case "Centihertz -cHz":
                editTextValueTo.setText(strcentihertz);
                break;
            case "Millihertz -mHz":
                editTextValueTo.setText(strmillihertz);
                break;
            case "Microhertz -μHz":
                editTextValueTo.setText(strmicrohertz);
                break;
            case "Nanohertz -nHz":
                editTextValueTo.setText(strnanohertz);
                break;
            case "Picohertz -pHz":
                editTextValueTo.setText(strpicohertz);
                break;
            case "Femtohertz -fHz":
                editTextValueTo.setText(strfemtohertz);
                break;
            case "Attohertz -aHz":
                editTextValueTo.setText(strattohertz);
                break;
            case "Cycle/second -c/s":
                editTextValueTo.setText(strcyclepersecond);
                break;
            case "Wavelength in exametres -Em":
                editTextValueTo.setText(strwavelengthinexametres);
                break;
            case "Wavelength in petametres -Pm":
                editTextValueTo.setText(strwavelengthinpetametres);
                break;
            case "Wavelength in terametres -Tm":
                editTextValueTo.setText(strwavelengthinterametres);
                break;
            case "Wavelength in gigametres -Gm":
                editTextValueTo.setText(strwavelengthingigametres);
                break;
            case "Wavelength in megametres -Mm":
                editTextValueTo.setText(strwavelengthinmegametres);
                break;
            case "Wavelength in kilometres -km":
                editTextValueTo.setText(strwavelengthinkilometres);
                break;
            case "Wavelength in hectometres -hm":
                editTextValueTo.setText(strwavelengthinhectometres);
                break;
            case "Wavelength in dekametres -dam":
                editTextValueTo.setText(strwavelengthindekametres);
                break;
            case "Wavelength in metres -m":
                editTextValueTo.setText(strwavelengthinmetres);
                break;
            case "Wavelength in decimetres -dm":
                editTextValueTo.setText(strwavelengthindecimetres);
                break;
            case "Wavelength in centimetres -cm":
                editTextValueTo.setText(strwavelengthincentimetres);
                break;
            case "Wavelength in millimetres -mm":
                editTextValueTo.setText(strwavelengthinmillimetres);
                break;
            case "Wavelength in micrometres -μm":
                editTextValueTo.setText(strwavelengthinmicrometres);
                break;
            case "Electron Compton wavelength -e-":
                editTextValueTo.setText(strElectronComptonwavelength);
                break;
            case "Proton Compton wavelength -p":
                editTextValueTo.setText(strProtonComptonwavelength);
                break;
            case "Neutron Compton wavelength -n":
                editTextValueTo.setText(strNeutronComptonwavelength);
                break;
        }


    }


    @Override
    public void afterTextChanged(Editable s) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == android.R.id.home) {

            this.finish();
        }

        return super.onOptionsItemSelected(item);
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