package pkg;


public class FV_Calculator {

	
	


	static double futureValue(String ir, String pv, String pd){
	int period = Integer.parseInt(pd);
	double interest_rate = Double.parseDouble(ir);
	double present_value = Double.parseDouble(pv);
	double annualized_interest_rate = Math.pow(1+interest_rate,period);
	double future_value = present_value*(annualized_interest_rate); 
	return future_value;
	}
	
	public static double futureValue(double ir, double pv, int pd){
	double annualized_interest_rate = Math.pow(1+ir,pd);
	double future_value = pv*(annualized_interest_rate); 
	return future_value;
}
	
}
