package labs;

public class Lab1Task2 {
	public Long evklid(Long num1 , Long num2) {
		Long t;
		while (num2 != 0) {
			t = num2;
			num2 = num1 % num2;
			num1 = t;
		}
		return num1;
	}
}
