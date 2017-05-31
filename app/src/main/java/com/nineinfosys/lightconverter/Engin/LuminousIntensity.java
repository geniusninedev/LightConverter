package com.nineinfosys.lightconverter.Engin;

import java.util.ArrayList;


public class LuminousIntensity {
	private double candleinternational   , candleGerman   ,candleUK ,decimalcandle  ,candlepentane   , pentanecandlecandlepower   ,hefnercandle   ,carcelunit   , bougiedecimal  ,lumenpersteradian  ;
	private String conversionFrom;
	private double edtValue;
	
			
			public LuminousIntensity(String conversionFrom, double edtValue) {
				// TODO Auto-generated constructor stub
				this.conversionFrom = conversionFrom;
				this.edtValue = edtValue;
			}

			public ArrayList<ConversionResults> calculateLuminousIntensityConversion()
		    {
		    	
				ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
					
				ConversionResults results= new ConversionResults();
		    		 	
				switch(conversionFrom)
				{
				case "Candle (international) -cd(international)":
					
					candleinternational=(edtValue)*1;
					candleGerman=(edtValue)*0.95;
					candleUK=(edtValue)*0.96;
					decimalcandle=(edtValue)*1;
					candlepentane=(edtValue)*1;
					pentanecandlecandlepower=(edtValue)*0.1;
					hefnercandle=(edtValue)*1.111111111;
					carcelunit=(edtValue)*0.1040582726;
					bougiedecimal=(edtValue)*1;
					lumenpersteradian=(edtValue)*1;
				
					break;
					
					
	              case "Candle (German) -cd(German)":
					
					candleinternational=(edtValue)*1.0526315789;
					candleGerman=(edtValue)*1;
					candleUK=(edtValue)*1.0105263158;
					decimalcandle=(edtValue)*1.0526315789;
					candlepentane=(edtValue)*1.0526315789;
					pentanecandlecandlepower=(edtValue)*0.1052631579;
					hefnercandle=(edtValue)*1.1695906432;
					carcelunit=(edtValue)*0.1095350238;
					bougiedecimal=(edtValue)*1.0526315789;
					lumenpersteradian=(edtValue)*1.0526315789;
				
					break;
					
	case "Candle (UK) -cd(UK)":
					
					candleinternational=(edtValue)*1.0416666667;
					candleGerman=(edtValue)*0.9895833333;
					candleUK=(edtValue)*1;
					decimalcandle=(edtValue)*1.0416666667;
					candlepentane=(edtValue)*1.0416666667;
					pentanecandlecandlepower=(edtValue)*0.1041666667;
					hefnercandle=(edtValue)*1.1574074073;
					carcelunit=(edtValue)*0.108394034;
					bougiedecimal=(edtValue)*1.0416666667;
					lumenpersteradian=(edtValue)*1.0416666667;
				
					break;
					
					
					
					
	case "Decimal candle -.cd":
		
		candleinternational=(edtValue)*1;
		candleGerman=(edtValue)*0.95;
		candleUK=(edtValue)*0.96;
		decimalcandle=(edtValue)*1;
		candlepentane=(edtValue)*1;
		pentanecandlecandlepower=(edtValue)*0.1;
		hefnercandle=(edtValue)*1.111111111;
		carcelunit=(edtValue)*0.1040582726;
		bougiedecimal=(edtValue)*1;
		lumenpersteradian=(edtValue)*1;
	
		break;
		
		
		
		
		
	case "Candle (pentane) -cd(pentane)":
		
		candleinternational=(edtValue)*1;
		candleGerman=(edtValue)*0.95;
		candleUK=(edtValue)*0.96;
		decimalcandle=(edtValue)*1;
		candlepentane=(edtValue)*1;
		pentanecandlecandlepower=(edtValue)*0.1;
		hefnercandle=(edtValue)*1.111111111;
		carcelunit=(edtValue)*0.1040582726;
		bougiedecimal=(edtValue)*1;
		lumenpersteradian=(edtValue)*1;
	
		break;
		
		
		
		
		
	case "Pentane candle (10 candle power) -pentane cd(10 cd power)":
		
		candleinternational=(edtValue)*10;
		candleGerman=(edtValue)*9.5;
		candleUK=(edtValue)*9.6;
		decimalcandle=(edtValue)*10;
		candlepentane=(edtValue)*10;
		pentanecandlecandlepower=(edtValue)*1;
		hefnercandle=(edtValue)*11.11111111;
		carcelunit=(edtValue)*1.040582726;
		bougiedecimal=(edtValue)*10;
		lumenpersteradian=(edtValue)*10;
	
		break;
		
		
		
	case "Hefner candle -he cd":
		
		candleinternational=(edtValue)*0.9000000001;
		candleGerman=(edtValue)*0.8550000001;
		candleUK=(edtValue)*0.8640000001;
		decimalcandle=(edtValue)*0.9000000001;
		candlepentane=(edtValue)*0.9000000001;
		pentanecandlecandlepower=(edtValue)*0.09;
		hefnercandle=(edtValue)*1;
		carcelunit=(edtValue)*0.0936524453;
		bougiedecimal=(edtValue)*0.9000000001;
		lumenpersteradian=(edtValue)*0.9000000001;
	
		break;
		
		
	case "Carcel unit -car u":
		
		candleinternational=(edtValue)*9.610000003;
		candleGerman=(edtValue)*9.1295000029;
		candleUK=(edtValue)*9.2256000029;
		decimalcandle=(edtValue)*9.610000003;
		candlepentane=(edtValue)*9.610000003;
		pentanecandlecandlepower=(edtValue)*0.9610000003;
		hefnercandle=(edtValue)*10.67777778;
		carcelunit=(edtValue)*1;
		bougiedecimal=(edtValue)*9.610000003;
		lumenpersteradian=(edtValue)*9.610000003;
	
		break;
		
	case "Bougie decimal -bo.":
		
		candleinternational=(edtValue)*1;
		candleGerman=(edtValue)*0.95;
		candleUK=(edtValue)*0.96;
		decimalcandle=(edtValue)*1;
		candlepentane=(edtValue)*1;
		pentanecandlecandlepower=(edtValue)*0.1;
		hefnercandle=(edtValue)*1.111111111;
		carcelunit=(edtValue)*0.1040582726;
		bougiedecimal=(edtValue)*1;
		lumenpersteradian=(edtValue)*1;
	
		break;
		
	case "Lumen/steradian -l/srad":
		
		candleinternational=(edtValue)*1;
		candleGerman=(edtValue)*0.95;
		candleUK=(edtValue)*0.96;
		decimalcandle=(edtValue)*1;
		candlepentane=(edtValue)*1;
		pentanecandlecandlepower=(edtValue)*0.1;
		hefnercandle=(edtValue)*1.111111111;
		carcelunit=(edtValue)*0.1040582726;
		bougiedecimal=(edtValue)*1;
		lumenpersteradian=(edtValue)*1;
	break;
		

				}
				
				
				
				results. setCandleinternational( candleinternational);
				results. setCandleGerman( candleGerman);

				results. setCandleUK( candleUK);
				

				results. setDecimalcandle( decimalcandle) ;

				results. setCandlepentane( candlepentane) ;
				results. setPentanecandlecandlepower( pentanecandlecandlepower); 
				results. setHefnercandle( hefnercandle);
				results. setCarcelunit( carcelunit) ;

				results. setBougiedecimal( bougiedecimal) ;

				results. setLumenpersteradian( lumenpersteradian);
				
				 converterArray.add(results);
				    return converterArray;
				
				
				
		    }
			
			 public class ConversionResults{
				 
					private double candleinternational   , candleGerman   ,candleUK ,decimalcandle  ,candlepentane   , pentanecandlecandlepower   ,hefnercandle   ,carcelunit   , bougiedecimal  ,lumenpersteradian  ;

					public double getCandleinternational() {
						return candleinternational;
					}

					public void setCandleinternational(double candleinternational) {
						this.candleinternational = candleinternational;
					}

					public double getCandleGerman() {
						return candleGerman;
					}

					public void setCandleGerman(double candleGerman) {
						this.candleGerman = candleGerman;
					}

					public double getCandleUK() {
						return candleUK;
					}

					public void setCandleUK(double candleUK) {
						this.candleUK = candleUK;
					}

					public double getDecimalcandle() {
						return decimalcandle;
					}

					public void setDecimalcandle(double decimalcandle) {
						this.decimalcandle = decimalcandle;
					}

					public double getCandlepentane() {
						return candlepentane;
					}

					public void setCandlepentane(double candlepentane) {
						this.candlepentane = candlepentane;
					}

					public double getPentanecandlecandlepower() {
						return pentanecandlecandlepower;
					}

					public void setPentanecandlecandlepower(double pentanecandlecandlepower) {
						this.pentanecandlecandlepower = pentanecandlecandlepower;
					}

					public double getHefnercandle() {
						return hefnercandle;
					}

					public void setHefnercandle(double hefnercandle) {
						this.hefnercandle = hefnercandle;
					}

					public double getCarcelunit() {
						return carcelunit;
					}

					public void setCarcelunit(double carcelunit) {
						this.carcelunit = carcelunit;
					}

					public double getBougiedecimal() {
						return bougiedecimal;
					}

					public void setBougiedecimal(double bougiedecimal) {
						this.bougiedecimal = bougiedecimal;
					}

					public double getLumenpersteradian() {
						return lumenpersteradian;
					}

					public void setLumenpersteradian(double lumenpersteradian) {
						this.lumenpersteradian = lumenpersteradian;
					}

				 
			 
			 }
}
