package in.Rohit.main;

import in.Rohit.bean.Account;
import in.Rohit.bean.Employee;

public class TestApp {

	public static void main(String[] args) {

		Account account = new Account("ABC123", "Rohit", "Savings");

		// Constructor Injection
		Employee employee = new Employee("IND10", "Rohit", "Nagpur", account);
		employee.getEmployeeDetails();

	}

}
