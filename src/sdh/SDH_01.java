package sdh;

import java.math.BigDecimal;


public class SDH_01 {

	static double f;
	static double a=100000;
	static double i=6/100;
	static double n;
	
	static double n2;
	static double result; 
	
	
	public static void main(String[] args) {
		
		double i2= i+1 ;
		for (int j = 0; j < n; j++) {
			n2 *=i2;
		}
		result = a*(n2-1)/i;
		//BigDecimal bigResult= new BigDecimal(result);
		
		System.out.printf("50년 후 찾을 수 있는 금액 : "+result+"원");
		
		// TODO Auto-generated method stub

	}

}
