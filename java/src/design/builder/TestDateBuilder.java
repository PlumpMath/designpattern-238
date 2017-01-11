package design.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by bryant on 2017/1/8.
 */
public class TestDateBuilder {

    public  static  void main(String[] args){
        DateBuilder dateBuilder = new DateBuilder.Builder("2001-01-01","yyyy-MM-dd").addDay(2).build() ;

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
