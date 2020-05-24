// Raja Hammad Mehmood
// This program makes a linked list of different employees and runs some methods on it.
/**
 * An object of type Employee holds data about one employee.
 */
public class Employee {

	String name; // Name of the employee.

	Employee supervisor; // The employee's supervisor.
	
	

	public Employee(String name, Employee supervisor) {
		this.name = name;
		this.supervisor = supervisor;
	}
	
	/**
	 *  Prints the supervisor.
	 *  @param is the employee.
	 */
	public static void printSupervisor(Employee emp) {
		if (emp.supervisor == null) {
			System.out.println(emp.name + " is the boss and has no supervisor!");
		} else {
			System.out.print("The supervisor of " + emp.name + " is ");
			System.out.println(emp.supervisor.name);
		}
	}
	
	/**
	 *  Prints the number of levels between an Employee and the boss.
	 *  @param is the employee.
	 */
	public static void printLevels(Employee emp) {
		if (emp.supervisor == null) {
			System.out.println(emp.name + " is the boss!");
		} else {
			Employee runner; // For "running" up the chain of command.
			runner = emp.supervisor;
			if (runner.supervisor == null) {
				System.out.println(emp.name + " reports directly to the boss.");
			} else {
				int count = 0;
				while (runner.supervisor != null) {
					count++; // Count the supervisor on this level.
					runner = runner.supervisor; // Move up to the next level.
				}
				System.out.println("There are " + count + " supervisors between " + emp.name + " and the boss.");
			}
		}
	}
	
	public static void main(String[] args) {
		Employee raja = new Employee("Raja", null);
		Employee leslie = new Employee("Leslie", raja);
		Employee ali = new Employee("Ali", leslie);
		printSupervisor(ali);
		printLevels(ali);
	}

} // end class Employee