package inheritance;

public class Employee {
	int salary;
	
	public int calculateDearnessAllowance(int noYearsOfService) {
		return noYearsOfService * 5000;
	}
	
	public int calculateDearnessAllowance(int noYearsOfService, int valueAdd) {
	  return noYearsOfService*5000 + valueAdd/100;
	}


}
