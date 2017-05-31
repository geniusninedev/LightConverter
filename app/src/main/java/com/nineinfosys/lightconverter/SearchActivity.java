package com.nineinfosys.lightconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.nineinfosys.lightconverter.ConveterActivity.DigitalImageResolutionActivity;
import com.nineinfosys.lightconverter.ConveterActivity.FrequencyActivity;
import com.nineinfosys.lightconverter.ConveterActivity.IlluminationActivity;
import com.nineinfosys.lightconverter.ConveterActivity.LuminanceActivity;
import com.nineinfosys.lightconverter.ConveterActivity.LuminousIntensityActivity;


public class SearchActivity extends AppCompatActivity implements TextWatcher {


    // List view
    private ListView lv;

    private String selectedItem;
    // Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText inputSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //customize toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Search Unit");


        // Listview Data
        String listitem[] = {

                //digital image
                "Dot/meter -dot/m",
                "Dot/millimeter -dot/mm",
                "Dot/inch -dot/in",
                "Pixel/inch -pixel/in",

                //frequency
                "Hertz -Hz",
                "Exahertz -EHz",
                "Petahertz -PHz",
                "Terahertz -THz",
                "Gigahertz -GHz",
                "Megahertz -MHz",
                "Kilohertz -kHz",
                "Hectohertz -hHz",
                "Dekahertz -daHz",
                "Decihertz -dHz",
                "Centihertz -cHz",
                "Millihertz -mHz",
                "Microhertz -μHz",
                "Nanohertz -nHz",
                "Picohertz -pHz",
                "Femtohertz -fHz",
                "Attohertz -aHz",
                "Cycle/second -c/s",
                "Wavelength in exametres -Em",
                "Wavelength in petametres -Pm",
                "Wavelength in terametres -Tm",
                "Wavelength in gigametres -Gm",
                "Wavelength in megametres -Mm",
                "Wavelength in kilometres -km",
                "Wavelength in hectometres -hm",
                "Wavelength in dekametres -dam",
                "Wavelength in metres -m",
                "Wavelength in decimetres -dm",
                "Wavelength in centimetres -cm",
                "Wavelength in millimetres -mm",
                "Wavelength in micrometres -μm",
                "Electron Compton wavelength -e-",
                "Proton Compton wavelength -p",
                "Neutron Compton wavelength -n",

                //illumination
                "Lux -lx",
                "Meter-candle -m*c",
                "Centimeter-candle -cm*c",
                "Foot-candle -ft*c,fc",
                "Flame -fl",

                //luminanacne
                "Candela/square meter -cd/m^2",
                "Candela/square centimeter -cd/cm^2",
                "Candela/square foot -cd/ft^2",
                "Candela/square inch -cd/in^2",
                "Kilocandela/square meter -kcd/m^2",
                "Stilb -sb",
                "Lumen/sq. meter/steradian -l/m^2/srad",
                "Lumen/sq. cm/steradian -l/cm^2/srad",
                "Lumen/square foot/steradian -l/ft^2/srad",
                "Watt/sq. cm/steradian (at 555 nm) -W/cm^2/srad (at 555 nm)",
                "Nit -nt",
                "Millinit -mnt",
                "Lambert -L",
                "Millilambert -mL",
                "Foot-lambert -fL",
                "Apostilb -apo",
                "Blondel -blo",
                "Bril -br",
                "Skot -sk",

                //luminousintensity
                "Candle (international) -cd(international)",
                "Candle (German) -cd(German)",
                "Candle (UK) -cd(UK)",
                "Decimal candle -.cd",
                "Candle (pentane) -cd(pentane)",
                "Pentane candle (10 candle power) -pentane cd(10 cd power)",
                "Hefner candle -he cd",
                "Carcel unit -car u",
                "Bougie decimal -bo.",
                "Lumen/steradian -l/srad",



        };

        lv = (ListView) findViewById(R.id.list_view);
        inputSearch = (EditText) findViewById(R.id.inputSearch);

        // Adding items to listview
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name, listitem);
        lv.setAdapter(adapter);

        /*Collections.sort(lv, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        });*/

        inputSearch.addTextChangedListener(this);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView adapterView, View view, int position, long id) {

                //Do some more stuff here and launch new activity
                selectedItem = (String) adapterView.getItemAtPosition(position);
                //  Toast.makeText(SearchActivity.this,"Position"+selectedItem,Toast.LENGTH_LONG).show();
                switch (selectedItem) {

                    //digital image
                    case "Dot/meter -dot/m" : digitalimage(); break;
                    case "Dot/millimeter -dot/mm" : digitalimage(); break;
                    case "Dot/inch -dot/in" : digitalimage(); break;
                    case "Pixel/inch -pixel/in" : digitalimage(); break;

                    //frequency
                    case "Hertz -Hz" : frequency(); break;
                    case "Exahertz -EHz" : frequency(); break;
                    case "Petahertz -PHz" : frequency(); break;
                    case "Terahertz -THz" : frequency(); break;
                    case "Gigahertz -GHz" : frequency(); break;
                    case "Megahertz -MHz" : frequency(); break;
                    case "Kilohertz -kHz" : frequency(); break;
                    case "Hectohertz -hHz" : frequency(); break;
                    case "Dekahertz -daHz" : frequency(); break;
                    case "Decihertz -dHz" : frequency(); break;
                    case "Centihertz -cHz" : frequency(); break;
                    case "Millihertz -mHz" : frequency(); break;
                    case "Microhertz -μHz" : frequency(); break;
                    case "Nanohertz -nHz" : frequency(); break;
                    case "Picohertz -pHz" : frequency(); break;
                    case "Femtohertz -fHz" : frequency(); break;
                    case "Attohertz -aHz" : frequency(); break;
                    case "Cycle/second -c/s" : frequency(); break;
                    case "Wavelength in exametres -Em" : frequency(); break;
                    case "Wavelength in petametres -Pm" : frequency(); break;
                    case "Wavelength in terametres -Tm" : frequency(); break;
                    case "Wavelength in gigametres -Gm" : frequency(); break;
                    case "Wavelength in megametres -Mm" : frequency(); break;
                    case "Wavelength in kilometres -km" : frequency(); break;
                    case "Wavelength in hectometres -hm" : frequency(); break;
                    case "Wavelength in dekametres -dam" : frequency(); break;
                    case "Wavelength in metres -m" : frequency(); break;
                    case "Wavelength in decimetres -dm" : frequency(); break;
                    case "Wavelength in centimetres -cm" : frequency(); break;
                    case "Wavelength in millimetres -mm" : frequency(); break;
                    case "Wavelength in micrometres -μm" : frequency(); break;
                    case "Electron Compton wavelength -e-" : frequency(); break;
                    case "Proton Compton wavelength -p" : frequency(); break;
                    case "Neutron Compton wavelength -n" : frequency(); break;

                    //illumination
                    case "Lux -lx" : illumination(); break;
                    case "Meter-candle -m*c" : illumination(); break;
                    case "Centimeter-candle -cm*c" : illumination(); break;
                    case "Foot-candle -ft*c,fc" : illumination(); break;
                    case "Flame -fl" : illumination(); break;

                    //luminnance
                    case "Candela/square meter -cd/m^2" : luminanace(); break;
                    case "Candela/square centimeter -cd/cm^2" : luminanace(); break;
                    case "Candela/square foot -cd/ft^2" : luminanace(); break;
                    case "Candela/square inch -cd/in^2" : luminanace(); break;
                    case "Kilocandela/square meter -kcd/m^2" : luminanace(); break;
                    case "Stilb -sb" : luminanace(); break;
                    case "Lumen/sq. meter/steradian -l/m^2/srad" : luminanace(); break;
                    case "Lumen/sq. cm/steradian -l/cm^2/srad" : luminanace(); break;
                    case "Lumen/square foot/steradian -l/ft^2/srad" : luminanace(); break;
                    case "Watt/sq. cm/steradian (at 555 nm) -W/cm^2/srad (at 555 nm)" : luminanace(); break;
                    case "Nit -nt" : luminanace(); break;
                    case "Millinit -mnt" : luminanace(); break;
                    case "Lambert -L" : luminanace(); break;
                    case "Millilambert -mL" : luminanace(); break;
                    case "Foot-lambert -fL" : luminanace(); break;
                    case "Apostilb -apo" : luminanace(); break;
                    case "Blondel -blo" : luminanace(); break;
                    case "Bril -br" : luminanace(); break;
                    case "Skot -sk" : luminanace(); break;

                    //luminousintensity
                    case "Candle (international) -cd(international)" : luminousintensity(); break;
                    case "Candle (German) -cd(German)" : luminousintensity(); break;
                    case "Candle (UK) -cd(UK)" : luminousintensity(); break;
                    case "Decimal candle -.cd" : luminousintensity(); break;
                    case "Candle (pentane) -cd(pentane)" : luminousintensity(); break;
                    case "Pentane candle (10 candle power) -pentane cd(10 cd power)" : luminousintensity(); break;
                    case "Hefner candle -he cd" : luminousintensity(); break;
                    case "Carcel unit -car u" : luminousintensity(); break;
                    case "Bougie decimal -bo." : luminousintensity(); break;
                    case "Lumen/steradian -l/srad" : luminousintensity(); break;

                }
            }
        });
        }

    private void luminousintensity() {
        Intent i7=new Intent(SearchActivity.this,LuminousIntensityActivity.class);
        startActivity(i7);
    }

    private void luminanace() {
        Intent i7=new Intent(SearchActivity.this,LuminanceActivity.class);
        startActivity(i7);
    }

    private void illumination() {
        Intent i7=new Intent(SearchActivity.this,IlluminationActivity.class);
        startActivity(i7);
    }

    private void frequency() {
        Intent i7=new Intent(SearchActivity.this, FrequencyActivity.class);
        startActivity(i7);
    }

    private void digitalimage() {
        Intent i7=new Intent(SearchActivity.this, DigitalImageResolutionActivity.class);
        startActivity(i7);
    }



    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        SearchActivity.this.adapter.getFilter().filter(s);

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



