package Homeassignment_Week1.day2;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int a=0,b=1,c;
		System.out.print("The Fibonnaci series :");
		for(int i=1;i<=10;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		

	}

}
