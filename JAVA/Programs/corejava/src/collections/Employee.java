package collections;

public class Employee {
	
	int empid;
	String empname;
	double empsal;
	String dept;
	public Employee() {
		
	}
	public Employee(int empid, String empname, double empsal, String dept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.dept = dept;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", dept=" + dept + "]";
	}
	

}
