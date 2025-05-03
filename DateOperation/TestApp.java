package DateOperation;

import java.util.*;

public class TestApp {
	public static void main(String[] args) {
        //java.util.Date=we use to store both Date and Time information
		Date udate=new Date();
		System.out.println("utilDate is::"+udate);
        long value =udate.getTime();
        System.out.println("Information about Date in milliseconds::"+value);
        //java.Sql.Date=we use to store both Date information
        java.sql.Date sqlDate=new java.sql.Date(value);
        System.out.println("sqlDate is ::"+sqlDate);
	}
}
