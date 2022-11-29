package learnComposition;

public class Bank {

	Employee[] employee = new Employee[10];

	public void addEmployees(Employee enteredEmployeeName) {

		for (int i = 0; i < this.employee.length; i++) {
			if (this.employee[i] == null) {
				this.employee[i] = enteredEmployeeName;
				break;
			}

		}

	}

	public void checkEmployee(String employeeNameRequested) {
		boolean isEmployeeFound = false;
		for (int i = 0; i < employee.length; i++) {
			if (employee[i].getEmployeeName().equalsIgnoreCase(employeeNameRequested)) {
				System.out.println("Employee found: "+ employee[i].getEmployeeName());
				System.out.println("Employee ID   : " + employee[i].getEmployeeID());
				System.out.println("Designation   : " + employee[i].getEmployeeDesignation());
				isEmployeeFound = true;
			}
		}
		if (!isEmployeeFound)//if any employee found,this condn is not satisfied
			System.out.println("No employee found with this name");
	}

}
