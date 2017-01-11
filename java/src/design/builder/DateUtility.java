package design.builder;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.SimpleFormatter;



public class DateUtility {
	private static Locale  DEFALUT = Locale.TAIWAN ;
	
	public static IDateFormate getToday(){
		Date today = new Date() ; 
		IDateFormate df = new DateFormate(today) ;
		
		return df ;
	}
	
	public static IDateFormate getToday(String dateform ){
		Date today = new Date() ; 
		IDateFormate df = new DateFormate(today, dateform) ;
		
		return df ;
	}
	
	public static IDateFormate getToday(String dateform, String timeform){
		Date today = new Date() ; 
		IDateFormate df = new DateFormate(today, dateform," "+timeform) ;
		
		return df ;
	}
	
	public static  IDateFormate AddedDateFacts(DateBuilder dateBuilder) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat(dateBuilder.getFormat()) ;
		Date calDate = sdf.parse(dateBuilder.getDate()) ;
		Calendar c = Calendar.getInstance() ; 
		c.setTime(calDate);
		c.add(Calendar.YEAR,  dateBuilder.getYear());
		c.add(Calendar.MONTH, dateBuilder.getMonth());
		c.add(Calendar.DAY_OF_MONTH, dateBuilder.getDay());
		c.add(Calendar.HOUR, dateBuilder.getHour());
		c.add(Calendar.MINUTE, dateBuilder.getMinute());
		c.add(Calendar.SECOND, dateBuilder.getSecond());
		Date afterDate = c.getTime() ;
		
		IDateFormate df = new DateFormate(afterDate, dateBuilder.getFormat()) ;

		return df ;
	}
	
public static IDateFormate MinusDateFacts(DateBuilder dateBuilder) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat(dateBuilder.getFormat()) ;

	Date calDate = sdf.parse(dateBuilder.getDate()) ;
	Calendar c = Calendar.getInstance() ;
	c.setTime(calDate);
	c.add(Calendar.YEAR,  dateBuilder.getYear());
	c.add(Calendar.MONTH, dateBuilder.getMonth());
	c.add(Calendar.DAY_OF_MONTH, dateBuilder.getDay());
	c.add(Calendar.HOUR, dateBuilder.getHour());
	c.add(Calendar.MINUTE, dateBuilder.getMinute());
	c.add(Calendar.SECOND, dateBuilder.getSecond());
	Date afterDate = c.getTime() ;
		
		IDateFormate df = new DateFormate(afterDate, dateBuilder.getFormat()) ;

		return df ;
	}

public static boolean betweenDateRange(String date1, String date2, String checkDateStr,String formate){
	boolean isSuccess = false ;
	SimpleDateFormat sdf1 = new SimpleDateFormat(formate);
	SimpleDateFormat sdf2 = new SimpleDateFormat(formate);
	SimpleDateFormat checksdf = new SimpleDateFormat(formate) ; 
	
	try {
		Date d1 = sdf1.parse(date1) ;
		Date d2 = sdf2.parse(date2) ;
		Date check = checksdf.parse(checkDateStr)  ;
		
		if(d2.getTime()-d1.getTime()>=0){
			if(check.before(d2) && check.after(d1) ){
				isSuccess = true ;
			}
		}else{
			if(check.before(d1) && check.after(d2) ){
				isSuccess = true ;
			}
		}
		
		
		
	} catch (ParseException e) {
		
		e.printStackTrace();
		return isSuccess ;
	} 
	
	
	return isSuccess ;
}

	/**
	 * �ഫ����榡
	 * @param dateStr
	 * @param orgFormate �즳�榡 ex:yyyyMMdd
	 * @param converFormate �ഫ�榡 ex: yyyy/MM/dd
	 * @return
	 * @since 2015�~5��13�� �U��3:01:41
	 */
	public static IDateFormate converterDate(String dateStr, String orgFormate,String converFormate){
		  
		SimpleDateFormat orgsdf = new SimpleDateFormat(orgFormate);
		
		Date d1;
		IDateFormate df =null;
		
		try {
			d1 = orgsdf.parse(dateStr);
			df = new DateFormate(d1, converFormate) ;
		} catch (ParseException e) {
			 
			e.printStackTrace();
		}
		
	 
		return df ;
	}
	
	
}
