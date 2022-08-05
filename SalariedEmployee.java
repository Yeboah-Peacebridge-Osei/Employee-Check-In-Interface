public class SalariedEmployee implements Employee{
  public String name;
  public String title;
  public int IDNum;
  private double salary;
  public SalariedEmployee(String nameEmp, String titleEmp, int idEmp, double salaryEmp) {
	  name= nameEmp;
	  title=titleEmp;
	  IDNum=idEmp;
	  salary=salaryEmp;
	  
  }
  public String toString() {
	  return ( "Employee "+title+" "+ name+ " wit ID number "+IDNum+ " has a salary of "+salary);
	  
  }
  public double pay(double taxRate) {
	  return salary*(1-taxRate);
  }
}