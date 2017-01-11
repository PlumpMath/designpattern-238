package design.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


/**
 * Name: builder
 * Description :  日期建立可以自由輸入年 月 日後，建立日期
 * Created by blackbryant on 2017/1/7.
 */
public class DateBuilder {
	private Locale locale ; 
	private String format ; 
	private int day ; 
	private int month ; 
	private int year ; 
	private int hour ;
	private int minute ; 
	private int second ;
	private String date ; 
	
	public static class Builder{
		private Locale locale ; 
		private String format ; 
		private int day ; 
		private int month ; 
		private int year ; 
		private int hour ;
		private int minute ; 
		private int second ;
		private String date ; 
		
		
		public Builder(String calDate, String formate){
			this.date = calDate ;
			this.format = formate ;
		}
		
		public DateBuilder build(){
			return new DateBuilder(this) ;
		}
		
		
		public Builder addDay(int day){
			this.day = day  ; 
			return this;
		}
		
		
		public Builder addMonth(int month){
			this.month = month  ; 
			return this;
		}
		
		public Builder addYear(int year){
			this.year = year  ; 
			return this;
		}
		
		public Builder addHour(int hour){
			this.hour = hour;
			return this;
		}
		
		public Builder addMinute(int minute){
			this.minute = minute ; 
			return this ;
		}
		
		 
		public Builder addSecond(int second){
			this.second = second ;
			return this;
		}
		 
		public Builder setformat(String format){
			this.format = format ; 
			return this ;
		}
	}
	
	private DateBuilder(Builder builder){
		this.locale = builder.locale ;
		this.year = builder.year ; 
		this.month = builder.month ; 
		this.day = builder.day ; 
		this.hour = builder.hour ; 
		this.minute = builder.minute ; 
		this.second = builder.second ; 
		this.format = builder.format ;
		this.date = builder.date ;
	}
	
	
	public Locale getLocale() {
		return locale;
	}

	public String getFormat() {
		return format;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public String getDate(){
		return date ;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder() ; 
		sb.append("locale="+this.locale) ; 
		sb.append("year="+this.year) ; 
		sb.append("month="+this.month) ; 
		sb.append("day="+this.day) ; 
		sb.append("hour="+this.hour) ; 
		sb.append("minute="+this.minute) ; 
		sb.append("second="+this.second) ; 
		sb.append("format="+this.format) ; 
		
		return sb.toString();
		
	}


	public  static  void main(String[] args){
		DateBuilder dateBuilder = new DateBuilder.Builder("2001-05-05","yyyy-MM-dd").addDay(2).build() ;

		SimpleDateFormat sdf = new SimpleDateFormat(dateBuilder.getFormat()) ;

		try {
			Date calDate = sdf.parse(dateBuilder.getDate());
			Calendar c = Calendar.getInstance() ;
			c.setTime(calDate);
			c.add(Calendar.YEAR,  dateBuilder.getYear());
			c.add(Calendar.MONTH, dateBuilder.getMonth());
			c.add(Calendar.DAY_OF_MONTH, dateBuilder.getDay());
			c.add(Calendar.HOUR, dateBuilder.getHour());
			c.add(Calendar.MINUTE, dateBuilder.getMinute());
			c.add(Calendar.SECOND, dateBuilder.getSecond());
			Date afterDate = c.getTime() ;
			System.out.print("add 1 day : " +afterDate.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}



}
