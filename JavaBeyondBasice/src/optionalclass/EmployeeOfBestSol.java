package optionalclass;

import java.util.Optional;

class EmployeeOfBestSol {
	private String empName;
	private int empId;
	private String projectName;
	private String projectCode;

	public EmployeeOfBestSol(String empName, int empId, String projectName, String projectCode) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.projectName = projectName;
		this.projectCode = projectCode;
	}

	public EmployeeOfBestSol(String empName, int empId, String projectName) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.projectName = projectName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Optional<String> getProjectCode() {
		return Optional.ofNullable(projectCode);
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	@Override
	public String toString() {
		return "EmployeeOfBestSol [empName=" + empName + ", empId=" + empId + ", projectName=" + projectName
				+ ", projectCode=" + projectCode + "]";
	}

}
