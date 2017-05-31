package com.nineinfosys.lightconverter.Engin;

import java.util.ArrayList;


public class DigitalImageResolutionConverter {
	
	private double dotmeter,dotmillimeter,dotinch,pixelinch;
	private double edtValue;
	private String conversionFrom;
	
			
	public DigitalImageResolutionConverter(String conversionFrom, double edtValue) {
				
				this.conversionFrom = conversionFrom;
				this.edtValue = edtValue;
			}

			public ArrayList<ConversionResults> calculateResolutionConversion()
			
		    {
		    	
				ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
					
				ConversionResults results= new ConversionResults();
		    		 	
				switch(conversionFrom)
				
				{
				
				case "Dot/meter -dot/m":
					
					dotmeter=(edtValue)*1;
					dotmillimeter=(edtValue)*0.001;
					dotinch=(edtValue)*0.0254;
					pixelinch=(edtValue)*0.0254;
					
					
					 break;
					
				case "Dot/millimeter -dot/mm":
					
					dotmeter=(edtValue)*1000;
					dotmillimeter=(edtValue)*1;
					dotinch=(edtValue)*25.4;
					pixelinch=(edtValue)*25.4;
					
			
					break;
					
				case "Dot/inch -dot/in":
					
					dotmeter=(edtValue)*39.37007874;
					dotmillimeter=(edtValue)*0.0393700787;
					dotinch=(edtValue)*1;
					pixelinch=(edtValue)*1;
					 
					 
			     break;	
				case "Pixel/inch -pixel/in":
					
					dotmeter=(edtValue)*39.37007874;
					dotmillimeter=(edtValue)*0.0393700787;
					dotinch=(edtValue)*1;
					pixelinch=(edtValue)*1;
					 
					
					break;	
				
				
				} 
					 results.setDotmeter(dotmeter);
	    	         results.setDotmillimeter(dotmillimeter);
	    	         results.setDotinch(dotinch); 
	    	         results.setPixelinch(pixelinch);
	    	        
	    	         converterArray.add(results);
	    	         
	 			    return converterArray;     
	    	         
			   
			  }
					  public class ConversionResults{
						  
						  private double dotmeter,dotmillimeter,dotinch,pixelinch;
			   			   
						  public double getDotmeter() {
							return dotmeter;
						}

						public void setDotmeter(double dotmeter) {
							this.dotmeter = dotmeter;
						}

						public double getDotmillimeter() {
							return dotmillimeter;
						}

						public void setDotmillimeter(double dotmillimeter) {
							this.dotmillimeter = dotmillimeter;
						}

						public double getDotinch() {
							return dotinch;
						}

						public void setDotinch(double dotinch) {
							this.dotinch = dotinch;
						}

						public double getPixelinch() {
							return pixelinch;
						}

						public void setPixelinch(double pixelinch) {
							this.pixelinch = pixelinch;
						}

						

						
						
					  }
}
