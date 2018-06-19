package emp;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp[] = new Employee[2];
		emp[0] = new Secretary("Duke", 1, "scretary", 800);
		emp[1] = new Sales("Tuxi", 2, "sales", 1200);

		printEmployee(emp, false);

		System.out.println();
		System.out.println("인센티브 100 지급");

		/*
		 * ((Secretary) emp[0]).incentive(100); ((Sales) emp[1]).incentive(100);
		 */
		for (Employee em : emp) {
			if (em instanceof Secretary)
				((Secretary) em).incentive(100);
			else
				((Sales) em).incentive(100);
		}
		printEmployee(emp, true);
	}

	public static void printEmployee(Employee[] emp, boolean isTax) {
		if (isTax == false) {
			System.out.println("name\t\tdepartment\t\tsalary\t\t");
			System.out.println("---------------------------------------------");
			for (Employee em : emp) {

				System.out.printf("%s\t\t%s\t\t%d\n", em.getName(), em.getDepartment(), em.getSalary());

			}
		} else {
			System.out.println("name\t\tdepartment\t\tsalary\t\ttax");
			System.out.println("-----------------------------------------------------------");
			for (Employee em : emp) {

				System.out.printf("%s\t\t%s\t\t%d\t\t%.1f\n", em.getName(), em.getDepartment(), em.getSalary(),
						em.tax());
			}
		}
	}

}
