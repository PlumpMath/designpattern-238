package design.builder;

import java.util.Date;


public abstract class IDateFormate {
	
		
	public abstract int getYear() ; 
	public abstract int getMonth() ; 
	public abstract int getDay() ; 
	public abstract int getHour() ; 
	public abstract int getMinute() ; 
	public abstract int getSecond() ; 
	public abstract int getMillisecond() ; 
	public abstract int getWeek() ; 
	public abstract int getMaxDayOfMonth() ;
	public abstract Long getTimeInMill() ; 
	 
	public abstract String toWesternDate() ; 
	public abstract String toWesternTime() ; 
	public abstract String getFormate() ; 
	
	protected abstract Date getDate() ;
	
}
