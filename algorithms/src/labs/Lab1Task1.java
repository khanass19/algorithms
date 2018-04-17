package labs;

public class Lab1Task1 {
	
	public Long solve(Long num1, Long num2){
			if (num2 == 0) {
				return num1;
				} else {
				return solve(num2, num1 % num2);
				}
		
	}	
}
