package kr.co.java.DTO;

public class EmpDTO {
	private int empId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNum;
	private String hireDate;
	private String jobId;
	private int salary;
	private int commisionPct;
	private int managerId;
	private int deptId;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getCommisionPct() {
		return commisionPct;
	}
	public void setCommisionPct(int commisionPct) {
		this.commisionPct = commisionPct;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "EmpDTO [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNum=" + phoneNum + ", hireDate=" + hireDate + ", jobId=" + jobId + ", salary=" + salary
				+ ", commisionPct=" + commisionPct + ", managerId=" + managerId + ", deptId=" + deptId + "]";
	}
	
}
