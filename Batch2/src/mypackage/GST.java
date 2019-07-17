package mypackage;

public class GST extends IncomeTax{
	
	public int CalculateIncomeTax(int income, int luxurySpending) {
		
		return income/10 + luxurySpending/10;
	}

}
