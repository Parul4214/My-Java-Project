package learnComposition;

public class Employee {

	private String employeeName;

	private String employeeID;

	private String employeeDesignation;

	public Employee(String employeeName, String employeeID, String employeeDesignation) {
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.employeeDesignation = employeeDesignation;
		// System.out.println("Employees added: " + employeeName);
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

}
