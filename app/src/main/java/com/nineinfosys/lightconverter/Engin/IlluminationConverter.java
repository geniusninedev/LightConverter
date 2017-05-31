package com.nineinfosys.lightconverter.Engin;

import java.util.ArrayList;


public class IlluminationConverter {
	private double lux,metercandle,centimetercandle,footcandle,flame,phot,nox,candelasteradiansqmeter,lumensquaremeter,lumensquarecentimeter,lumensquarefoot,wattsqcm;
	private double edtValue;
	private String conversionFrom;
	//private String conversionTo;
	public IlluminationConverter(String conversionFrom, double edtValue){
		// TODO Auto-generated constructor stub
		this.conversionFrom = conversionFrom;
		this.edtValue = edtValue;
	}
	public ArrayList<ConversionResults> calculateIlluminationConversion()
    {
    	
		ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
			
		ConversionResults results= new ConversionResults();
    		 	
		switch(conversionFrom)
		{
		case "Lux -lx":
			
			lux=(edtValue)*1;
			metercandle=(edtValue)*1;
			centimetercandle=(edtValue)*0.0001;
			footcandle=(edtValue)*0.09290304;
			flame=(edtValue)*0.02322576;
			phot=(edtValue)*0.0001;
			nox=(edtValue)*1000;
			candelasteradiansqmeter=(edtValue)*1;
			lumensquaremeter=(edtValue)*1;
			lumensquarecentimeter=(edtValue)*0.0001;
			lumensquarefoot=(edtValue)*0.09290304;
			wattsqcm=(edtValue)*1.464128843E-7;
			
			break;
			
		case "Meter-candle -m*c":
			
			lux=(edtValue)*1;
			metercandle=(edtValue)*1;
			centimetercandle=(edtValue)*0.0001;
			footcandle=(edtValue)*0.09290304;
			flame=(edtValue)*0.02322576;
			phot=(edtValue)*0.0001;
			nox=(edtValue)*1000;
			candelasteradiansqmeter=(edtValue)*1;
			lumensquaremeter=(edtValue)*1;
			lumensquarecentimeter=(edtValue)*0.0001;
			lumensquarefoot=(edtValue)*0.09290304;
			wattsqcm=(edtValue)*1.464128843E-7;
			
			break;
			
		case "Centimeter-candle -cm*c":
			
			lux=(edtValue)*10000;
			metercandle=(edtValue)*10000;
			centimetercandle=(edtValue)*1;
			footcandle=(edtValue)*929.0304;
			flame=(edtValue)*232.2576;
			phot=(edtValue)*1;
			nox=(edtValue)*10000000;
			candelasteradiansqmeter=(edtValue)*10000;
			lumensquaremeter=(edtValue)*10000;
			lumensquarecentimeter=(edtValue)*1;
			lumensquarefoot=(edtValue)*929.0304;
			wattsqcm=(edtValue)*0.0014641288;
			
			break;	
		case "Foot-candle -ft*c,fc":
			
			lux=(edtValue)*10.763910417;
			metercandle=(edtValue)*10.763910417;
			centimetercandle=(edtValue)*0.001076391;
			footcandle=(edtValue)*1;
			flame=(edtValue)*0.25;
			phot=(edtValue)*0.001076391;
			nox=(edtValue)*10763.910417;
			candelasteradiansqmeter=(edtValue)*10.763910417;
			lumensquaremeter=(edtValue)*10.763910417;
			lumensquarecentimeter=(edtValue)*0.001076391;
			lumensquarefoot=(edtValue)*1;
			wattsqcm=(edtValue)*0.000001576;
			
			break;	
		case "Flame -fl":
			
			lux=(edtValue)*43.055641667;
			metercandle=(edtValue)*43.055641667;
			centimetercandle=(edtValue)*0.0043055642;
			footcandle=(edtValue)*4;
			flame=(edtValue)*1;
			phot=(edtValue)*0.0043055642;
			nox=(edtValue)*43055.641667;
			candelasteradiansqmeter=(edtValue)*43.055641667;
			lumensquaremeter=(edtValue)*43.055641667;
			lumensquarecentimeter=(edtValue)*0.0043055642;
			lumensquarefoot=(edtValue)*4;
			wattsqcm=(edtValue)*0.0000063039;
			
			break;	
		case "Phot -ph":
			
			lux=(edtValue)*10000;
			metercandle=(edtValue)*10000;
			centimetercandle=(edtValue)*1;
			footcandle=(edtValue)*929.0304;
			flame=(edtValue)*232.2576;
			phot=(edtValue)*1;
			nox=(edtValue)*10000000;
			candelasteradiansqmeter=(edtValue)*10000;
			lumensquaremeter=(edtValue)*10000;
			lumensquarecentimeter=(edtValue)*1;
			lumensquarefoot=(edtValue)*929.0304;
			wattsqcm=(edtValue)*0.0014641288;
			
			break;
			
		case "Nox -nox":
			
			lux=(edtValue)*0.001;
			metercandle=(edtValue)*0.001;
			centimetercandle=(edtValue)*1.E-7;
			footcandle=(edtValue)*0.000092903;
			flame=(edtValue)*0.0000232258;
			phot=(edtValue)*1.E-7;
			nox=(edtValue)*1;
			candelasteradiansqmeter=(edtValue)*0.001;
			lumensquaremeter=(edtValue)*0.001;
			lumensquarecentimeter=(edtValue)*1.E-7;
			lumensquarefoot=(edtValue)*0.000092903;
			wattsqcm=(edtValue)*1.464128843E-10;
			
			break;		
			
		case "Candela steradian/sq. meter -cd srad/m^2":
			
			lux=(edtValue)*1;
			metercandle=(edtValue)*1;
			centimetercandle=(edtValue)*0.0001;
			footcandle=(edtValue)*0.09290304;
			flame=(edtValue)*0.02322576;
			phot=(edtValue)*0.0001;
			nox=(edtValue)*1000;
			candelasteradiansqmeter=(edtValue)*1;
			lumensquaremeter=(edtValue)*1;
			lumensquarecentimeter=(edtValue)*0.0001;
			lumensquarefoot=(edtValue)*0.09290304;
			wattsqcm=(edtValue)*1.464128843E-7;
			
			break;		
	case "Lumen/square meter -lm/m^2":
			
			lux=(edtValue)*1;
			metercandle=(edtValue)*1;
			centimetercandle=(edtValue)*0.0001;
			footcandle=(edtValue)*0.09290304;
			flame=(edtValue)*0.02322576;
			phot=(edtValue)*0.0001;
			nox=(edtValue)*1000;
			candelasteradiansqmeter=(edtValue)*1;
			lumensquaremeter=(edtValue)*1;
			lumensquarecentimeter=(edtValue)*0.0001;
			lumensquarefoot=(edtValue)*0.09290304;
			wattsqcm=(edtValue)*1.464128843E-7;
			
			break;	
		case "Lumen/square centimeter -lm/cm^2":
			
			lux=(edtValue)*10000;
			metercandle=(edtValue)*10000;
			centimetercandle=(edtValue)*1;
			footcandle=(edtValue)*929.0304;
			flame=(edtValue)*232.2576;
			phot=(edtValue)*1;
			nox=(edtValue)*10000000;
			candelasteradiansqmeter=(edtValue)*10000;
			lumensquaremeter=(edtValue)*10000;
			lumensquarecentimeter=(edtValue)*1;
			lumensquarefoot=(edtValue)*929.0304;
			wattsqcm=(edtValue)*0.0014641288;
			
			break;
			
		case "Lumen/square foot -lm/ft^2":
			
			lux=(edtValue)*10.763910417;
			metercandle=(edtValue)*10.763910417;
			centimetercandle=(edtValue)*0.001076391;
			footcandle=(edtValue)*1;
			flame=(edtValue)*0.25;
			phot=(edtValue)*0.001076391;
			nox=(edtValue)*10763.910417;
			candelasteradiansqmeter=(edtValue)*10.763910417;
			lumensquaremeter=(edtValue)*10.763910417;
			lumensquarecentimeter=(edtValue)*0.001076391;
			lumensquarefoot=(edtValue)*1;
			wattsqcm=(edtValue)*0.000001576;
			
			break;		
			
		case "Watt/sq. cm (at 555 nm) -W/cm^2(at 555 nm)":
			
			lux=(edtValue)*6830000;
			metercandle=(edtValue)*6830000;
			centimetercandle=(edtValue)*683;
			footcandle=(edtValue)*634527.7632;
			flame=(edtValue)*158631.9408;
			phot=(edtValue)*683;
			nox=(edtValue)*6830000000.0000000000;
			candelasteradiansqmeter=(edtValue)*6830000;
			lumensquaremeter=(edtValue)*6830000;
			lumensquarecentimeter=(edtValue)*683;
			lumensquarefoot=(edtValue)*634527.7632;
			wattsqcm=(edtValue)*1;
			
			break;		
		case "Default":
			break;
			
		}
		 results.setLux(lux);
		 results.setMetercandle(metercandle);
		 results.setCentimetercandle(centimetercandle);
		 results.setFootcandle(footcandle);
		 results.setFlame(flame);
		 results.setPhot(phot);
		 results.setNox(nox);
		 results.setCandelasteradiansqmeter(candelasteradiansqmeter);
		 results.setLumensquaremeter(lumensquaremeter);
		 results.setLumensquarecentimeter(lumensquarecentimeter);
		 results.setLumensquarefoot(lumensquarefoot);
		 results.setWattsqcm(wattsqcm);
		 converterArray.add(results);
		return converterArray;
}

public 	class ConversionResults{
		private double lux,metercandle,centimetercandle,footcandle,flame,phot,nox,candelasteradiansqmeter,lumensquaremeter,lumensquarecentimeter,lumensquarefoot,wattsqcm;

		public double getLux() {
			return lux;
		}

		public void setLux(double lux) {
			this.lux = lux;
		}

		public double getMetercandle() {
			return metercandle;
		}

		public void setMetercandle(double metercandle) {
			this.metercandle = metercandle;
		}

		public double getCentimetercandle() {
			return centimetercandle;
		}

		public void setCentimetercandle(double centimetercandle) {
			this.centimetercandle = centimetercandle;
		}

		public double getFootcandle() {
			return footcandle;
		}

		public void setFootcandle(double footcandle) {
			this.footcandle = footcandle;
		}

		public double getFlame() {
			return flame;
		}

		public void setFlame(double flame) {
			this.flame = flame;
		}

		public double getPhot() {
			return phot;
		}

		public void setPhot(double phot) {
			this.phot = phot;
		}

		public double getNox() {
			return nox;
		}

		public void setNox(double nox) {
			this.nox = nox;
		}

		public double getCandelasteradiansqmeter() {
			return candelasteradiansqmeter;
		}

		public void setCandelasteradiansqmeter(double candelasteradiansqmeter) {
			this.candelasteradiansqmeter = candelasteradiansqmeter;
		}

		public double getLumensquaremeter() {
			return lumensquaremeter;
		}

		public void setLumensquaremeter(double lumensquaremeter) {
			this.lumensquaremeter = lumensquaremeter;
		}

		public double getLumensquarecentimeter() {
			return lumensquarecentimeter;
		}

		public void setLumensquarecentimeter(double lumensquarecentimeter) {
			this.lumensquarecentimeter = lumensquarecentimeter;
		}

		public double getLumensquarefoot() {
			return lumensquarefoot;
		}

		public void setLumensquarefoot(double lumensquarefoot) {
			this.lumensquarefoot = lumensquarefoot;
		}

		public double getWattsqcm() {
			return wattsqcm;
		}

		public void setWattsqcm(double wattsqcm) {
			this.wattsqcm = wattsqcm;
		}
	}
}