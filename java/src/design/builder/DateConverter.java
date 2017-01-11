package design.builder;

import java.util.Locale;

public class DateConverter {
	public static IDateFormate dateConverter(IDateFormate df, Locale locale){
		if(locale==Locale.TAIWAN){
			IDateFormate twdate = new  ChinaDateFormate(df.getDate()) ;
			System.out.println(twdate.getYear());
		}
		
		
		return null ;
	} 
	
	
	
	
	
}
