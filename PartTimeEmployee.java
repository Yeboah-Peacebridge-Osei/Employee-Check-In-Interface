public class PartTimeEmployee extends HourlyEmployee{
	public static double partTimeWage= 10;
	
	public PartTimeEmployee(String nameEmp, int idnum) {
		super(nameEmp, "PartTime", idnum, partTimeWage);
	}
	
}