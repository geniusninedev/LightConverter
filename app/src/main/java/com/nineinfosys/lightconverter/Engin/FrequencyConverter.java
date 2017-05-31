package com.nineinfosys.lightconverter.Engin;

import java.util.ArrayList;

public class FrequencyConverter {

	private double hertz,exahertz,petahertz,terahertz,gigahertz,megahertz,kilohertz, hectohertz,dekahertz,decihertz,centihertz,millihertz,microhertz,nanohertz,picohertz,femtohertz
	,attohertz,cyclepersecond,wavelengthinexametres,wavelengthinpetametres,wavelengthinterametres,wavelengthingigametres,wavelengthinmegametres,wavelengthinkilometres
	,wavelengthinhectometres,wavelengthindekametres,wavelengthinmetres,wavelengthindecimetres,wavelengthincentimetres,wavelengthinmillimetres,wavelengthinmicrometres
	,ElectronComptonwavelength,ProtonComptonwavelength,NeutronComptonwavelength;
	private double edtValue;
	private String conversionFrom;
	//private String conversionTo;
	public FrequencyConverter(String conversionFrom, double edtValue){
		// TODO Auto-generated constructor stub
		this.conversionFrom = conversionFrom;
		this.edtValue = edtValue;
	}
	public ArrayList<ConversionResults> calculateFrequencyConversion()
    {
		
		ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
			
		ConversionResults results= new ConversionResults();
    		 	
		switch(conversionFrom)
		{
		case "Hertz -Hz":
			
			hertz=(edtValue)*1;
			exahertz=(edtValue)*1.E-18;
			petahertz=(edtValue)*9.999999999E-16;
			terahertz=(edtValue)*1.E-12;
			gigahertz=(edtValue)*1.E-9;
			megahertz=(edtValue)*0.000001;
			kilohertz=(edtValue)*0.001;
			hectohertz=(edtValue)*0.01;
			dekahertz=(edtValue)*0.1;
			decihertz=(edtValue)*10;
			centihertz=(edtValue)*100;
			millihertz=(edtValue)*1000;
			microhertz=(edtValue)*1000000;
			nanohertz=(edtValue)*1000000000;
			picohertz=(edtValue)*1000000000000.0;
			femtohertz=(edtValue)*1000000000000000.0;
			attohertz=(edtValue)*1000000000000000000.0;
			cyclepersecond=(edtValue)*1;
			wavelengthinexametres=(edtValue)*2.99792458E-10;
			wavelengthinpetametres=(edtValue)*2.99792458E-7;
			wavelengthinterametres=(edtValue)*0.0002997925;
			wavelengthingigametres=(edtValue)*0.299792458;
			wavelengthinmegametres=(edtValue)*299.792458;
			wavelengthinkilometres=(edtValue)*299792.458;
			wavelengthinhectometres=(edtValue)*2997924.58;
			wavelengthindekametres=(edtValue)*29979245.8;
			wavelengthinmetres=(edtValue)*299792458;
			wavelengthindecimetres=(edtValue)*2997924580.0;
			wavelengthincentimetres=(edtValue)*29979245800.0;
			wavelengthinmillimetres=(edtValue)*299792458000.0;
			wavelengthinmicrometres=(edtValue)*299792458000000.0;
			ElectronComptonwavelength=(edtValue)*123558978999300000000.0;
			ProtonComptonwavelength=(edtValue)*2.268731532E+23;
			NeutronComptonwavelength=(edtValue)*2.271858744E+23;
			break;
			
		case "Exahertz -EHz":
			
			hertz=(edtValue)*1000000000000000000.0;
			exahertz=(edtValue)*1;
			petahertz=(edtValue)*1000;
			terahertz=(edtValue)*1000000;
			gigahertz=(edtValue)*1000000000;
			megahertz=(edtValue)*1000000000000.0;
			kilohertz=(edtValue)*1000000000000000.0;
			hectohertz=(edtValue)*10000000000000000.0;
			dekahertz=(edtValue)*100000000000000000.0;
			decihertz=(edtValue)*10000000000000000000.0;
			centihertz=(edtValue)*100000000000000000000.0;
			millihertz=(edtValue)*1.E+21;
			microhertz=(edtValue)*1.E+24;
			nanohertz=(edtValue)*9.999999999E+26;
			picohertz=(edtValue)*9.999999999E+29;
			femtohertz=(edtValue)*1.E+33;
			attohertz=(edtValue)*1.E+33;
			cyclepersecond=(edtValue)*1000000000000000000.0;
			wavelengthinexametres=(edtValue)*2.99792458E-28;
			wavelengthinpetametres=(edtValue)*2.99792458E-25;
			wavelengthinterametres=(edtValue)*2.99792458E-22;
			wavelengthingigametres=(edtValue)*2.99792458E-19;
			wavelengthinmegametres=(edtValue)*2.99792458E-16;
			wavelengthinkilometres=(edtValue)*2.99792458E-13;
			wavelengthinhectometres=(edtValue)*2.99792458E-12;
			wavelengthindekametres=(edtValue)*2.99792458E-11;
			wavelengthinmetres=(edtValue)*2.99792458E-10;
			wavelengthindecimetres=(edtValue)*2.99792458E-9;
			wavelengthincentimetres=(edtValue)*2.99792458E-8;
			wavelengthinmillimetres=(edtValue)*2.99792458E-7;
			wavelengthinmicrometres=(edtValue)*0.0002997925;
			ElectronComptonwavelength=(edtValue)*123.558979;
			ProtonComptonwavelength=(edtValue)*226873.15327;
			NeutronComptonwavelength=(edtValue)*227185.87447;
			
			break;
			
		case "Petahertz -PHz":
			
			hertz=(edtValue)*1000000000000000.0;
			exahertz=(edtValue)*0.001;
			petahertz=(edtValue)*1;
			terahertz=(edtValue)*1000;
			gigahertz=(edtValue)*1000000;
			megahertz=(edtValue)*1000000000;
			kilohertz=(edtValue)*1000000000000.0;
			hectohertz=(edtValue)*10000000000000.0;
			dekahertz=(edtValue)*100000000000000.0;
			decihertz=(edtValue)*10000000000000000.0;
			centihertz=(edtValue)*100000000000000000.0;
			millihertz=(edtValue)*1000000000000000000.0;
			microhertz=(edtValue)*1.E+21;
			nanohertz=(edtValue)*1.E+24;
			picohertz=(edtValue)*1.E+27;
			femtohertz=(edtValue)*1.E+30;
			attohertz=(edtValue)*1.E+33;
			cyclepersecond=(edtValue)*1000000000000000.0;
			wavelengthinexametres=(edtValue)*2.99792458E-25;
			wavelengthinpetametres=(edtValue)*2.99792458E-22;
			wavelengthinterametres=(edtValue)*2.997924579E-19;
			wavelengthingigametres=(edtValue)*2.99792458E-16;
			wavelengthinmegametres=(edtValue)*2.99792458E-13;
			wavelengthinkilometres=(edtValue)*2.99792458E-10;
			wavelengthinhectometres=(edtValue)*2.99792458E-9;
			wavelengthindekametres=(edtValue)*2.997924579E-8;
			wavelengthinmetres=(edtValue)*2.99792458E-7;
			wavelengthindecimetres=(edtValue)*0.0000029979;
			wavelengthincentimetres=(edtValue)*0.0000299792;
			wavelengthinmillimetres=(edtValue)*0.0002997925;
			wavelengthinmicrometres=(edtValue)*0.299792458;
			ElectronComptonwavelength=(edtValue)*123558.979;
			ProtonComptonwavelength=(edtValue)*226873153.27;
			NeutronComptonwavelength=(edtValue)*227185874.47;
			
			break;	
		case "Terahertz -THz":
			
			hertz=(edtValue)*1000000000000.0;
			exahertz=(edtValue)*0.000001;
			petahertz=(edtValue)*0.001;
			terahertz=(edtValue)*1;
			gigahertz=(edtValue)*1000;
			megahertz=(edtValue)*1000000;
			kilohertz=(edtValue)*1000000000;
			hectohertz=(edtValue)*10000000000.0;
			dekahertz=(edtValue)*100000000000.0;
			decihertz=(edtValue)*10000000000000.0;
			centihertz=(edtValue)*100000000000000.0;
			millihertz=(edtValue)*1000000000000000.0;
			microhertz=(edtValue)*1000000000000000000.0;
			nanohertz=(edtValue)*1.E+21;
			picohertz=(edtValue)*1.E+24;
			femtohertz=(edtValue)*1.E+27;
			attohertz=(edtValue)*1.E+30;
			cyclepersecond=(edtValue)*1000000000000.0;
			wavelengthinexametres=(edtValue)*2.99792458E-22;
			wavelengthinpetametres=(edtValue)*2.99792458E-19;
			wavelengthinterametres=(edtValue)*2.99792458E-16;
			wavelengthingigametres=(edtValue)*2.99792458E-13;
			wavelengthinmegametres=(edtValue)*2.997924579E-10;
			wavelengthinkilometres=(edtValue)*2.99792458E-7;
			wavelengthinhectometres=(edtValue)*0.0000029979;
			wavelengthindekametres=(edtValue)*0.0000299792;
			wavelengthinmetres=(edtValue)*0.0002997925;
			wavelengthindecimetres=(edtValue)*0.0029979246;
			wavelengthincentimetres=(edtValue)*0.0299792458;
			wavelengthinmillimetres=(edtValue)*0.299792458;
			wavelengthinmicrometres=(edtValue)*299.792458;
			ElectronComptonwavelength=(edtValue)*123558979;
			ProtonComptonwavelength=(edtValue)*226873153270.0;
			NeutronComptonwavelength=(edtValue)*227185874473.0;
			
			break;	
		case "Gigahertz -GHz":
			
			hertz=(edtValue)*1000000000;
			exahertz=(edtValue)*1.E-9;
			petahertz=(edtValue)*0.000001;
			terahertz=(edtValue)*0.001;
			gigahertz=(edtValue)*1;
			megahertz=(edtValue)*1000;
			kilohertz=(edtValue)*1000000;
			hectohertz=(edtValue)*10000000;
			dekahertz=(edtValue)*100000000;
			decihertz=(edtValue)*10000000000.0;
			centihertz=(edtValue)*100000000000.0;
			millihertz=(edtValue)*1000000000000.0;
			microhertz=(edtValue)*1000000000000000.0;
			nanohertz=(edtValue)*1000000000000000000.0;
			picohertz=(edtValue)*1.E+21;
			femtohertz=(edtValue)*1.E+24;
			attohertz=(edtValue)*1.E+27;
			cyclepersecond=(edtValue)*1000000000;
			wavelengthinexametres=(edtValue)*2.99792458E-19;
			wavelengthinpetametres=(edtValue)*2.99792458E-16;
			wavelengthinterametres=(edtValue)*2.99792458E-13;
			wavelengthingigametres=(edtValue)*2.99792458E-10;
			wavelengthinmegametres=(edtValue)*2.99792458E-7;
			wavelengthinkilometres=(edtValue)*0.0002997925;
			wavelengthinhectometres=(edtValue)*0.0029979246;
			wavelengthindekametres=(edtValue)*0.0299792458;
			wavelengthinmetres=(edtValue)*0.299792458;
			wavelengthindecimetres=(edtValue)*2.99792458;
			wavelengthincentimetres=(edtValue)*29.9792458;
			wavelengthinmillimetres=(edtValue)*299.792458;
			wavelengthinmicrometres=(edtValue)*299792.458;
			ElectronComptonwavelength=(edtValue)*123558978999.0;
			ProtonComptonwavelength=(edtValue)*226873153270020.0;
			NeutronComptonwavelength=(edtValue)*227185874472780.0;
			
			break;	
		case "Megahertz -MHz":
			
			hertz=(edtValue)*1000000;
			exahertz=(edtValue)*1.E-12;
			petahertz=(edtValue)*9.999999999E-10;
			terahertz=(edtValue)*0.000001;
			gigahertz=(edtValue)*0.001;
			megahertz=(edtValue)*1;
			kilohertz=(edtValue)*1000;
			hectohertz=(edtValue)*10000;
			dekahertz=(edtValue)*100000;
			decihertz=(edtValue)*10000000;
			centihertz=(edtValue)*100000000;
			millihertz=(edtValue)*1000000000;
			microhertz=(edtValue)*1000000000000.0;
			nanohertz=(edtValue)*1000000000000000.0;
			picohertz=(edtValue)*1000000000000000000.0;
			femtohertz=(edtValue)*1.E+21;
			attohertz=(edtValue)*1.E+24;
			cyclepersecond=(edtValue)*1000000;
			wavelengthinexametres=(edtValue)*2.99792458E-16;
			wavelengthinpetametres=(edtValue)*2.99792458E-13;
			wavelengthinterametres=(edtValue)*2.997924579E-10;
			wavelengthingigametres=(edtValue)*2.99792458E-7;
			wavelengthinmegametres=(edtValue)*0.0002997925;
			wavelengthinkilometres=(edtValue)*0.299792458;
			wavelengthinhectometres=(edtValue)*2.99792458;
			wavelengthindekametres=(edtValue)*29.9792458;
			wavelengthinmetres=(edtValue)*299.792458;
			wavelengthindecimetres=(edtValue)*2997.92458;
			wavelengthincentimetres=(edtValue)*29979.2458;
			wavelengthinmillimetres=(edtValue)*299792.458;
			wavelengthinmicrometres=(edtValue)*299792458;
			ElectronComptonwavelength=(edtValue)*123558978999300.0;
			ProtonComptonwavelength=(edtValue)*226873153270020000.0;
			NeutronComptonwavelength=(edtValue)*227185874472780000.0;
			
			break;
			
		case "Kilohertz -kHz":
			
			hertz=(edtValue)*1000;
			exahertz=(edtValue)*1.E-15;
			petahertz=(edtValue)*1.E-12;
			terahertz=(edtValue)*1.E-9;
			gigahertz=(edtValue)*0.000001;
			megahertz=(edtValue)*0.001;
			kilohertz=(edtValue)*1;
			hectohertz=(edtValue)*10;
			dekahertz=(edtValue)*100;
			decihertz=(edtValue)*10000;
			centihertz=(edtValue)*100000;
			millihertz=(edtValue)*1000000;
			microhertz=(edtValue)*1000000000;
			nanohertz=(edtValue)*1000000000000.0;
			picohertz=(edtValue)*1000000000000000.0;
			femtohertz=(edtValue)*1000000000000000000.0;
			attohertz=(edtValue)*1.E+21;
			cyclepersecond=(edtValue)*1000;
			wavelengthinexametres=(edtValue)*2.99792458E-13;
			wavelengthinpetametres=(edtValue)*2.99792458E-10;
			wavelengthinterametres=(edtValue)*2.99792458E-7;
			wavelengthingigametres=(edtValue)*0.0002997925;
			wavelengthinmegametres=(edtValue)*0.299792458;
			wavelengthinkilometres=(edtValue)*299.792458;
			wavelengthinhectometres=(edtValue)*2997.92458;
			wavelengthindekametres=(edtValue)*29979.2458;
			wavelengthinmetres=(edtValue)*299792.458;
			wavelengthindecimetres=(edtValue)*2997924.58;
			wavelengthincentimetres=(edtValue)*29979245.8;
			wavelengthinmillimetres=(edtValue)*299792458;
			wavelengthinmicrometres=(edtValue)*299792458000.0;
			ElectronComptonwavelength=(edtValue)*123558978999300000.0;
			ProtonComptonwavelength=(edtValue)*226873153270020000000.0;
			NeutronComptonwavelength=(edtValue)*227185874472780000000.0;
			
			break;		
			
		case "Hectohertz -hHz":
			
			hertz=(edtValue)*100;
			exahertz=(edtValue)*1.E-16;
			petahertz=(edtValue)*9.999999999E-14;
			terahertz=(edtValue)*1.E-10;
			gigahertz=(edtValue)*1.E-7;
			megahertz=(edtValue)*0.0001;
			kilohertz=(edtValue)*0.1;
			hectohertz=(edtValue)*1;
			dekahertz=(edtValue)*10;
			decihertz=(edtValue)*1000;
			centihertz=(edtValue)*10000;
			millihertz=(edtValue)*100000;
			microhertz=(edtValue)*100000000;
			nanohertz=(edtValue)*100000000000.0;
			picohertz=(edtValue)*100000000000000.0;
			femtohertz=(edtValue)*100000000000000000.0;
			attohertz=(edtValue)*100000000000000000000.0;
			cyclepersecond=(edtValue)*100;
			wavelengthinexametres=(edtValue)*2.99792458E-12;
			wavelengthinpetametres=(edtValue)*2.99792458E-9;
			wavelengthinterametres=(edtValue)*0.0000029979;
			wavelengthingigametres=(edtValue)*0.0029979246;
			wavelengthinmegametres=(edtValue)*2.99792458;
			wavelengthinkilometres=(edtValue)*2997.92458;
			wavelengthinhectometres=(edtValue)*29979.2458;
			wavelengthindekametres=(edtValue)*299792.458;
			wavelengthinmetres=(edtValue)*2997924.58;
			wavelengthindecimetres=(edtValue)*29979245.8;
			wavelengthincentimetres=(edtValue)*299792458;
			wavelengthinmillimetres=(edtValue)*2997924580.0;
			wavelengthinmicrometres=(edtValue)*2997924580000.0;
			ElectronComptonwavelength=(edtValue)*1235589789993000000.0;
			ProtonComptonwavelength=(edtValue)*2.268731532E+21;
			NeutronComptonwavelength=(edtValue)*2.271858744E+21;
			
			break;		
	case "Dekahertz -daHz":
			
		hertz=(edtValue)*10;
		exahertz=(edtValue)*1.E-17;
		petahertz=(edtValue)*1.E-14;
		terahertz=(edtValue)*1.E-11;
		gigahertz=(edtValue)*1.E-8;
		megahertz=(edtValue)*0.00001;
		kilohertz=(edtValue)*0.01;
		hectohertz=(edtValue)*0.1;
		dekahertz=(edtValue)*1;
		decihertz=(edtValue)*100;
		centihertz=(edtValue)*1000;
		millihertz=(edtValue)*10000;
		microhertz=(edtValue)*10000000;
		nanohertz=(edtValue)*10000000000.0;
		picohertz=(edtValue)*10000000000000.0;
		femtohertz=(edtValue)*10000000000000000.0;
		attohertz=(edtValue)*10000000000000000000.0;
		cyclepersecond=(edtValue)*10;
		wavelengthinexametres=(edtValue)*2.99792458E-11;
		wavelengthinpetametres=(edtValue)*2.99792458E-8;
		wavelengthinterametres=(edtValue)*0.0000299792;
		wavelengthingigametres=(edtValue)*0.0299792458;
		wavelengthinmegametres=(edtValue)*29.9792458;
		wavelengthinkilometres=(edtValue)*29979.2458;
		wavelengthinhectometres=(edtValue)*299792.458;
		wavelengthindekametres=(edtValue)*2997924.58;
		wavelengthinmetres=(edtValue)*29979245.8;
		wavelengthindecimetres=(edtValue)*299792458;
		wavelengthincentimetres=(edtValue)*2997924580.0;
		wavelengthinmillimetres=(edtValue)*29979245800.0;
		wavelengthinmicrometres=(edtValue)*29979245800000.0;
		ElectronComptonwavelength=(edtValue)*12355897899930000000.0;
		ProtonComptonwavelength=(edtValue)*2.268731532E+22;
		NeutronComptonwavelength=(edtValue)*2.271858744E+22;
			
			break;	
		case "Decihertz -dHz":
			
			hertz=(edtValue)*0.1;
			exahertz=(edtValue)*1.E-19;
			petahertz=(edtValue)*1.E-16;
			terahertz=(edtValue)*1.E-13;
			gigahertz=(edtValue)*1.E-10;
			megahertz=(edtValue)*1.E-7;
			kilohertz=(edtValue)*0.0001;
			hectohertz=(edtValue)*0.001;
			dekahertz=(edtValue)*0.01;
			decihertz=(edtValue)*1;
			centihertz=(edtValue)*10;
			millihertz=(edtValue)*100;
			microhertz=(edtValue)*100000;
			nanohertz=(edtValue)*100000000;
			picohertz=(edtValue)*100000000000.0;
			femtohertz=(edtValue)*100000000000000.0;
			attohertz=(edtValue)*100000000000000000.0;
			cyclepersecond=(edtValue)*0.1;
			wavelengthinexametres=(edtValue)*2.99792458E-9;
			wavelengthinpetametres=(edtValue)*0.0000029979;
			wavelengthinterametres=(edtValue)*0.0029979246;
			wavelengthingigametres=(edtValue)*2.99792458;
			wavelengthinmegametres=(edtValue)*2997.92458;
			wavelengthinkilometres=(edtValue)*2997924.58;
			wavelengthinhectometres=(edtValue)*29979245.8;
			wavelengthindekametres=(edtValue)*299792458;
			wavelengthinmetres=(edtValue)*2997924580.0;
			wavelengthindecimetres=(edtValue)*29979245800.0;
			wavelengthincentimetres=(edtValue)*299792458000.0;
			wavelengthinmillimetres=(edtValue)*2997924580000.0;
			wavelengthinmicrometres=(edtValue)*2997924580000000.0;
			ElectronComptonwavelength=(edtValue)*1.235589789E+21;
			ProtonComptonwavelength=(edtValue)*2.268731532E+24;
			NeutronComptonwavelength=(edtValue)*2.271858744E+24;
			
			break;
			
		case "Centihertz -cHz":
			
			hertz=(edtValue)*0.01;
			exahertz=(edtValue)*1.E-20;
			petahertz=(edtValue)*9.999999999E-18;
			terahertz=(edtValue)*1.E-14;
			gigahertz=(edtValue)*1.E-11;
			megahertz=(edtValue)*1.E-8;
			kilohertz=(edtValue)*0.00001;
			hectohertz=(edtValue)*0.0001;
			dekahertz=(edtValue)*0.001;
			decihertz=(edtValue)*0.1;
			centihertz=(edtValue)*1;
			millihertz=(edtValue)*10;
			microhertz=(edtValue)*10000;
			nanohertz=(edtValue)*10000000;
			picohertz=(edtValue)*10000000000.0;
			femtohertz=(edtValue)*10000000000000.0;
			attohertz=(edtValue)*10000000000000000.0;
			cyclepersecond=(edtValue)*0.01;
			wavelengthinexametres=(edtValue)*2.99792458E-8;
			wavelengthinpetametres=(edtValue)*0.0000299792;
			wavelengthinterametres=(edtValue)*0.0299792458;
			wavelengthingigametres=(edtValue)*29.9792458;
			wavelengthinmegametres=(edtValue)*29979.2458;
			wavelengthinkilometres=(edtValue)*29979245.8;
			wavelengthinhectometres=(edtValue)*299792458;
			wavelengthindekametres=(edtValue)*2997924580.0;
			wavelengthinmetres=(edtValue)*29979245800.0;
			wavelengthindecimetres=(edtValue)*299792458000.0;
			wavelengthincentimetres=(edtValue)*2997924580000.0;
			wavelengthinmillimetres=(edtValue)*29979245800000.0;
			wavelengthinmicrometres=(edtValue)*29979245800000000.0;
			ElectronComptonwavelength=(edtValue)*1.235589789E+22;
			ProtonComptonwavelength=(edtValue)*2.268731532E+25;
			NeutronComptonwavelength=(edtValue)*2.271858744E+25;
			
			break;		
			
		case "Millihertz -mHz":
			
			hertz=(edtValue)*0.001;
			exahertz=(edtValue)*1.E-21;
			petahertz=(edtValue)*9.999999999E-19;
			terahertz=(edtValue)*1.E-15;
			gigahertz=(edtValue)*1.E-12;
			megahertz=(edtValue)*1.E-9;
			kilohertz=(edtValue)*0.000001;
			hectohertz=(edtValue)*0.00001;
			dekahertz=(edtValue)*0.0001;
			decihertz=(edtValue)*0.01;
			centihertz=(edtValue)*0.1;
			millihertz=(edtValue)*1;
			microhertz=(edtValue)*1000;
			nanohertz=(edtValue)*1000000;
			picohertz=(edtValue)*1000000000;
			femtohertz=(edtValue)*1000000000000.0;
			attohertz=(edtValue)*1000000000000000.0;
			cyclepersecond=(edtValue)*0.001;
			wavelengthinexametres=(edtValue)*2.99792458E-7;
			wavelengthinpetametres=(edtValue)*0.0002997925;
			wavelengthinterametres=(edtValue)*0.299792458;
			wavelengthingigametres=(edtValue)*299.792458;
			wavelengthinmegametres=(edtValue)*299792.458;
			wavelengthinkilometres=(edtValue)*299792458;
			wavelengthinhectometres=(edtValue)*2997924580.0;
			wavelengthindekametres=(edtValue)*29979245800.0;
			wavelengthinmetres=(edtValue)*299792458000.0;
			wavelengthindecimetres=(edtValue)*2997924580000.0;
			wavelengthincentimetres=(edtValue)*29979245800000.0;
			wavelengthinmillimetres=(edtValue)*299792458000000.0;
			wavelengthinmicrometres=(edtValue)*299792458000000000.0;
			ElectronComptonwavelength=(edtValue)*1.235589789E+23;
			ProtonComptonwavelength=(edtValue)*2.268731532E+26;
			NeutronComptonwavelength=(edtValue)*2.271858744E+26;
			
			break;		
			
			
case "Microhertz -μHz":
			
	hertz=(edtValue)*0.000001;
	exahertz=(edtValue)*1.E-24;
	petahertz=(edtValue)*1.E-21;
	terahertz=(edtValue)*1.E-18;
	gigahertz=(edtValue)*1.E-15;
	megahertz=(edtValue)*1.E-12;
	kilohertz=(edtValue)*1.E-9;
	hectohertz=(edtValue)*1.E-8;
	dekahertz=(edtValue)*1.E-7;
	decihertz=(edtValue)*0.00001;
	centihertz=(edtValue)*0.00001;
	millihertz=(edtValue)*0.001;
	microhertz=(edtValue)*1;
	nanohertz=(edtValue)*1000;
	picohertz=(edtValue)*1000000;
	femtohertz=(edtValue)*1000000000;
	attohertz=(edtValue)*1000000000000.0;
	cyclepersecond=(edtValue)*0.000001;
	wavelengthinexametres=(edtValue)*0.0002997925;
	wavelengthinpetametres=(edtValue)*0.299792458;
	wavelengthinterametres=(edtValue)*299.792458;
	wavelengthingigametres=(edtValue)*299792.458;
	wavelengthinmegametres=(edtValue)*299792458;
	wavelengthinkilometres=(edtValue)*299792458000.0;
	wavelengthinhectometres=(edtValue)*2997924580000.0;
	wavelengthindekametres=(edtValue)*29979245800000.0;
	wavelengthinmetres=(edtValue)*299792458000000.0;
	wavelengthindecimetres=(edtValue)*2997924580000000.0;
	wavelengthincentimetres=(edtValue)*29979245800000000.0;
	wavelengthinmillimetres=(edtValue)*299792458000000000.0;
	wavelengthinmicrometres=(edtValue)*299792457999999960000.0;
	ElectronComptonwavelength=(edtValue)*1.235589789E+26;
	ProtonComptonwavelength=(edtValue)*2.268731532E+29;
	NeutronComptonwavelength=(edtValue)*2.271858744E+29;
			
			break;	
		case "Nanohertz -nHz":
			
			hertz=(edtValue)*1.E-9;
			exahertz=(edtValue)*1.E-27;
			petahertz=(edtValue)*1.E-24;
			terahertz=(edtValue)*1.E-21;
			gigahertz=(edtValue)*1.E-18;
			megahertz=(edtValue)*1.E-15;
			kilohertz=(edtValue)*1.E-12;
			hectohertz=(edtValue)*1.E-11;
			dekahertz=(edtValue)*1.E-10;
			decihertz=(edtValue)*1.E-8;
			centihertz=(edtValue)*1.E-7;
			millihertz=(edtValue)*0.000001;
			microhertz=(edtValue)*0.001;
			nanohertz=(edtValue)*1;
			picohertz=(edtValue)*1000;
			femtohertz=(edtValue)*1000000;
			attohertz=(edtValue)*1000000000;
			cyclepersecond=(edtValue)*1.E-9;
			wavelengthinexametres=(edtValue)*0.299792458;
			wavelengthinpetametres=(edtValue)*299.792458;
			wavelengthinterametres=(edtValue)*299792.458;
			wavelengthingigametres=(edtValue)*299792458;
			wavelengthinmegametres=(edtValue)*299792458000.0;
			wavelengthinkilometres=(edtValue)*299792458000000.0;
			wavelengthinhectometres=(edtValue)*2997924580000000.0;
			wavelengthindekametres=(edtValue)*29979245800000000.0;
			wavelengthinmetres=(edtValue)*299792458000000000.0;
			wavelengthindecimetres=(edtValue)*2997924580000000000.0;
			wavelengthincentimetres=(edtValue)*29979245800000000000.0;
			wavelengthinmillimetres=(edtValue)*299792458000000000000.0;
			wavelengthinmicrometres=(edtValue)*2.997924579E+23;
			ElectronComptonwavelength=(edtValue)*1.235589789E+29;
			ProtonComptonwavelength=(edtValue)*2.268731532E+32;
			NeutronComptonwavelength=(edtValue)*2.271858744E+32;
			
			break;	
		case "Picohertz -pHz":
			
			hertz=(edtValue)*1.E-12;
			exahertz=(edtValue)*1.E-30;
			petahertz=(edtValue)*1.E-27;
			terahertz=(edtValue)*1.E-24;
			gigahertz=(edtValue)*1.E-21;
			megahertz=(edtValue)*1.E-18;
			kilohertz=(edtValue)*1.E-15;
			hectohertz=(edtValue)*1.E-14;
			dekahertz=(edtValue)*1.E-13;
			decihertz=(edtValue)*1.E-11;
			centihertz=(edtValue)*1.E-10;
			millihertz=(edtValue)*1.E-9;
			microhertz=(edtValue)*0.000001;
			nanohertz=(edtValue)*0.001;
			picohertz=(edtValue)*1;
			femtohertz=(edtValue)*1000;
			attohertz=(edtValue)*1000000;
			cyclepersecond=(edtValue)*1.E-12;
			wavelengthinexametres=(edtValue)*299.792458;
			wavelengthinpetametres=(edtValue)*299792.458;
			wavelengthinterametres=(edtValue)*299792458;
			wavelengthingigametres=(edtValue)*299792458000.0;
			wavelengthinmegametres=(edtValue)*299792458000000.0;
			wavelengthinkilometres=(edtValue)*299792458000000000.0;
			wavelengthinhectometres=(edtValue)*2997924580000000000.0;
			wavelengthindekametres=(edtValue)*29979245800000000000.0;
			wavelengthinmetres=(edtValue)*299792457999999960000.0;
			wavelengthindecimetres=(edtValue)*2.99792458E+21;
			wavelengthincentimetres=(edtValue)*2.99792458E+22;
			wavelengthinmillimetres=(edtValue)*2.99792458E+23;
			wavelengthinmicrometres=(edtValue)*2.997924579E+26;
			ElectronComptonwavelength=(edtValue)*1.235589789E+32;
			ProtonComptonwavelength=(edtValue)*2.268731532E+35;
			NeutronComptonwavelength=(edtValue)*2.271858744E+35;
			
			break;	
		case "Femtohertz -fHz":
			
			hertz=(edtValue)*1.E-15;
			exahertz=(edtValue)*1.E-33;
			petahertz=(edtValue)*9.999999999E-31;
			terahertz=(edtValue)*1.E-27;
			gigahertz=(edtValue)*1.E-24;
			megahertz=(edtValue)*1.E-21;
			kilohertz=(edtValue)*1.E-18;
			hectohertz=(edtValue)*1.E-17;
			dekahertz=(edtValue)*1.E-16;
			decihertz=(edtValue)*1.E-14;
			centihertz=(edtValue)*1.E-13;
			millihertz=(edtValue)*1.E-12;
			microhertz=(edtValue)*1.E-9;
			nanohertz=(edtValue)*0.000001;
			picohertz=(edtValue)*0.001;
			femtohertz=(edtValue)*1;
			attohertz=(edtValue)*1000;
			cyclepersecond=(edtValue)*1.E-15;
			wavelengthinexametres=(edtValue)*299792.458;
			wavelengthinpetametres=(edtValue)*299792458;
			wavelengthinterametres=(edtValue)*299792458000.0;
			wavelengthingigametres=(edtValue)*299792458000000.0;
			wavelengthinmegametres=(edtValue)*299792458000000000.0;
			wavelengthinkilometres=(edtValue)*299792458000000000000.0;
			wavelengthinhectometres=(edtValue)*2.99792458E+21;
			wavelengthindekametres=(edtValue)*2.99792458E+22;
			wavelengthinmetres=(edtValue)*2.997924579E+23;
			wavelengthindecimetres=(edtValue)*2.99792458E+24;
			wavelengthincentimetres=(edtValue)*2.99792458E+25;
			wavelengthinmillimetres=(edtValue)*2.99792458E+26;
			wavelengthinmicrometres=(edtValue)*2.99792458E+29;
			ElectronComptonwavelength=(edtValue)*1.235589789E+35;
			ProtonComptonwavelength=(edtValue)*2.268731532E+38;
			NeutronComptonwavelength=(edtValue)*2.271858744E+38;
			
			break;
			
		case "Attohertz -aHz":
			
			hertz=(edtValue)*1.E-18;
			exahertz=(edtValue)*1.E-36;
			petahertz=(edtValue)*9.999999999E-34;
			terahertz=(edtValue)*1.E-30;
			gigahertz=(edtValue)*1.E-27;
			megahertz=(edtValue)*1.E-24;
			kilohertz=(edtValue)*1.E-21;
			hectohertz=(edtValue)*1.E-20;
			dekahertz=(edtValue)*1.E-19;
			decihertz=(edtValue)*9.999999999E-18;
			centihertz=(edtValue)*1.E-16;
			millihertz=(edtValue)*1.E-15;
			microhertz=(edtValue)*1.E-12;
			nanohertz=(edtValue)*1.E-9;
			picohertz=(edtValue)*0.000001;
			femtohertz=(edtValue)*0.001;
			attohertz=(edtValue)*1;
			cyclepersecond=(edtValue)*1.E-18;
			wavelengthinexametres=(edtValue)*299792458;
			wavelengthinpetametres=(edtValue)*299792458000.0;
			wavelengthinterametres=(edtValue)*299792458000000.0;
			wavelengthingigametres=(edtValue)*299792458000000000.0;
			wavelengthinmegametres=(edtValue)*299792457999999960000.0;
			wavelengthinkilometres=(edtValue)*2.99792458E+23;
			wavelengthinhectometres=(edtValue)*2.99792458E+24;
			wavelengthindekametres=(edtValue)*2.997924579E+25;
			wavelengthinmetres=(edtValue)*2.997924579E+26;
			wavelengthindecimetres=(edtValue)*2.99792458E+27;
			wavelengthincentimetres=(edtValue)*2.99792458E+28;
			wavelengthinmillimetres=(edtValue)*2.99792458E+29;
			wavelengthinmicrometres=(edtValue)*2.99792458E+32;
			ElectronComptonwavelength=(edtValue)*1.235589789E+38;
			ProtonComptonwavelength=(edtValue)*2.268731532E+41;
			NeutronComptonwavelength=(edtValue)*2.271858744E+41;
			
			break;		
			
		case "Cycle/second -c/s":
			
			hertz=(edtValue)*1;
			exahertz=(edtValue)*1.E-18;
			petahertz=(edtValue)*9.999999999E-16;
			terahertz=(edtValue)*1.E-12;
			gigahertz=(edtValue)*1.E-9;
			megahertz=(edtValue)*0.000001;
			kilohertz=(edtValue)*0.001;
			hectohertz=(edtValue)*0.01;
			dekahertz=(edtValue)*0.1;
			decihertz=(edtValue)*10;
			centihertz=(edtValue)*100;
			millihertz=(edtValue)*1000;
			microhertz=(edtValue)*1000000;
			nanohertz=(edtValue)*1000000000;
			picohertz=(edtValue)*1000000000000.0;
			femtohertz=(edtValue)*1000000000000000.0;
			attohertz=(edtValue)*1000000000000000000.0;
			cyclepersecond=(edtValue)*1;
			wavelengthinexametres=(edtValue)*2.99792458E-10;
			wavelengthinpetametres=(edtValue)*2.99792458E-7;
			wavelengthinterametres=(edtValue)*0.0002997925;
			wavelengthingigametres=(edtValue)*0.299792458;
			wavelengthinmegametres=(edtValue)*299.792458;
			wavelengthinkilometres=(edtValue)*299792.458;
			wavelengthinhectometres=(edtValue)*2997924.58;
			wavelengthindekametres=(edtValue)*29979245.8;
			wavelengthinmetres=(edtValue)*299792458;
			wavelengthindecimetres=(edtValue)*2997924580.0;
			wavelengthincentimetres=(edtValue)*29979245800.0;
			wavelengthinmillimetres=(edtValue)*299792458000.0;
			wavelengthinmicrometres=(edtValue)*299792458000000.0;
			ElectronComptonwavelength=(edtValue)*123558978999300000000.0;
			ProtonComptonwavelength=(edtValue)*2.268731532E+23;
			NeutronComptonwavelength=(edtValue)*2.271858744E+23;
			
			break;		
	case "Wavelength in exametres -Em":
			
		hertz=(edtValue)*2.99792458E-10;
		exahertz=(edtValue)*2.99792458E-28;
		petahertz=(edtValue)*2.99792458E-25;
		terahertz=(edtValue)*2.99792458E-22;
		gigahertz=(edtValue)*2.99792458E-19;
		megahertz=(edtValue)*2.99792458E-16;
		kilohertz=(edtValue)*2.99792458E-13;
		hectohertz=(edtValue)*2.99792458E-12;
		dekahertz=(edtValue)*2.99792458E-11;
		decihertz=(edtValue)*2.99792458E-9;
		centihertz=(edtValue)*2.99792458E-8;
		millihertz=(edtValue)*2.99792458E-7;
		microhertz=(edtValue)*0.0002997925;
		nanohertz=(edtValue)*0.299792458;
		picohertz=(edtValue)*299.792458;
		femtohertz=(edtValue)*299792.458;
		attohertz=(edtValue)*299792458;
		cyclepersecond=(edtValue)*2.99792458E-10;
		wavelengthinexametres=(edtValue)*1;
		wavelengthinpetametres=(edtValue)*1000;
		wavelengthinterametres=(edtValue)*1000000;
		wavelengthingigametres=(edtValue)*1000000000;
		wavelengthinmegametres=(edtValue)*1000000000000.0;
		wavelengthinkilometres=(edtValue)*1000000000000000.0;
		wavelengthinhectometres=(edtValue)*10000000000000000.0;
		wavelengthindekametres=(edtValue)*100000000000000000.0;
		wavelengthinmetres=(edtValue)*1000000000000000000.0;
		wavelengthindecimetres=(edtValue)*10000000000000000000.0;
		wavelengthincentimetres=(edtValue)*100000000000000000000.0;
		wavelengthinmillimetres=(edtValue)*1.E+21;
		wavelengthinmicrometres=(edtValue)*1.E+24;
		ElectronComptonwavelength=(edtValue)*4.121483903E+29;
		ProtonComptonwavelength=(edtValue)*7.567673809E+32;
		NeutronComptonwavelength=(edtValue)*7.578105066E+32;
			
			break;	
		case "Wavelength in petametres -Pm":
			
			hertz=(edtValue)*2.99792458E-7;
			exahertz=(edtValue)*2.99792458E-25;
			petahertz=(edtValue)*2.99792458E-22;
			terahertz=(edtValue)*2.99792458E-19;
			gigahertz=(edtValue)*2.99792458E-16;
			megahertz=(edtValue)*2.99792458E-13;
			kilohertz=(edtValue)*2.99792458E-10;
			hectohertz=(edtValue)*2.99792458E-9;
			dekahertz=(edtValue)*2.99792458E-8;
			decihertz=(edtValue)*0.0000029979;
			centihertz=(edtValue)*0.0000299792;
			millihertz=(edtValue)*0.0002997925;
			microhertz=(edtValue)*0.299792458;
			nanohertz=(edtValue)*299.792458;
			picohertz=(edtValue)*299792.458;
			femtohertz=(edtValue)*299792458;
			attohertz=(edtValue)*299792458000.0;
			cyclepersecond=(edtValue)*2.99792458E-7;
			wavelengthinexametres=(edtValue)*0.001;
			wavelengthinpetametres=(edtValue)*1;
			wavelengthinterametres=(edtValue)*1000;
			wavelengthingigametres=(edtValue)*1000000;
			wavelengthinmegametres=(edtValue)*1000000000;
			wavelengthinkilometres=(edtValue)*1000000000000.0;
			wavelengthinhectometres=(edtValue)*10000000000000.0;
			wavelengthindekametres=(edtValue)*100000000000000.0;
			wavelengthinmetres=(edtValue)*1000000000000000.0;
			wavelengthindecimetres=(edtValue)*10000000000000000.0;
			wavelengthincentimetres=(edtValue)*100000000000000000.0;
			wavelengthinmillimetres=(edtValue)*1000000000000000000.0;
			wavelengthinmicrometres=(edtValue)*1.E+21;
			ElectronComptonwavelength=(edtValue)*4.121483903E+26;
			ProtonComptonwavelength=(edtValue)*7.567673809E+29;
			NeutronComptonwavelength=(edtValue)*7.578105066E+29;
			
			break;
			
		case "Wavelength in terametres -Tm":
			
			hertz=(edtValue)*0.0002997925;
			exahertz=(edtValue)*2.99792458E-22;
			petahertz=(edtValue)*2.997924579E-19;
			terahertz=(edtValue)*2.99792458E-16;
			gigahertz=(edtValue)*2.99792458E-13;
			megahertz=(edtValue)*2.997924579E-10;
			kilohertz=(edtValue)*2.99792458E-7;
			hectohertz=(edtValue)*0.0000029979;
			dekahertz=(edtValue)*0.0000299792;
			decihertz=(edtValue)*0.0029979246;
			centihertz=(edtValue)*0.0299792458;
			millihertz=(edtValue)*0.299792458;
			microhertz=(edtValue)*299.792458;
			nanohertz=(edtValue)*299792.458;
			picohertz=(edtValue)*299792458;
			femtohertz=(edtValue)*299792458000.0;
			attohertz=(edtValue)*299792458000000.0;
			cyclepersecond=(edtValue)*0.0002997925;
			wavelengthinexametres=(edtValue)*0.000001;
			wavelengthinpetametres=(edtValue)*0.001;
			wavelengthinterametres=(edtValue)*1;
			wavelengthingigametres=(edtValue)*1000;
			wavelengthinmegametres=(edtValue)*1000000;
			wavelengthinkilometres=(edtValue)*1000000000;
			wavelengthinhectometres=(edtValue)*10000000000.0;
			wavelengthindekametres=(edtValue)*100000000000.0;
			wavelengthinmetres=(edtValue)*1000000000000.0;
			wavelengthindecimetres=(edtValue)*10000000000000.0;
			wavelengthincentimetres=(edtValue)*100000000000000.0;
			wavelengthinmillimetres=(edtValue)*1000000000000000.0;
			wavelengthinmicrometres=(edtValue)*1000000000000000000.0;
			ElectronComptonwavelength=(edtValue)*4.121483903E+23;
			ProtonComptonwavelength=(edtValue)*7.567673809E+26;
			NeutronComptonwavelength=(edtValue)*7.578105066E+26;
			
			break;		
			
		case "Wavelength in gigametres -Gm":
			
			hertz=(edtValue)*0.299792458;
			exahertz=(edtValue)*2.99792458E-19;
			petahertz=(edtValue)*2.99792458E-16;
			terahertz=(edtValue)*2.99792458E-13;
			gigahertz=(edtValue)*2.99792458E-10;
			megahertz=(edtValue)*2.99792458E-7;
			kilohertz=(edtValue)*0.0002997925;
			hectohertz=(edtValue)*0.0029979246;
			dekahertz=(edtValue)*0.0299792458;
			decihertz=(edtValue)*2.99792458;
			centihertz=(edtValue)*29.9792458;
			millihertz=(edtValue)*299.792458;
			microhertz=(edtValue)*299792.458;
			nanohertz=(edtValue)*299792458;
			picohertz=(edtValue)*299792458000.0;
			femtohertz=(edtValue)*299792458000000.0;
			attohertz=(edtValue)*299792458000000000.0;
			cyclepersecond=(edtValue)*0.299792458;
			wavelengthinexametres=(edtValue)*9.999999999E-10;
			wavelengthinpetametres=(edtValue)*0.000001;
			wavelengthinterametres=(edtValue)*0.001;
			wavelengthingigametres=(edtValue)*1;
			wavelengthinmegametres=(edtValue)*1000;
			wavelengthinkilometres=(edtValue)*1000000;
			wavelengthinhectometres=(edtValue)*10000000;
			wavelengthindekametres=(edtValue)*100000000;
			wavelengthinmetres=(edtValue)*1000000000;
			wavelengthindecimetres=(edtValue)*10000000000.0;
			wavelengthincentimetres=(edtValue)*100000000000.0;
			wavelengthinmillimetres=(edtValue)*1000000000000.0;
			wavelengthinmicrometres=(edtValue)*1000000000000000.0;
			ElectronComptonwavelength=(edtValue)*412148390335089740000.0;
			ProtonComptonwavelength=(edtValue)*7.567673809E+23;
			NeutronComptonwavelength=(edtValue)*7.578105066E+23;
			
			break;	
			
			
			
		case "Wavelength in megametres -Mm":
			
			hertz=(edtValue)*299.792458;
			exahertz=(edtValue)*2.99792458E-16;
			petahertz=(edtValue)*2.99792458E-13;
			terahertz=(edtValue)*2.997924579E-10;
			gigahertz=(edtValue)*2.99792458E-7;
			megahertz=(edtValue)*0.0002997925;
			kilohertz=(edtValue)*0.299792458;
			hectohertz=(edtValue)*2.99792458;
			dekahertz=(edtValue)*29.9792458;
			decihertz=(edtValue)*2997.92458;
			centihertz=(edtValue)*29979.2458;
			millihertz=(edtValue)*299792.458;
			microhertz=(edtValue)*299792458;
			nanohertz=(edtValue)*299792458000.0;
			picohertz=(edtValue)*299792458000000.0;
			femtohertz=(edtValue)*299792458000000000.0;
			attohertz=(edtValue)*299792457999999960000.0;
			cyclepersecond=(edtValue)*299.792458;
			wavelengthinexametres=(edtValue)*1.E-12;
			wavelengthinpetametres=(edtValue)*1.E-9;
			wavelengthinterametres=(edtValue)*0.000001;
			wavelengthingigametres=(edtValue)*0.001;
			wavelengthinmegametres=(edtValue)*1;
			wavelengthinkilometres=(edtValue)*1000;
			wavelengthinhectometres=(edtValue)*10000;
			wavelengthindekametres=(edtValue)*10000;
			wavelengthinmetres=(edtValue)*1000000;
			wavelengthindecimetres=(edtValue)*10000000;
			wavelengthincentimetres=(edtValue)*100000000;
			wavelengthinmillimetres=(edtValue)*1000000000;
			wavelengthinmicrometres=(edtValue)*1000000000000.0;
			ElectronComptonwavelength=(edtValue)*412148390335089800.0;
			ProtonComptonwavelength=(edtValue)*756767380952659000000.0;
			NeutronComptonwavelength=(edtValue)*757810506603138100000.0;
			
			break;
			
	
			
		case "Wavelength in kilometres -km":
			
			hertz=(edtValue)*299792.458;
			exahertz=(edtValue)*2.99792458E-13;
			petahertz=(edtValue)*2.99792458E-10;
			terahertz=(edtValue)*2.99792458E-7;
			gigahertz=(edtValue)*0.0002997925;
			megahertz=(edtValue)*0.299792458;
			kilohertz=(edtValue)*299.792458;
			hectohertz=(edtValue)*2997.92458;
			dekahertz=(edtValue)*29979.2458;
			decihertz=(edtValue)*2997924.58;
			centihertz=(edtValue)*29979245.8;
			millihertz=(edtValue)*299792458;
			microhertz=(edtValue)*299792458000.0;
			nanohertz=(edtValue)*299792458000000.0;
			picohertz=(edtValue)*299792458000000000.0;
			femtohertz=(edtValue)*299792458000000000000.0;
			attohertz=(edtValue)*2.99792458E+23;
			cyclepersecond=(edtValue)*299792.458;
			wavelengthinexametres=(edtValue)*9.999999999E-16;
			wavelengthinpetametres=(edtValue)*1.E-12;
			wavelengthinterametres=(edtValue)*9.999999999E-10;
			wavelengthingigametres=(edtValue)*0.000001;
			wavelengthinmegametres=(edtValue)*0.001;
			wavelengthinkilometres=(edtValue)*1;
			wavelengthinhectometres=(edtValue)*10;
			wavelengthindekametres=(edtValue)*100;
			wavelengthinmetres=(edtValue)*1000;
			wavelengthindecimetres=(edtValue)*10000;
			wavelengthincentimetres=(edtValue)*100000;
			wavelengthinmillimetres=(edtValue)*1000000;
			wavelengthinmicrometres=(edtValue)*1000000000;
			ElectronComptonwavelength=(edtValue)*412148390335090.0;
			ProtonComptonwavelength=(edtValue)*756767380952658800.0;
			NeutronComptonwavelength=(edtValue)*757810506603138000.0;
			
			break;		
	case "Wavelength in hectometres -hm":
			
		hertz=(edtValue)*2997924.58;
		exahertz=(edtValue)*2.99792458E-12;
		petahertz=(edtValue)*2.99792458E-9;
		terahertz=(edtValue)*0.0000029979;
		gigahertz=(edtValue)*0.0029979246;
		megahertz=(edtValue)*2.99792458;
		kilohertz=(edtValue)*2997.92458;
		hectohertz=(edtValue)*29979.2458;
		dekahertz=(edtValue)*299792.458;
		decihertz=(edtValue)*29979245.8;
		centihertz=(edtValue)*299792458;
		millihertz=(edtValue)*2997924580.0;
		microhertz=(edtValue)*2997924580000.0;
		nanohertz=(edtValue)*2997924580000000.0;
		picohertz=(edtValue)*2997924580000000000.0;
		femtohertz=(edtValue)*2.99792458E+21;
		attohertz=(edtValue)*2.99792458E+24;
		cyclepersecond=(edtValue)*2997924.58;
		wavelengthinexametres=(edtValue)*1.E-16;
		wavelengthinpetametres=(edtValue)*9.999999999E-14;
		wavelengthinterametres=(edtValue)*9.999999999E-11;
		wavelengthingigametres=(edtValue)*1.E-7;
		wavelengthinmegametres=(edtValue)*0.0001;
		wavelengthinkilometres=(edtValue)*0.1;
		wavelengthinhectometres=(edtValue)*1;
		wavelengthindekametres=(edtValue)*10;
		wavelengthinmetres=(edtValue)*100;
		wavelengthindecimetres=(edtValue)*1000;
		wavelengthincentimetres=(edtValue)*10000;
		wavelengthinmillimetres=(edtValue)*100000;
		wavelengthinmicrometres=(edtValue)*100000000;
		ElectronComptonwavelength=(edtValue)*41214839033509.0;
		ProtonComptonwavelength=(edtValue)*75676738095265890.0;
		NeutronComptonwavelength=(edtValue)*75781050660313810.0;
			
			break;	
		case "Wavelength in dekametres -dam":
			
			hertz=(edtValue)*29979245.8;
			exahertz=(edtValue)*2.99792458E-11;
			petahertz=(edtValue)*2.997924579E-8;
			terahertz=(edtValue)*0.0000299792;
			gigahertz=(edtValue)*0.0299792458;
			megahertz=(edtValue)*29.9792458;
			kilohertz=(edtValue)*29979.2458;
			hectohertz=(edtValue)*299792.458;
			dekahertz=(edtValue)*2997924.58;
			decihertz=(edtValue)*299792458;
			centihertz=(edtValue)*2997924580.0;
			millihertz=(edtValue)*29979245800.0;
			microhertz=(edtValue)*29979245800000.0;
			nanohertz=(edtValue)*29979245800000000.0;
			picohertz=(edtValue)*29979245800000000000.0;
			femtohertz=(edtValue)*2.99792458E+22;
			attohertz=(edtValue)*2.997924579E+25;
			cyclepersecond=(edtValue)*29979245.8;
			wavelengthinexametres=(edtValue)*1.E-17;
			wavelengthinpetametres=(edtValue)*1.E-14;
			wavelengthinterametres=(edtValue)*1.E-11;
			wavelengthingigametres=(edtValue)*1.E-8;
			wavelengthinmegametres=(edtValue)*0.00001;
			wavelengthinkilometres=(edtValue)*0.01;
			wavelengthinhectometres=(edtValue)*0.1;
			wavelengthindekametres=(edtValue)*1;
			wavelengthinmetres=(edtValue)*10;
			wavelengthindecimetres=(edtValue)*100;
			wavelengthincentimetres=(edtValue)*1000;
			wavelengthinmillimetres=(edtValue)*10000;
			wavelengthinmicrometres=(edtValue)*10000000;
			ElectronComptonwavelength=(edtValue)*4121483903351.0;
			ProtonComptonwavelength=(edtValue)*7567673809526590.0;
			NeutronComptonwavelength=(edtValue)*7578105066031382.0;
			
			break;
			
		case "Wavelength in metres -m":
			
			hertz=(edtValue)*299792458;
			exahertz=(edtValue)*2.99792458E-10;
			petahertz=(edtValue)*2.99792458E-7;
			terahertz=(edtValue)*0.0002997925;
			gigahertz=(edtValue)*0.299792458;
			megahertz=(edtValue)*299.792458;
			kilohertz=(edtValue)*299792.458;
			hectohertz=(edtValue)*2997924.58;
			dekahertz=(edtValue)*29979245.8;
			decihertz=(edtValue)*2997924580.0;
			centihertz=(edtValue)*29979245800.0;
			millihertz=(edtValue)*299792458000.0;
			microhertz=(edtValue)*299792458000.0;
			nanohertz=(edtValue)*299792458000000000.0;
			picohertz=(edtValue)*299792457999999960000.0;
			femtohertz=(edtValue)*2.997924579E+23;
			attohertz=(edtValue)*2.997924579E+26;
			cyclepersecond=(edtValue)*299792458;
			wavelengthinexametres=(edtValue)*1.E-18;
			wavelengthinpetametres=(edtValue)*1.E-15;
			wavelengthinterametres=(edtValue)*1.E-12;
			wavelengthingigametres=(edtValue)*1.E-9;
			wavelengthinmegametres=(edtValue)*0.000001;
			wavelengthinkilometres=(edtValue)*0.001;
			wavelengthinhectometres=(edtValue)*0.01;
			wavelengthindekametres=(edtValue)*0.1;
			wavelengthinmetres=(edtValue)*1;
			wavelengthindecimetres=(edtValue)*10;
			wavelengthincentimetres=(edtValue)*100;
			wavelengthinmillimetres=(edtValue)*1000;
			wavelengthinmicrometres=(edtValue)*1000000;
			ElectronComptonwavelength=(edtValue)*412148390335.0;
			ProtonComptonwavelength=(edtValue)*756767380952659.0;
			NeutronComptonwavelength=(edtValue)*757810506603138.0;
			
			break;		
			
			
	case "Wavelength in decimetres -dm":
			
			hertz=(edtValue)*2997924580.0;
			exahertz=(edtValue)*2.99792458E-9;
			petahertz=(edtValue)*0.0000029979;
			terahertz=(edtValue)*0.0029979246;
			gigahertz=(edtValue)*2.99792458;
			megahertz=(edtValue)*2997.92458;
			kilohertz=(edtValue)*2997924.58;
			hectohertz=(edtValue)*29979245.8;
			dekahertz=(edtValue)*299792458;
			decihertz=(edtValue)*29979245800.0;
			centihertz=(edtValue)*299792458000.0;
			millihertz=(edtValue)*2997924580000.0;
			microhertz=(edtValue)*2997924580000000.0;
			nanohertz=(edtValue)*2997924580000000000.0;
			picohertz=(edtValue)*2.99792458E+21;
			femtohertz=(edtValue)*2.99792458E+24;
			attohertz=(edtValue)*2.99792458E+27;
			cyclepersecond=(edtValue)*2997924580.0;
			wavelengthinexametres=(edtValue)*1.E-19;
			wavelengthinpetametres=(edtValue)*1.E-16;
			wavelengthinterametres=(edtValue)*1.E-13;
			wavelengthingigametres=(edtValue)*1.E-10;
			wavelengthinmegametres=(edtValue)*1.E-7;
			wavelengthinkilometres=(edtValue)*0.0001;
			wavelengthinhectometres=(edtValue)*0.001;
			wavelengthindekametres=(edtValue)*0.01;
			wavelengthinmetres=(edtValue)*0.1;
			wavelengthindecimetres=(edtValue)*1;
			wavelengthincentimetres=(edtValue)*10;
			wavelengthinmillimetres=(edtValue)*100;
			wavelengthinmicrometres=(edtValue)*100000;
			ElectronComptonwavelength=(edtValue)*41214839034.0;
			ProtonComptonwavelength=(edtValue)*75676738095266.0;
			NeutronComptonwavelength=(edtValue)*75781050660314.0;
			break;
			
	case "Wavelength in centimetres -cm":
		
		hertz=(edtValue)*29979245800.0;
		exahertz=(edtValue)*2.99792458E-8;
		petahertz=(edtValue)*0.0000299792;
		terahertz=(edtValue)*0.0299792458;
		gigahertz=(edtValue)*29.9792458;
		megahertz=(edtValue)*29979.2458;
		kilohertz=(edtValue)*29979245.8;
		hectohertz=(edtValue)*299792458;
		dekahertz=(edtValue)*2997924580.0;
		decihertz=(edtValue)*299792458000.0;
		centihertz=(edtValue)*2997924580000.0;
		millihertz=(edtValue)*29979245800000.0;
		microhertz=(edtValue)*29979245800000000.0;
		nanohertz=(edtValue)*29979245800000000000.0;
		picohertz=(edtValue)*2.99792458E+22;
		femtohertz=(edtValue)*2.99792458E+25;
		attohertz=(edtValue)*2.99792458E+28;
		cyclepersecond=(edtValue)*29979245800.0;
		wavelengthinexametres=(edtValue)*1.E-20;
		wavelengthinpetametres=(edtValue)*9.999999999E-18;
		wavelengthinterametres=(edtValue)*9.999999999E-15;
		wavelengthingigametres=(edtValue)*1.E-11;
		wavelengthinmegametres=(edtValue)*9.999999999E-9;
		wavelengthinkilometres=(edtValue)*0.00001;
		wavelengthinhectometres=(edtValue)*0.0001;
		wavelengthindekametres=(edtValue)*0.001;
		wavelengthinmetres=(edtValue)*0.01;
		wavelengthindecimetres=(edtValue)*0.1;
		wavelengthincentimetres=(edtValue)*1;
		wavelengthinmillimetres=(edtValue)*10;
		wavelengthinmicrometres=(edtValue)*10000;
		ElectronComptonwavelength=(edtValue)*4121483903.4;
		ProtonComptonwavelength=(edtValue)*7567673809527.0;
		NeutronComptonwavelength=(edtValue)*7578105066031.0;
		break;
			
	case "Wavelength in millimetres -mm":
		
		hertz=(edtValue)*299792458000.0;
		exahertz=(edtValue)*2.99792458E-7;
		petahertz=(edtValue)*0.0002997925;
		terahertz=(edtValue)*0.299792458;
		gigahertz=(edtValue)*299.792458;
		megahertz=(edtValue)*299792.458;
		kilohertz=(edtValue)*299792458;
		hectohertz=(edtValue)*2997924580.0;
		dekahertz=(edtValue)*29979245800.0;
		decihertz=(edtValue)*2997924580000.0;
		centihertz=(edtValue)*29979245800000.0;
		millihertz=(edtValue)*299792458000000.0;
		microhertz=(edtValue)*299792458000000000.0;
		nanohertz=(edtValue)*299792458000000000000.0;
		picohertz=(edtValue)*2.99792458E+23;
		femtohertz=(edtValue)*2.99792458E+26;
		attohertz=(edtValue)*2.99792458E+29;
		cyclepersecond=(edtValue)*299792458000.0;
		wavelengthinexametres=(edtValue)*1.E-21;
		wavelengthinpetametres=(edtValue)*9.999999999E-19;
		wavelengthinterametres=(edtValue)*9.999999999E-16;
		wavelengthingigametres=(edtValue)*1.E-12;
		wavelengthinmegametres=(edtValue)*9.999999999E-10;
		wavelengthinkilometres=(edtValue)*0.000001;
		wavelengthinhectometres=(edtValue)*0.00001;
		wavelengthindekametres=(edtValue)*0.0001;
		wavelengthinmetres=(edtValue)*0.001;
		wavelengthindecimetres=(edtValue)*0.01;
		wavelengthincentimetres=(edtValue)*0.1;
		wavelengthinmillimetres=(edtValue)*1;
		wavelengthinmicrometres=(edtValue)*1000;
		ElectronComptonwavelength=(edtValue)*412148390.34;
		ProtonComptonwavelength=(edtValue)*756767380953.0;
		NeutronComptonwavelength=(edtValue)*757810506603.0;
		break;
		
	case "Wavelength in micrometres -μm":
		
		hertz=(edtValue)*299792458000000.0;
		exahertz=(edtValue)*0.0002997925;
		petahertz=(edtValue)*0.299792458;
		terahertz=(edtValue)*299.792458;
		gigahertz=(edtValue)*299792.458;
		megahertz=(edtValue)*299792458.0;
		kilohertz=(edtValue)*299792458000.0;
		hectohertz=(edtValue)*2997924580000.0;
		dekahertz=(edtValue)*29979245800000.0;
		decihertz=(edtValue)*2997924580000000.0;
		centihertz=(edtValue)*2997924580000000.0;
		millihertz=(edtValue)*299792458000000000.0;
		microhertz=(edtValue)*299792457999999960000.0;
		nanohertz=(edtValue)*2.997924579E+23;
		picohertz=(edtValue)*2.997924579E+26;
		femtohertz=(edtValue)*2.99792458E+29;
		attohertz=(edtValue)*2.99792458E+32;
		cyclepersecond=(edtValue)*299792458000000.0;
		wavelengthinexametres=(edtValue)*1.E-24;
		wavelengthinpetametres=(edtValue)*1.E-21;
		wavelengthinterametres=(edtValue)*1.E-18;
		wavelengthingigametres=(edtValue)*1.E-15;
		wavelengthinmegametres=(edtValue)*1.E-12;
		wavelengthinkilometres=(edtValue)*1.E-9;
		wavelengthinhectometres=(edtValue)*1.E-8;
		wavelengthindekametres=(edtValue)*1.E-7;
		wavelengthinmetres=(edtValue)*0.000001;
		wavelengthindecimetres=(edtValue)*0.00001;
		wavelengthincentimetres=(edtValue)*0.0001;
		wavelengthinmillimetres=(edtValue)*0.001;
		wavelengthinmicrometres=(edtValue)*1;
		ElectronComptonwavelength=(edtValue)*412148.39034;
		ProtonComptonwavelength=(edtValue)*756767380.95;
		NeutronComptonwavelength=(edtValue)*757810506.6;
		break;
		
	case "Electron Compton wavelength -e-":
		
		hertz=(edtValue)*123558978999300000000.0;
		exahertz=(edtValue)*123.558979;
		petahertz=(edtValue)*123558.979;
		terahertz=(edtValue)*123558979.0;
		gigahertz=(edtValue)*123558978999.0;
		megahertz=(edtValue)*123558978999300.0;
		kilohertz=(edtValue)*123558978999300000.0;
		hectohertz=(edtValue)*1235589789993000000.0;
		dekahertz=(edtValue)*12355897899930000000.0;
		decihertz=(edtValue)*1.235589789E+21;
		centihertz=(edtValue)*1.235589789E+22;
		millihertz=(edtValue)*1.235589789E+23;
		microhertz=(edtValue)*1.235589789E+26;
		nanohertz=(edtValue)*1.235589789E+29;
		picohertz=(edtValue)*1.235589789E+32;
		femtohertz=(edtValue)*1.235589789E+35;
		attohertz=(edtValue)*1.235589789E+38;
		cyclepersecond=(edtValue)*123558978999300000000.0;
		wavelengthinexametres=(edtValue)*2.42631058E-30;
		wavelengthinpetametres=(edtValue)*2.42631058E-27;
		wavelengthinterametres=(edtValue)*2.42631058E-24;
		wavelengthingigametres=(edtValue)*2.42631058E-21;
		wavelengthinmegametres=(edtValue)*2.42631058E-18;
		wavelengthinkilometres=(edtValue)*2.42631058E-15;
		wavelengthinhectometres=(edtValue)*2.42631058E-14;
		wavelengthindekametres=(edtValue)*2.42631058E-13;
		wavelengthinmetres=(edtValue)*2.42631058E-12;
		wavelengthindecimetres=(edtValue)*2.42631058E-11;
		wavelengthincentimetres=(edtValue)*2.42631058E-10;
		wavelengthinmillimetres=(edtValue)*2.42631058E-9;
		wavelengthinmicrometres=(edtValue)*0.0000024263;
		ElectronComptonwavelength=(edtValue)*1;
		ProtonComptonwavelength=(edtValue)*1836.152703;
		NeutronComptonwavelength=(edtValue)*1838.6836498;
		break;
		
	case "Proton Compton wavelength -p":
		
		hertz=(edtValue)*2.268731532E+23;
		exahertz=(edtValue)*226873.15327;
		petahertz=(edtValue)*226873153.27;
		terahertz=(edtValue)*226873153270.0;
		gigahertz=(edtValue)*226873153270020.0;
		megahertz=(edtValue)*226873153270020000.0;
		kilohertz=(edtValue)*226873153270020000000.0;
		hectohertz=(edtValue)*2.268731532E+21;
		dekahertz=(edtValue)*2.268731532E+22;
		decihertz=(edtValue)*2.268731532E+24;
		centihertz=(edtValue)*2.268731532E+25;
		millihertz=(edtValue)*2.268731532E+26;
		microhertz=(edtValue)*2.268731532E+29;
		nanohertz=(edtValue)*2.268731532E+32;
		picohertz=(edtValue)*2.268731532E+35;
		femtohertz=(edtValue)*2.268731532E+38;
		attohertz=(edtValue)*2.268731532E+41;
		cyclepersecond=(edtValue)*2.268731532E+23;
		wavelengthinexametres=(edtValue)*1.321410019E-33;
		wavelengthinpetametres=(edtValue)*1.321410019E-30;
		wavelengthinterametres=(edtValue)*1.321410019E-27;
		wavelengthingigametres=(edtValue)*1.321410019E-24;
		wavelengthinmegametres=(edtValue)*1.321410019E-21;
		wavelengthinkilometres=(edtValue)*1.321410019E-18;
		wavelengthinhectometres=(edtValue)*1.321410019E-17;
		wavelengthindekametres=(edtValue)*1.321410019E-16;
		wavelengthinmetres=(edtValue)*1.321410019E-15;
		wavelengthindecimetres=(edtValue)*1.321410019E-14;
		wavelengthincentimetres=(edtValue)*1.321410019E-13;
		wavelengthinmillimetres=(edtValue)*1.321410019E-12;
		wavelengthinmicrometres=(edtValue)*1.321410019E-9;
		ElectronComptonwavelength=(edtValue)*0.000544617;
		ProtonComptonwavelength=(edtValue)*1;
		NeutronComptonwavelength=(edtValue)*1.0013783967;
		break;
		
case "Neutron Compton wavelength -n":
		
		hertz=(edtValue)*2.271858744E+23;
		exahertz=(edtValue)*227185.87447;
		petahertz=(edtValue)*227185874.47;
		terahertz=(edtValue)*227185874473.0;
		gigahertz=(edtValue)*227185874472780.0;
		megahertz=(edtValue)*227185874472780000.0;
		kilohertz=(edtValue)*227185874472780000000.0;
		hectohertz=(edtValue)*2.271858744E+21;
		dekahertz=(edtValue)*2.271858744E+22;
		decihertz=(edtValue)*2.271858744E+24;
		centihertz=(edtValue)*2.271858744E+25;
		millihertz=(edtValue)*2.271858744E+26;
		microhertz=(edtValue)*2.271858744E+29;
		nanohertz=(edtValue)*2.271858744E+32;
		picohertz=(edtValue)*2.271858744E+35;
		femtohertz=(edtValue)*2.271858744E+38;
		attohertz=(edtValue)*2.271858744E+41;
		cyclepersecond=(edtValue)*2.271858744E+23;
		wavelengthinexametres=(edtValue)*1.3195911E-33;
		wavelengthinpetametres=(edtValue)*1.3195911E-30;
		wavelengthinterametres=(edtValue)*1.3195911E-27;
		wavelengthingigametres=(edtValue)*1.3195911E-24;
		wavelengthinmegametres=(edtValue)*1.3195911E-21;
		wavelengthinkilometres=(edtValue)*1.3195911E-18;
		wavelengthinhectometres=(edtValue)*1.3195911E-17;
		wavelengthindekametres=(edtValue)*1.3195911E-16;
		wavelengthinmetres=(edtValue)*1.3195911E-15;
		wavelengthindecimetres=(edtValue)*1.3195911E-14;
		wavelengthincentimetres=(edtValue)*1.3195911E-13;
		wavelengthinmillimetres=(edtValue)*1.3195911E-12;
		wavelengthinmicrometres=(edtValue)*1.3195911E-9;
		ElectronComptonwavelength=(edtValue)*0.0005438673;
		ProtonComptonwavelength=(edtValue)*0.9986235007;
		NeutronComptonwavelength=(edtValue)*1;
		
		break;
		
		
		case "Default":
			break;
			
		}
		 results.setHertz(hertz);
		 results.setExahertz(exahertz);
		 results.setPetahertz(petahertz);
		 results.setTerahertz(terahertz);
		 results.setGigahertz(gigahertz);
		 results.setMegahertz(megahertz);
		 results.setKilohertz(kilohertz);
		 results.setHectohertz(hectohertz);
		 results.setDekahertz(dekahertz);
		 results.setDecihertz(decihertz);
		 results.setCentihertz(centihertz);
		 results.setMillihertz(millihertz);
		 results.setMicrohertz(microhertz);
		 results.setNanohertz(nanohertz);
		 results.setPicohertz(picohertz);
		 results.setFemtohertz(femtohertz);
		 results.setAttohertz(attohertz);
		 results.setCyclepersecond(cyclepersecond);
		 results.setWavelengthinexametres(wavelengthinexametres);
		 results.setWavelengthinpetametres(wavelengthinpetametres);
		 results.setWavelengthinterametres(wavelengthinterametres);
		 results.setWavelengthingigametres(wavelengthingigametres);
		 results.setWavelengthinmegametres(wavelengthinmegametres);
		 results.setWavelengthinkilometres(wavelengthinkilometres);
		 results.setWavelengthinhectometres(wavelengthinhectometres);
		 results.setWavelengthindekametres(wavelengthindekametres);
		 results.setWavelengthinmetres(wavelengthinmetres);
		 results.setWavelengthindecimetres(wavelengthindecimetres);
		 results.setWavelengthincentimetres(wavelengthincentimetres);
		 results.setWavelengthinmillimetres(wavelengthinmillimetres);
		 results.setWavelengthinmicrometres(wavelengthinmicrometres);
		 results.setElectronComptonwavelength(ElectronComptonwavelength);
		 results.setProtonComptonwavelength(ProtonComptonwavelength);
		 results.setNeutronComptonwavelength(NeutronComptonwavelength);
		 
		 converterArray.add(results);
		return converterArray;
}

public 	class ConversionResults{
		private double hertz,exahertz,petahertz,terahertz,gigahertz,megahertz,kilohertz, hectohertz,dekahertz,decihertz,centihertz,millihertz,microhertz,nanohertz,picohertz,femtohertz
		,attohertz,cyclepersecond,wavelengthinexametres,wavelengthinpetametres,wavelengthinterametres,wavelengthingigametres,wavelengthinmegametres,wavelengthinkilometres,
		wavelengthinhectometres,wavelengthindekametres,wavelengthinmetres,wavelengthindecimetres,wavelengthincentimetres,wavelengthinmillimetres,wavelengthinmicrometres,ElectronComptonwavelength
		,ProtonComptonwavelength,NeutronComptonwavelength;

		public double getHertz() {
			return hertz;
		}

		public void setHertz(double hertz) {
			this.hertz = hertz;
		}

		public double getExahertz() {
			return exahertz;
		}

		public void setExahertz(double exahertz) {
			this.exahertz = exahertz;
		}

		public double getPetahertz() {
			return petahertz;
		}

		public void setPetahertz(double petahertz) {
			this.petahertz = petahertz;
		}

		public double getTerahertz() {
			return terahertz;
		}

		public void setTerahertz(double terahertz) {
			this.terahertz = terahertz;
		}

		public double getGigahertz() {
			return gigahertz;
		}

		public void setGigahertz(double gigahertz) {
			this.gigahertz = gigahertz;
		}

		public double getMegahertz() {
			return megahertz;
		}

		public void setMegahertz(double megahertz) {
			this.megahertz = megahertz;
		}

		public double getKilohertz() {
			return kilohertz;
		}

		public void setKilohertz(double kilohertz) {
			this.kilohertz = kilohertz;
		}

		public double getHectohertz() {
			return hectohertz;
		}

		public void setHectohertz(double hectohertz) {
			this.hectohertz = hectohertz;
		}

		public double getDekahertz() {
			return dekahertz;
		}

		public void setDekahertz(double dekahertz) {
			this.dekahertz = dekahertz;
		}

		public double getDecihertz() {
			return decihertz;
		}

		public void setDecihertz(double decihertz) {
			this.decihertz = decihertz;
		}

		public double getCentihertz() {
			return centihertz;
		}

		public void setCentihertz(double centihertz) {
			this.centihertz = centihertz;
		}

		public double getMillihertz() {
			return millihertz;
		}

		public void setMillihertz(double millihertz) {
			this.millihertz = millihertz;
		}

		public double getMicrohertz() {
			return microhertz;
		}

		public void setMicrohertz(double microhertz) {
			this.microhertz = microhertz;
		}

		public double getNanohertz() {
			return nanohertz;
		}

		public void setNanohertz(double nanohertz) {
			this.nanohertz = nanohertz;
		}

		public double getPicohertz() {
			return picohertz;
		}

		public void setPicohertz(double picohertz) {
			this.picohertz = picohertz;
		}

		public double getFemtohertz() {
			return femtohertz;
		}

		public void setFemtohertz(double femtohertz) {
			this.femtohertz = femtohertz;
		}

		public double getAttohertz() {
			return attohertz;
		}

		public void setAttohertz(double attohertz) {
			this.attohertz = attohertz;
		}

		public double getCyclepersecond() {
			return cyclepersecond;
		}

		public void setCyclepersecond(double cyclepersecond) {
			this.cyclepersecond = cyclepersecond;
		}

		public double getWavelengthinexametres() {
			return wavelengthinexametres;
		}

		public void setWavelengthinexametres(double wavelengthinexametres) {
			this.wavelengthinexametres = wavelengthinexametres;
		}

		public double getWavelengthinpetametres() {
			return wavelengthinpetametres;
		}

		public void setWavelengthinpetametres(double wavelengthinpetametres) {
			this.wavelengthinpetametres = wavelengthinpetametres;
		}

		public double getWavelengthinterametres() {
			return wavelengthinterametres;
		}

		public void setWavelengthinterametres(double wavelengthinterametres) {
			this.wavelengthinterametres = wavelengthinterametres;
		}

		public double getWavelengthingigametres() {
			return wavelengthingigametres;
		}

		public void setWavelengthingigametres(double wavelengthingigametres) {
			this.wavelengthingigametres = wavelengthingigametres;
		}

		public double getWavelengthinmegametres() {
			return wavelengthinmegametres;
		}

		public void setWavelengthinmegametres(double wavelengthinmegametres) {
			this.wavelengthinmegametres = wavelengthinmegametres;
		}

		public double getWavelengthinkilometres() {
			return wavelengthinkilometres;
		}

		public void setWavelengthinkilometres(double wavelengthinkilometres) {
			this.wavelengthinkilometres = wavelengthinkilometres;
		}

		public double getWavelengthinhectometres() {
			return wavelengthinhectometres;
		}

		public void setWavelengthinhectometres(double wavelengthinhectometres) {
			this.wavelengthinhectometres = wavelengthinhectometres;
		}

		public double getWavelengthindekametres() {
			return wavelengthindekametres;
		}

		public void setWavelengthindekametres(double wavelengthindekametres) {
			this.wavelengthindekametres = wavelengthindekametres;
		}

		public double getWavelengthinmetres() {
			return wavelengthinmetres;
		}

		public void setWavelengthinmetres(double wavelengthinmetres) {
			this.wavelengthinmetres = wavelengthinmetres;
		}

		public double getWavelengthindecimetres() {
			return wavelengthindecimetres;
		}

		public void setWavelengthindecimetres(double wavelengthindecimetres) {
			this.wavelengthindecimetres = wavelengthindecimetres;
		}

		public double getWavelengthincentimetres() {
			return wavelengthincentimetres;
		}

		public void setWavelengthincentimetres(double wavelengthincentimetres) {
			this.wavelengthincentimetres = wavelengthincentimetres;
		}

		public double getWavelengthinmillimetres() {
			return wavelengthinmillimetres;
		}

		public void setWavelengthinmillimetres(double wavelengthinmillimetres) {
			this.wavelengthinmillimetres = wavelengthinmillimetres;
		}

		public double getWavelengthinmicrometres() {
			return wavelengthinmicrometres;
		}

		public void setWavelengthinmicrometres(double wavelengthinmicrometres) {
			this.wavelengthinmicrometres = wavelengthinmicrometres;
		}

		public double getElectronComptonwavelength() {
			return ElectronComptonwavelength;
		}

		public void setElectronComptonwavelength(double electronComptonwavelength) {
			ElectronComptonwavelength = electronComptonwavelength;
		}

		public double getProtonComptonwavelength() {
			return ProtonComptonwavelength;
		}

		public void setProtonComptonwavelength(double protonComptonwavelength) {
			ProtonComptonwavelength = protonComptonwavelength;
		}

		public double getNeutronComptonwavelength() {
			return NeutronComptonwavelength;
		}

		public void setNeutronComptonwavelength(double neutronComptonwavelength) {
			NeutronComptonwavelength = neutronComptonwavelength;
		}

	
		
	}
}