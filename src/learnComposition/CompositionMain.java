//Create a program to check whether an employee is present in a bank using composition. 
//Create an Employee class with Employee name, id and employee designation.
//Create a Bank Class and implement the logic “Bank has Employees”. 
//Create 10 Employees. For an employee the user is entering, the designation and employee id for the employee should be printed if the employee is present

package learnComposition;

import java.util.Scanner;

public class CompositionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bankObj = new Bank();
		Scanner sc = new Scanner(System.in);

		Employee employee1 = new Employee("Aman", "0000", "Manager");
		Employee employee2 = new Employee("Daman", "1111", "Bank Teller");
		Employee employee3 = new Employee("Harinder", "2222", "Banker");
		Employee employee4 = new Employee("Jasmeet", "3333", "Loan processor");
		Employee employee5 = new Employee("Jattan", "4444", "Mortgage consultant");
		Employee employee6 = new Employee("Kuldeep", "5555", "Investment representative.");
		Employee employee7 = new Employee("Lekshmi", "6666", "Credit analyst");
		Employee employee8 = new Employee("Navjot", "7777", "Investment banker");
		Employee employee9 = new Employee("Neethu", "8888", "Relationship manage");
		Employee employee10 = new Employee("Parul", "9999", "Finance manager");

		bankObj.addEmployees(employee1);
		bankObj.addEmployees(employee2);
		bankObj.addEmployees(employee3);
		bankObj.addEmployees(employee4);
		bankObj.addEmployees(employee5);
		bankObj.addEmployees(employee6);
		bankObj.addEmployees(employee7);
		bankObj.addEmployees(employee8);
		bankObj.addEmployees(employee9);
		bankObj.addEmployees(employee10);

		System.out.println("Which employee you're looking for");
		String enteredEmployeeName = sc.nextLine();
		bankObj.checkEmployee(enteredEmployeeName);

	}

}
