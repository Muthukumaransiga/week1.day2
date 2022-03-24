package week1.day2;

public class Calculator {
	
	public int add(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	public int sub(int num1, int num2) {
		return num1-num2;
		
	}
	public double mul(double num1, double num2) {
		return num1*num2;
		
	}
	public float div(float num1, float num2) {
		return num1 / num2;
		
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(2, 5, 8));
		System.out.println(cal.sub(5, 5));
		System.out.println(cal.mul(2, 5));
		System.out.println(cal.div(100, 5));
		
	}

}
