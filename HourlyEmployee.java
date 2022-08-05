public class HourlyEmployee implements Employee{
	public String name;
	public String title;
	public int IDNum;
	private double wage;
	private double hours;
	private String shift;
	
	
	
	 
	public HourlyEmployee(String nameEmp, String titleEmp, int idEmp, double wageEmp ) {
		name=nameEmp;
		title=titleEmp;
		IDNum=idEmp;
		wage= wageEmp;
		shift="day";	
		hours=0;
	}
	public HourlyEmployee(String nameEmp, String titleEmp, int idEmp, double wageEmp, String shiftEmp) {
		name=nameEmp;
		title=titleEmp;
		IDNum=idEmp;
		wage= wageEmp;
		shift=shiftEmp;	
		hours=0;
	}
	public String toString() {
		return (title+" "+ name+" "+ IDNum+" "+wage+" "+hours+" "+shift);
	}
	public double pay(double taxRate) {
		return ((hours*wage)*(1-taxRate));
	}
	public void addHours(double hoursnum) {
		 hours= hours+hoursnum;
	}
	public void setShift(String shiftVal) {
		shift=shiftVal;
	}
}