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
import com.nineinfosys.lightconverter.ConveterActivityList.ConversionLuminanceListActivity;
import com.nineinfosys.lightconverter.Engin.Luminance;
import com.nineinfosys.lightconverter.R;
import com.nineinfosys.lightconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class LuminanceActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;
    private static final int REQUEST_CODE = 100;
    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    List<String> listtempFirstfrom, listFirsttempTo, listtempfrom, listtempTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 8;
    private int allunit = 19;
    DecimalFormat formatter = null;


    Luminance.ConversionResults item;
   private String strcandelasquaremeter=null,strcandelasquarecentimeter=null,strcandelasquarefoot=null,strcandelasquareinch=null,strkilocandelasquaremeter=null,strstilb=null,strlumensqmetersteradian=null,
            strlumensqcmsteradian=null,strlumensquarefootsteradian=null,strwattsqcmsteradian=null,strnit=null,strmillinit=null,strlambert=null,strmillilambert=null,strfootlambert=null,strapostilb=null,
            strblondel=null,strbril=null,strskot=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#6fd684")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Luminanace ");

        formatsetting();

        MobileAds.initialize(LuminanceActivity.this, getString(R.string.ads_app_id));
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
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorgreen)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorgreen)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorgreen)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorgreen)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorgreen)));
       // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorgreen)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#52ae64"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listtempFirstfrom = new ArrayList<String>();
        listFirsttempTo = new ArrayList<String>();


        //for first time running spinner
        listtempFirstfrom.add("Candela/square centimeter -cd/cm^2");
        listtempFirstfrom.add("Candela/square foot -cd/ft^2");
        listtempFirstfrom.add("Candela/square meter -cd/m^2");
        listtempFirstfrom.add("Foot-lambert -fL");
        listtempFirstfrom.add("Kilocandela/square meter -kcd/m^2");
        listtempFirstfrom.add("Lambert -L");
        listtempFirstfrom.add("Nit -nt");
        listtempFirstfrom.add("Stilb -sb");

        //for first time running spinner
        listFirsttempTo.add("Candela/square centimeter -cd/cm^2");
        listFirsttempTo.add("Candela/square foot -cd/ft^2");
        listFirsttempTo.add("Candela/square meter -cd/m^2");
        listFirsttempTo.add("Foot-lambert -fL");
        listFirsttempTo.add("Kilocandela/square meter -kcd/m^2");
        listFirsttempTo.add("Lambert -L");
        listFirsttempTo.add("Nit -nt");
        listFirsttempTo.add("Stilb -sb");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(LuminanceActivity.this, android.R.layout.simple_spinner_item, listtempFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(LuminanceActivity.this, android.R.layout.simple_spinner_item, listFirsttempTo);


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
                        listtempfrom.add("Candela/square centimeter -cd/cm^2");
                        listtempfrom.add("Candela/square foot -cd/ft^2");
                        listtempfrom.add("Candela/square meter -cd/m^2");
                        listtempfrom.add("Foot-lambert -fL");
                        listtempfrom.add("Kilocandela/square meter -kcd/m^2");
                        listtempfrom.add("Lambert -L");
                        listtempfrom.add("Nit -nt");
                        listtempfrom.add("Stilb -sb");


                        //2 spinner
                        listtempTo.add("Candela/square centimeter -cd/cm^2");
                        listtempTo.add("Candela/square foot -cd/ft^2");
                        listtempTo.add("Candela/square meter -cd/m^2");
                        listtempTo.add("Foot-lambert -fL");
                        listtempTo.add("Kilocandela/square meter -kcd/m^2");
                        listtempTo.add("Lambert -L");
                        listtempTo.add("Nit -nt");
                        listtempTo.add("Stilb -sb");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempfrom.add("Candela/square meter -cd/m^2");
                        listtempfrom.add("Candela/square centimeter -cd/cm^2");
                        listtempfrom.add("Candela/square foot -cd/ft^2");
                        listtempfrom.add("Candela/square inch -cd/in^2");
                        listtempfrom.add("Kilocandela/square meter -kcd/m^2");
                        listtempfrom.add("Stilb -sb");
                        listtempfrom.add("Lumen/sq. meter/steradian -l/m^2/srad");
                        listtempfrom.add("Lumen/sq. cm/steradian -l/cm^2/srad");
                        listtempfrom.add("Lumen/square foot/steradian -l/ft^2/srad");
                        listtempfrom.add("Watt/sq. cm/steradian (at 555 nm) -W/cm^2/srad (at 555 nm)");
                        listtempfrom.add("Nit -nt");
                        listtempfrom.add("Millinit -mnt");
                        listtempfrom.add("Lambert -L");
                        listtempfrom.add("Millilambert -mL");
                        listtempfrom.add("Foot-lambert -fL");
                        listtempfrom.add("Apostilb -apo");
                        listtempfrom.add("Blondel -blo");
                        listtempfrom.add("Bril -br");
                        listtempfrom.add("Skot -sk");


                        //second spinner
                        listtempTo.add("Candela/square meter -cd/m^2");
                        listtempTo.add("Candela/square centimeter -cd/cm^2");
                        listtempTo.add("Candela/square foot -cd/ft^2");
                        listtempTo.add("Candela/square inch -cd/in^2");
                        listtempTo.add("Kilocandela/square meter -kcd/m^2");
                        listtempTo.add("Stilb -sb");
                        listtempTo.add("Lumen/sq. meter/steradian -l/m^2/srad");
                        listtempTo.add("Lumen/sq. cm/steradian -l/cm^2/srad");
                        listtempTo.add("Lumen/square foot/steradian -l/ft^2/srad");
                        listtempTo.add("Watt/sq. cm/steradian (at 555 nm) -W/cm^2/srad (at 555 nm)");
                        listtempTo.add("Nit -nt");
                        listtempTo.add("Millinit -mnt");
                        listtempTo.add("Lambert -L");
                        listtempTo.add("Millilambert -mL");
                        listtempTo.add("Foot-lambert -fL");
                        listtempTo.add("Apostilb -apo");
                        listtempTo.add("Blondel -blo");
                        listtempTo.add("Bril -br");
                        listtempTo.add("Skot -sk");

                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(LuminanceActivity.this, android.R.layout.simple_spinner_item, listtempfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(LuminanceActivity.this, android.R.layout.simple_spinner_item, listtempTo);


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
                Intent i = new Intent(this, ConversionLuminanceListActivity.class);
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

            Luminance c = new Luminance(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<Luminance.ConversionResults> results = c.calculateinertiaConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

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


                switch (strSpinnerFromvalue1) {
                    case "Candela/square meter -cd/m^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Candela/square centimeter -cd/cm^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Candela/square foot -cd/ft^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Candela/square inch -cd/in^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilocandela/square meter -kcd/m^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Stilb -sb":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Lumen/sq. meter/steradian -l/m^2/srad":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Lumen/sq. cm/steradian -l/cm^2/srad":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Lumen/square foot/steradian -l/ft^2/srad":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Watt/sq. cm/steradian (at 555 nm) -W/cm^2/srad (at 555 nm)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nit -nt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millinit -mnt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Lambert -L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millilambert -mL":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Foot-lambert -fL":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Apostilb -apo":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Blondel -blo":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Bril -br":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Skot -sk":
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
            case "Candela/square meter -cd/m^2":
                editTextValueTo.setText(strcandelasquaremeter);
                break;
            case "Candela/square centimeter -cd/cm^2":
                editTextValueTo.setText(strcandelasquarecentimeter);
                break;
            case "Candela/square foot -cd/ft^2":
                editTextValueTo.setText(strcandelasquarefoot);
                break;
            case "Candela/square inch -cd/in^2":
                editTextValueTo.setText(strcandelasquareinch);
                break;
            case "Kilocandela/square meter -kcd/m^2":
                editTextValueTo.setText(strkilocandelasquaremeter);
                break;
            case "Stilb -sb":
                editTextValueTo.setText(strstilb);
                break;
            case "Lumen/sq. meter/steradian -l/m^2/srad":
                editTextValueTo.setText(strlumensqmetersteradian);
                break;
            case "Lumen/sq. cm/steradian -l/cm^2/srad":
                editTextValueTo.setText(strlumensqcmsteradian);
                break;
            case "Lumen/square foot/steradian -l/ft^2/srad":
                editTextValueTo.setText(strlumensquarefootsteradian);
                break;
            case "Watt/sq. cm/steradian (at 555 nm) -W/cm^2/srad (at 555 nm)":
                editTextValueTo.setText(strwattsqcmsteradian);
                break;
            case "Nit -nt":
                editTextValueTo.setText(strnit);
                break;
            case "Millinit -mnt":
                editTextValueTo.setText(strmillinit);
                break;
            case "Lambert -L":
                editTextValueTo.setText(strlambert);
                break;
            case "Millilambert -mL":
                editTextValueTo.setText(strmillilambert);
                break;
            case "Foot-lambert -fL":
                editTextValueTo.setText(strfootlambert);
                break;
            case "Apostilb -apo":
                editTextValueTo.setText(strapostilb);
                break;
            case "Blondel -blo":
                editTextValueTo.setText(strblondel);
                break;
            case "Bril -br":
                editTextValueTo.setText(strbril);
                break;
            case "Skot -sk":
                editTextValueTo.setText(strskot);
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