package com.nineinfosys.lightconverter.Engin;

import java.util.ArrayList;


public class Luminance {
	
	private double candelasquaremeter,candelasquarecentimeter, candelasquarefoot,candelasquareinch,kilocandelasquaremeter, stilb,lumensqmetersteradian,lumensqcmsteradian,
	               lumensquarefootsteradian,wattsqcmsteradian, nit, millinit ,lambert ,millilambert ,footlambert  ,apostilb ,blondel, bril ,skot ;
	
	private double edtValue;
	
	private String conversionFrom;
	
			
	
               public Luminance(String conversionFrom, double edtValue) {
				
				this.conversionFrom = conversionFrom;
				this.edtValue = edtValue;
			
               }
               

			 public ArrayList<ConversionResults> calculateinertiaConversion()
		
		    {
		    	
				ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
					
				ConversionResults results= new ConversionResults();
		    		 	
				switch(conversionFrom)
				
				{
				
				case "Candela/square meter -cd/m^2":
					
					candelasquaremeter=(edtValue)*1;
					candelasquarecentimeter=(edtValue)*0.0001;
					candelasquarefoot=(edtValue)*0.09290304;
					candelasquareinch=(edtValue)*0.00064516;
					kilocandelasquaremeter=(edtValue)*0.001;
					stilb=(edtValue)*0.0001;
					lumensqmetersteradian=(edtValue)*1;
					lumensqcmsteradian=(edtValue)*0.0001;
					lumensquarefootsteradian=(edtValue)*0.09290304;
					wattsqcmsteradian=(edtValue)*1.464128843E-7;
					nit=(edtValue)*1;
					millinit=(edtValue)*1000;
					lambert=(edtValue)*0.0003141593;
					millilambert=(edtValue)*0.3141592654;
					footlambert=(edtValue)*0.291863508;
					apostilb=(edtValue)*3.1415926536;
					blondel=(edtValue)*3.1415926536;
					bril=(edtValue)*31415926.536;
					skot=(edtValue)*3141.5926536;
					
					 break;
					 
                  case "Candela/square centimeter -cd/cm^2":
					
                	  candelasquaremeter=(edtValue)*10000;
  					candelasquarecentimeter=(edtValue)*1;
  					candelasquarefoot=(edtValue)*929.0304;
  					candelasquareinch=(edtValue)*6.4516;
  					kilocandelasquaremeter=(edtValue)*10;
  					stilb=(edtValue)*1;
  					lumensqmetersteradian=(edtValue)*10000;
  					lumensqcmsteradian=(edtValue)*1;
  					lumensquarefootsteradian=(edtValue)*929.0304;
  					wattsqcmsteradian=(edtValue)*0.0014641288;
  					nit=(edtValue)*10000;
  					millinit=(edtValue)*10000000;
  					lambert=(edtValue)*3.1415926536;
  					millilambert=(edtValue)*3141.5926536;
  					footlambert=(edtValue)*2918.6350796;
  					apostilb=(edtValue)*31415.926536;
  					blondel=(edtValue)*31415.926536;
  					bril=(edtValue)*314159265359.0;
  					skot=(edtValue)*31415926.536;
					
					
					 break;
                case "Candela/square foot -cd/ft^2":
                	
                	
                	candelasquaremeter=(edtValue)*10.763910417;
					candelasquarecentimeter=(edtValue)*0.001076391;
					candelasquarefoot=(edtValue)*1;
					candelasquareinch=(edtValue)*0.0069444444;
					kilocandelasquaremeter=(edtValue)*0.0107639104;
					stilb=(edtValue)*0.001076391;
					lumensqmetersteradian=(edtValue)*10.763910417;
					lumensqcmsteradian=(edtValue)*0.001076391;
					lumensquarefootsteradian=(edtValue)*1;
					wattsqcmsteradian=(edtValue)*0.000001576;
					nit=(edtValue)*10.763910417;
					millinit=(edtValue)*10763.910417;
					lambert=(edtValue)*0.0033815822;
					millilambert=(edtValue)*3.3815821889;
					footlambert=(edtValue)*3.1415926536;
					apostilb=(edtValue)*33.815821889;
					blondel=(edtValue)*33.815821889;
					bril=(edtValue)*338158218.89;
					skot=(edtValue)*33815.821889;
	
					
	
	 break;
case "Candela/square inch -cd/in^2":
	
	candelasquaremeter=(edtValue)*1550.0031;
	candelasquarecentimeter=(edtValue)*0.15500031;
	candelasquarefoot=(edtValue)*144;
	candelasquareinch=(edtValue)*1;
	kilocandelasquaremeter=(edtValue)*1.5500031;
	stilb=(edtValue)*0.15500031;
	lumensqmetersteradian=(edtValue)*1550.0031;
	lumensqcmsteradian=(edtValue)*0.15500031;
	lumensquarefootsteradian=(edtValue)*144;
	wattsqcmsteradian=(edtValue)*0.0002269404;
	nit=(edtValue)*1550.0031;
	millinit=(edtValue)*1550003.1;
	lambert=(edtValue)*0.4869478352;
	millilambert=(edtValue)*486.9478352;
	footlambert=(edtValue)*452.38934212;
	apostilb=(edtValue)*4869.478352;
	blondel=(edtValue)*4869.478352;
	bril=(edtValue)*486947835;
	skot=(edtValue)*4869478.352;
	
	
	
	 break;
case "Kilocandela/square meter -kcd/m^2":
	
	candelasquaremeter=(edtValue)*1000;
	candelasquarecentimeter=(edtValue)*0.1;
	candelasquarefoot=(edtValue)*92.90304;
	candelasquareinch=(edtValue)*0.64516;
	kilocandelasquaremeter=(edtValue)*1;
	stilb=(edtValue)*0.1;
	lumensqmetersteradian=(edtValue)*1000;
	lumensqcmsteradian=(edtValue)*0.1;
	lumensquarefootsteradian=(edtValue)*92.90304;
	wattsqcmsteradian=(edtValue)*0.0001464129;
	nit=(edtValue)*1000;
	millinit=(edtValue)*1000000;
	lambert=(edtValue)*0.3141592654;
	millilambert=(edtValue)*314.15926536;
	footlambert=(edtValue)*291.86350796;
	apostilb=(edtValue)*3141.5926536;
	blondel=(edtValue)*3141.5926536;
	bril=(edtValue)*31415926536.0;
	skot=(edtValue)*3141592.6536;
	
	
	
	 break;
case "Stilb -sb":
	
	candelasquaremeter=(edtValue)*10000;
	candelasquarecentimeter=(edtValue)*1;
	candelasquarefoot=(edtValue)*929.0304;
	candelasquareinch=(edtValue)*6.4516;
	kilocandelasquaremeter=(edtValue)*10;
	stilb=(edtValue)*1;
	lumensqmetersteradian=(edtValue)*10000;
	lumensqcmsteradian=(edtValue)*1;
	lumensquarefootsteradian=(edtValue)*929.0304;
	wattsqcmsteradian=(edtValue)*0.0014641288;
	nit=(edtValue)*10000;
	millinit=(edtValue)*10000000;
	lambert=(edtValue)*3.1415926536;
	millilambert=(edtValue)*3141.5926536;
	footlambert=(edtValue)*2918.6350796;
	apostilb=(edtValue)*31415.926536;
	blondel=(edtValue)*31415.926536;
	bril=(edtValue)*314159265359.0;
	skot=(edtValue)*31415926.536;
	
	
	
	 break;
case "Lumen/sq. meter/steradian -l/m^2/srad":
	
	candelasquaremeter=(edtValue)*1;
	candelasquarecentimeter=(edtValue)*0.0001;
	candelasquarefoot=(edtValue)*0.09290304;
	candelasquareinch=(edtValue)*0.00064516;
	kilocandelasquaremeter=(edtValue)*0.001;
	stilb=(edtValue)*0.0001;
	lumensqmetersteradian=(edtValue)*1;
	lumensqcmsteradian=(edtValue)*0.0001;
	lumensquarefootsteradian=(edtValue)*0.09290304;
	wattsqcmsteradian=(edtValue)*1.464128843E-7;
	nit=(edtValue)*1;
	millinit=(edtValue)*1000;
	lambert=(edtValue)*0.0003141593;
	millilambert=(edtValue)*0.3141592654;
	footlambert=(edtValue)*0.291863508;
	apostilb=(edtValue)*3.1415926536;
	blondel=(edtValue)*3.1415926536;
	bril=(edtValue)*31415926.536;
	skot=(edtValue)*3141.5926536;
	
	
	
	 break;
case "Lumen/sq. cm/steradian -l/cm^2/srad":
	
	candelasquaremeter=(edtValue)*10000;
	candelasquarecentimeter=(edtValue)*1;
	candelasquarefoot=(edtValue)*929.0304;
	candelasquareinch=(edtValue)*6.4516;
	kilocandelasquaremeter=(edtValue)*10;
	stilb=(edtValue)*1;
	lumensqmetersteradian=(edtValue)*10000;
	lumensqcmsteradian=(edtValue)*1;
	lumensquarefootsteradian=(edtValue)*929.0304;
	wattsqcmsteradian=(edtValue)*0.0014641288;
	nit=(edtValue)*10000;
	millinit=(edtValue)*10000000;
	lambert=(edtValue)*3.1415926536;
	millilambert=(edtValue)*3141.5926536;
	footlambert=(edtValue)*2918.6350796;
	apostilb=(edtValue)*31415.926536;
	blondel=(edtValue)*31415.926536;
	bril=(edtValue)*314159265359.0;
	skot=(edtValue)*31415926.536;
	
	
	
	 break;
case "Lumen/square foot/steradian -l/ft^2/srad":
	
	candelasquaremeter=(edtValue)*10.763910417;
	candelasquarecentimeter=(edtValue)*0.001076391;
	candelasquarefoot=(edtValue)*1;
	candelasquareinch=(edtValue)*0.0069444444;
	kilocandelasquaremeter=(edtValue)*0.0107639104;
	stilb=(edtValue)*0.001076391;
	lumensqmetersteradian=(edtValue)*10.763910417;
	lumensqcmsteradian=(edtValue)*0.001076391;
	lumensquarefootsteradian=(edtValue)*1;
	wattsqcmsteradian=(edtValue)*0.000001576;
	nit=(edtValue)*10.763910417;
	millinit=(edtValue)*10763.910417;
	lambert=(edtValue)*0.0033815822;
	millilambert=(edtValue)*3.3815821889;
	footlambert=(edtValue)*3.1415926536;
	apostilb=(edtValue)*33.815821889;
	blondel=(edtValue)*33.815821889;
	bril=(edtValue)*338158218.89;
	skot=(edtValue)*33815.821889;
	
	
	
	 break;
case "Watt/sq. cm/steradian (at 555 nm) -W/cm^2/srad (at 555 nm)":
	
	candelasquaremeter=(edtValue)*6830000;
	candelasquarecentimeter=(edtValue)*683;
	candelasquarefoot=(edtValue)*634527.7632;
	candelasquareinch=(edtValue)*4406.4428;
	kilocandelasquaremeter=(edtValue)*6830;
	stilb=(edtValue)*683;
	lumensqmetersteradian=(edtValue)*6830000;
	lumensqcmsteradian=(edtValue)*683;
	lumensquarefootsteradian=(edtValue)*634527.7632;
	wattsqcmsteradian=(edtValue)*1;
	nit=(edtValue)*6830000;
	millinit=(edtValue)*68300000;
	lambert=(edtValue)*2145.7077824;
	millilambert=(edtValue)*2145707.7824;
	footlambert=(edtValue)*1993427.7594;
	apostilb=(edtValue)*21457077.824;
	blondel=(edtValue)*21457077.824;
	bril=(edtValue)*214570778240185.0;
	skot=(edtValue)*21457077824.0;
	
	
	 break;
case "Nit -nt":
	
	candelasquaremeter=(edtValue)*1;
	candelasquarecentimeter=(edtValue)*0.0001;
	candelasquarefoot=(edtValue)*0.09290304;
	candelasquareinch=(edtValue)*0.00064516;
	kilocandelasquaremeter=(edtValue)*0.001;
	stilb=(edtValue)*0.0001;
	lumensqmetersteradian=(edtValue)*1;
	lumensqcmsteradian=(edtValue)*0.0001;
	lumensquarefootsteradian=(edtValue)*0.09290304;
	wattsqcmsteradian=(edtValue)*1.464128843E-7;
	nit=(edtValue)*1;
	millinit=(edtValue)*1000;
	lambert=(edtValue)*0.0003141593;
	millilambert=(edtValue)*0.3141592654;
	footlambert=(edtValue)*0.291863508;
	apostilb=(edtValue)*3.1415926536;
	blondel=(edtValue)*3.1415926536;
	bril=(edtValue)*31415926.536;
	skot=(edtValue)*3141.5926536;
	
	
	
	 break;
case "Millinit -mnt":
	
	candelasquaremeter=(edtValue)*0.001;
	candelasquarecentimeter=(edtValue)*1.E-7;
	candelasquarefoot=(edtValue)*0.000092903;
	candelasquareinch=(edtValue)*6.4516E-7;
	kilocandelasquaremeter=(edtValue)*0.000001;
	stilb=(edtValue)*1.E-7;
	lumensqmetersteradian=(edtValue)*0.001;
	lumensqcmsteradian=(edtValue)*1.E-7;
	lumensquarefootsteradian=(edtValue)*0.000092903;
	wattsqcmsteradian=(edtValue)*1.464128843E-10;
	nit=(edtValue)*0.001;
	millinit=(edtValue)*1;
	lambert=(edtValue)*3.141592653E-7;
	millilambert=(edtValue)*0.0003141593;
	footlambert=(edtValue)*0.0002918635;
	apostilb=(edtValue)*0.0031415927;
	blondel=(edtValue)*0.0031415927;
	bril=(edtValue)*31415.926536;
	skot=(edtValue)*3.1415926536;
	
	
	
	 break;
case "Lambert -L":
	
	candelasquaremeter=(edtValue)*3183.0988618;
	candelasquarecentimeter=(edtValue)*0.3183098862;
	candelasquarefoot=(edtValue)*295.71956089;
	candelasquareinch=(edtValue)*2.0536080617;
	kilocandelasquaremeter=(edtValue)*3.1830988618;
	stilb=(edtValue)*0.3183098862;
	lumensqmetersteradian=(edtValue)*3183.0988618;
	lumensqcmsteradian=(edtValue)*0.3183098862;
	lumensquarefootsteradian=(edtValue)*295.71956089;
	wattsqcmsteradian=(edtValue)*0.0004660467;
	nit=(edtValue)*3183.0988618;
	millinit=(edtValue)*3183098.8618;
	lambert=(edtValue)*1;
	millilambert=(edtValue)*1000;
	footlambert=(edtValue)*929.0304;
	apostilb=(edtValue)*10000;
	blondel=(edtValue)*10000;
	bril=(edtValue)*100000000000.0;
	skot=(edtValue)*10000000;
	
	 break;
case "Millilambert -mL":
	
	candelasquaremeter=(edtValue)*3.1830988618;
	candelasquarecentimeter=(edtValue)*0.0003183099;
	candelasquarefoot=(edtValue)*0.2957195609;
	candelasquareinch=(edtValue)*0.0020536081;
	kilocandelasquaremeter=(edtValue)*0.0031830989;
	stilb=(edtValue)*0.0003183099;
	lumensqmetersteradian=(edtValue)*3.1830988618;
	lumensqcmsteradian=(edtValue)*0.0003183099;
	lumensquarefootsteradian=(edtValue)*0.2957195609;
	wattsqcmsteradian=(edtValue)*4.660466854E-7;
	nit=(edtValue)*3.1830988618;
	millinit=(edtValue)*3183.0988618;
	lambert=(edtValue)*0.001;
	millilambert=(edtValue)*1;
	footlambert=(edtValue)*0.9290304;
	apostilb=(edtValue)*10;
	blondel=(edtValue)*10;
	bril=(edtValue)*100000000;
	skot=(edtValue)*10000;
	
	break;
case "Foot-lambert -fL":
	
	candelasquaremeter=(edtValue)*3.4262590996;
	candelasquarecentimeter=(edtValue)*0.0003426259;
	candelasquarefoot=(edtValue)*0.3183098862;
	candelasquareinch=(edtValue)*0.0022104853;
	kilocandelasquaremeter=(edtValue)*0.0034262591;
	stilb=(edtValue)*0.0003426259;
	lumensqmetersteradian=(edtValue)*3.4262590996;
	lumensqcmsteradian=(edtValue)*0.0003426259;
	lumensquarefootsteradian=(edtValue)*0.3183098862;
	wattsqcmsteradian=(edtValue)*5.016484772E-7;
	nit=(edtValue)*3.4262590996;
	millinit=(edtValue)*3426.2590996;
	lambert=(edtValue)*0.001076391;
	millilambert=(edtValue)*1.0763910417;
	footlambert=(edtValue)*1;
	apostilb=(edtValue)*10.763910417;
	blondel=(edtValue)*10.763910417;
	bril=(edtValue)*107639104.17;
	skot=(edtValue)*10763.910417;
	
	break;
case "Apostilb -apo":
	
	candelasquaremeter=(edtValue)*0.3183098862;
	candelasquarecentimeter=(edtValue)*0.000031831;
	candelasquarefoot=(edtValue)*0.0295719561;
	candelasquareinch=(edtValue)*0.0002053608;
	kilocandelasquaremeter=(edtValue)*0.0003183099;
	stilb=(edtValue)*0.000031831;
	lumensqmetersteradian=(edtValue)*0.3183098862;
	lumensqcmsteradian=(edtValue)*0.000031831;
	lumensquarefootsteradian=(edtValue)*0.0295719561;
	wattsqcmsteradian=(edtValue)*4.660466854E-8;
	nit=(edtValue)*0.3183098862;
	millinit=(edtValue)*318.30988618;
	lambert=(edtValue)*0.0001;
	millilambert=(edtValue)*0.1;
	footlambert=(edtValue)*0.09290304;
	apostilb=(edtValue)*1;
	blondel=(edtValue)*1;
	bril=(edtValue)*10000000;
	skot=(edtValue)*1000;
	
	break;
case "Blondel -blo":
	
	candelasquaremeter=(edtValue)*0.3183098862;
	candelasquarecentimeter=(edtValue)*0.000031831;
	candelasquarefoot=(edtValue)*0.0295719561;
	candelasquareinch=(edtValue)*0.0002053608;
	kilocandelasquaremeter=(edtValue)*0.0003183099;
	stilb=(edtValue)*0.000031831;
	lumensqmetersteradian=(edtValue)*0.3183098862;
	lumensqcmsteradian=(edtValue)*0.000031831;
	lumensquarefootsteradian=(edtValue)*0.0295719561;
	wattsqcmsteradian=(edtValue)*4.660466854E-8;
	nit=(edtValue)*0.3183098862;
	millinit=(edtValue)*318.30988618;
	lambert=(edtValue)*0.0001;
	millilambert=(edtValue)*0.1;
	footlambert=(edtValue)*0.09290304;
	apostilb=(edtValue)*1;
	blondel=(edtValue)*1;
	bril=(edtValue)*10000000;
	skot=(edtValue)*1000;
	
	break;
case "Bril -br":
	
	candelasquaremeter=(edtValue)*3.183098861E-8;
	candelasquarecentimeter=(edtValue)*3.183098861E-12;
	candelasquarefoot=(edtValue)*2.957195608E-9;
	candelasquareinch=(edtValue)*2.053608061E-11;
	kilocandelasquaremeter=(edtValue)*3.183098861E-11;
	stilb=(edtValue)*3.183098861E-12;
	lumensqmetersteradian=(edtValue)*3.183098861E-8;
	lumensqcmsteradian=(edtValue)*3.183098861E-12;
	lumensquarefootsteradian=(edtValue)*2.957195608E-9;
	wattsqcmsteradian=(edtValue)*4.660466854E-15;
	nit=(edtValue)*3.183098861E-8;
	millinit=(edtValue)*0.000031831;
	lambert=(edtValue)*1.E-11;
	millilambert=(edtValue)*1.E-8;
	footlambert=(edtValue)*9.290304E-9;
	apostilb=(edtValue)*1.E-7;
	blondel=(edtValue)*1.E-7;
	bril=(edtValue)*1;
	skot=(edtValue)*0.0001;
	
	break;
case "Skot -sk":
	
	candelasquaremeter=(edtValue)*0.0003183099;
	candelasquarecentimeter=(edtValue)*3.183098861E-8;
	candelasquarefoot=(edtValue)*0.000029572;
	candelasquareinch=(edtValue)*2.053608061E-7;
	kilocandelasquaremeter=(edtValue)*3.183098861E-7;
	stilb=(edtValue)*3.183098861E-8;
	lumensqmetersteradian=(edtValue)*0.0003183099;
	lumensqcmsteradian=(edtValue)*3.183098861E-8;
	lumensquarefootsteradian=(edtValue)*0.000029572;
	wattsqcmsteradian=(edtValue)*4.660466854E-11;
	nit=(edtValue)*0.0003183099;
	millinit=(edtValue)*0.3183098862;
	lambert=(edtValue)*1.E-7;
	millilambert=(edtValue)*0.0001;
	footlambert=(edtValue)*0.000092903;
	apostilb=(edtValue)*0.001;
	blondel=(edtValue)*0.001;
	bril=(edtValue)*10000;
	skot=(edtValue)*1;
	
	break;
				
				} 
				    results.setCandelasquaremeter(candelasquaremeter);
	    	         results.setCandelasquarecentimeter(candelasquarecentimeter);
	    	         results.setCandelasquarefoot(candelasquarefoot); 
	    	         results.setCandelasquareinch(candelasquareinch);
	    	         results.setKilocandelasquaremeter(kilocandelasquaremeter);
	    	         results.setStilb(stilb);
	    	         results.setLumensqmetersteradian(lumensqmetersteradian);
	    	         results.setLumensqcmsteradian(lumensqcmsteradian); 
	    	         results.setLumensquarefootsteradian(lumensquarefootsteradian);
	    	         results.setWattsqcmsteradian(wattsqcmsteradian);
	    	         results.setNit(nit);
	    	         results.setMillinit(millinit);
	    	         results.setLambert(lambert); 
	    	         results.setMillilambert(millilambert);
	    	         results.setFootlambert(footlambert);
	    	         results.setApostilb(apostilb);
	    	         results.setBlondel(blondel);
	    	         results.setBril(bril); 
	    	         results.setSkot(skot);
	    	        
	    	        
	    	         converterArray.add(results);
	    	         
	 			    return converterArray;     
	    	         
			   
			  }
					  public class ConversionResults{
						  
						  private double candelasquaremeter,candelasquarecentimeter, candelasquarefoot,candelasquareinch,kilocandelasquaremeter, stilb,lumensqmetersteradian,lumensqcmsteradian,
			               lumensquarefootsteradian,wattsqcmsteradian, nit, millinit ,lambert ,millilambert ,footlambert  ,apostilb ,blondel, bril ,skot;

						  
						  public double getCandelasquaremeter() {
							return candelasquaremeter;
						}

						public void setCandelasquaremeter(double candelasquaremeter) {
							this.candelasquaremeter = candelasquaremeter;
						}

						public double getCandelasquarecentimeter() {
							return candelasquarecentimeter;
						}

						public void setCandelasquarecentimeter(double candelasquarecentimeter) {
							this.candelasquarecentimeter = candelasquarecentimeter;
						}

						public double getCandelasquarefoot() {
							return candelasquarefoot;
						}

						public void setCandelasquarefoot(double candelasquarefoot) {
							this.candelasquarefoot = candelasquarefoot;
						}

						public double getCandelasquareinch() {
							return candelasquareinch;
						}

						public void setCandelasquareinch(double candelasquareinch) {
							this.candelasquareinch = candelasquareinch;
						}

						public double getKilocandelasquaremeter() {
							return kilocandelasquaremeter;
						}

						public void setKilocandelasquaremeter(double kilocandelasquaremeter) {
							this.kilocandelasquaremeter = kilocandelasquaremeter;
						}

						public double getStilb() {
							return stilb;
						}

						public void setStilb(double stilb) {
							this.stilb = stilb;
						}

						public double getLumensqmetersteradian() {
							return lumensqmetersteradian;
						}

						public void setLumensqmetersteradian(double lumensqmetersteradian) {
							this.lumensqmetersteradian = lumensqmetersteradian;
						}

						public double getLumensqcmsteradian() {
							return lumensqcmsteradian;
						}

						public void setLumensqcmsteradian(double lumensqcmsteradian) {
							this.lumensqcmsteradian = lumensqcmsteradian;
						}

						public double getLumensquarefootsteradian() {
							return lumensquarefootsteradian;
						}

						public void setLumensquarefootsteradian(double lumensquarefootsteradian) {
							this.lumensquarefootsteradian = lumensquarefootsteradian;
						}

						public double getWattsqcmsteradian() {
							return wattsqcmsteradian;
						}

						public void setWattsqcmsteradian(double wattsqcmsteradian) {
							this.wattsqcmsteradian = wattsqcmsteradian;
						}

						public double getNit() {
							return nit;
						}

						public void setNit(double nit) {
							this.nit = nit;
						}

						public double getMillinit() {
							return millinit;
						}

						public void setMillinit(double millinit) {
							this.millinit = millinit;
						}

						public double getLambert() {
							return lambert;
						}

						public void setLambert(double lambert) {
							this.lambert = lambert;
						}

						public double getMillilambert() {
							return millilambert;
						}

						public void setMillilambert(double millilambert) {
							this.millilambert = millilambert;
						}

						public double getFootlambert() {
							return footlambert;
						}

						public void setFootlambert(double footlambert) {
							this.footlambert = footlambert;
						}

						public double getApostilb() {
							return apostilb;
						}

						public void setApostilb(double apostilb) {
							this.apostilb = apostilb;
						}

						public double getBlondel() {
							return blondel;
						}

						public void setBlondel(double blondel) {
							this.blondel = blondel;
						}

						public double getBril() {
							return bril;
						}

						public void setBril(double bril) {
							this.bril = bril;
						}

						public double getSkot() {
							return skot;
						}

						public void setSkot(double skot) {
							this.skot = skot;
						}

						
						
						  
						 
			   			   
				  }
          }
