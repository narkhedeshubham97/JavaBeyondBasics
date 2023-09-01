package optionalclass;

import java.util.Arrays;

import java.util.List;
import java.util.Optional;

public class BestSol {

	public static void main(String[] args) {

		EmployeeOfBestSol emp1 = new EmployeeOfBestSol("Ram", 101, "Java project", "JavaPro");
		EmployeeOfBestSol emp2 = new EmployeeOfBestSol("Shyam", 102, "Angular project", "AngPro");
		EmployeeOfBestSol emp3 = new EmployeeOfBestSol("Ravi", 103, "React project", "ReaPro");
		EmployeeOfBestSol emp4 = new EmployeeOfBestSol("Mahesh", 104, "JavaScript project", "JaScPro");

		List<EmployeeOfBestSol> eList = Arrays.asList(emp1, emp2, emp3, emp4);

		for (EmployeeOfBestSol employeeOfBestSol : eList) {
			if (employeeOfBestSol.getProjectCode().isPresent()) {
				employeeOfBestSol.setProjectCode(employeeOfBestSol.getProjectCode().get().concat("BestSol"));
			} else {
				
				employeeOfBestSol.setProjectCode("BestSol");
			}

		}
		eList.stream().forEach(p -> System.out.println(p));

	}

}