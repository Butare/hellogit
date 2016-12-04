package jim.test.git;

public class HelloGit {

	public static void main(String[] args) {
		// greeting okay
		System.out.println("Value :"+sqrt(4.0));
		
	}
	
	// newton's square root calculation
	public static double sqrt(double n){
		
		double c = n;    	// current estimate
		double er = 1e-16; 	// desired precision
		
		while ( Math.abs(c - n/c) > er * c)
			c = (n / c + c) / 2.0;
		
		return c;
	}

}
