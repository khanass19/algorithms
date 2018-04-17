package labs;

public class Lab1Task3 {
	
	 static Long solve(Long num1, Long num2) {
	        Long a, b, r;
	        
	        if (Math.abs(num1) > Math.abs(num2)) {
	            a = Math.abs(num1);
	            b = Math.abs(num2);
	        } else {
	            b = Math.abs(num1);
	            a = Math.abs(num2);
	        }
	        
	        if (b == 0) return null;        
	        
	        do {
	            r = a % b;
	            a = b;
	            b = r;
	        } while (r != 0);
	        
	        return a;      
	 }
}
