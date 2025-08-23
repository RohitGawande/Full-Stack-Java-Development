package in.rohit.main;



public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Date udate=new java.util.Date();
		System.out.println("udate is ::"+udate);
		
		long value = udate.getTime();
		System.out.println("Date in milliseconds is : "+value);
		java.sql.Date sqlDate = new java.sql.Date(value);
		System.out.println("sqlDate is : "+sqlDate);
	}

}
