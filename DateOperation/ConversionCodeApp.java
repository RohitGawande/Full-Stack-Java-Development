import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ConversionCodeApp {

	public static void main(String[] args) {
		//Read the input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Dtae ::(dd-MM-yyyy");
		String sdate=sc.next();
		
		//Convert the date from  String to java.util.Date
		SimpleDateFormat sdf=new SimpleDateFormat();
		java.util.Date udate=sdf.parse(sdate);
		
		//Covert java.util.date o java.sql.Date
		long value=udate.getTime();
		java.sql.Date sqldate=new java.sql.Date(value);
		
		//Printing all the 3 formats of Date
		System.out.println("String date is::"+sdate);
		System.out.println("Util date is::"+udate);
		System.out.println("sqlDate date is::"+sqldate);
	}

}
 
