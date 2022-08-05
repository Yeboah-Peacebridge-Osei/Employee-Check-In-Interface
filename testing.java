public class testing {

    public static void main(String args[]) {
	// We have a few managing employees to start the company
	// Since our pay periods are four weeks each, but we think of salaries
	// as annually, we need to calculate the pay per pay period
	SalariedEmployee jane = new SalariedEmployee("Jane", "President", 1, 100000/(52/4)) ;  // Approximately $7692.31 per pay period before taxes
	SalariedEmployee bob =  new SalariedEmployee("Bob", "Vice President", 2, 90000/(52/4)) ; // Approximately $6923.08 per pay period before taxes
	SalariedEmployee mark =  new SalariedEmployee("Mark", "CFO", 3, 90000/(52/4)) ;  // Approximately $6923.08 per pay period before taxes
	SalariedEmployee mary =  new SalariedEmployee("Mary", "CEO", 4, 90000/(52/4)) ; // Approximately $6923.08 per pay period before taxes

	// Now we have the people who are actually doing the work
	HourlyEmployee clara = new HourlyEmployee("Clara", "Shift Supervisor", 10, 28.00);  // $5600 per 20 hour pay week
	HourlyEmployee robert = new HourlyEmployee("Robert", "Shift Supervisor", 11, 28.00); // $5600 per 20 hour pay week
	
	HourlyEmployee bill = new PartTimeEmployee("Bill", 21); 
	HourlyEmployee ted = new PartTimeEmployee("Ted", 21);

	

	// Print the office to see what it looks like

	System.out.println("Our office office contiains the following people.") ;
	System.out.println(jane) ; 
	System.out.println(bob) ; 
	System.out.println(mark) ; 
	System.out.println(mary) ; 
	System.out.println(clara) ; 
	System.out.println(robert) ; 
	System.out.println(bill) ; 
	System.out.println(ted) ;

	//Time for a four week pay periods, but bill & ted only work 3 hours a day
	
	for (int week = 0 ; week <4 ; week++)
	    for(int day = 0 ; day < 5 ; day++) {
		clara.addHours(8) ;
		robert.addHours(8) ;
		bill.addHours(4) ;
		ted.addHours(4) ;
	    }

	// We all have to pay our taxes, fortunately things are easier in this world with a flat tax rate
	double taxRate = .25 ; 

	System.out.println("Paychecks for the month will be:\n") ; 
	System.out.println(jane + " $" + Double.toString(jane.pay(taxRate))) ; 
	System.out.println(bob + " $" + String.valueOf(bob.pay(taxRate)));
	System.out.println(mark + " $" + String.valueOf(mark.pay(taxRate)));
	System.out.println(mary + " $" + String.valueOf(mary.pay(taxRate)));
	System.out.println(clara + " $" + String.valueOf(clara.pay(taxRate)));
	System.out.println(robert + " $" + String.valueOf(robert.pay(taxRate)));
	System.out.println(bill + " $" + String.valueOf(bill.pay(taxRate)));
	System.out.println(ted + " $" + String.valueOf(ted.pay(taxRate)));
    }
}
