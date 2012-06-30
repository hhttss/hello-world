package test;

import java.util.*;
import java.text.*;

public class TimeTrans {
	public TimeTrans(){
		
	}
	
	public String getTime(){
		Calendar c =Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);
		int minute=c.get(Calendar.MINUTE);
	    int hour=c.get(Calendar.HOUR);
	    int second=c.get(Calendar.SECOND);
	    String timevalue = year+"-"+month+"-"+date+"   "+hour+":"+minute+":"+second;
	    return timevalue;
	}
}
