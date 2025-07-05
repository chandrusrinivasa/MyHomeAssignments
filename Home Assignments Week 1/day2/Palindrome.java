package Homeassignment_Week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int n =121; // input value 
		int a=n, i=0,j=0;
		for(int temp=a;temp>0;temp/=10) {
			int k=temp%10;
			j=j*10+k;
		}
		if (n==j) {
			System.out.println("121 is Palindrome Number ");
		}
		else {
			System.out.println("121 is Not Palindrome Number");
		}
		
		int k=12345;
		int b=k,c=0,s=0;
		while(b>0) {
			c=b%10;
			s=(s*10)+c;
			b=b/10;
		}
		if (b==s) {
			System.out.println("12345 is Palindrome Number");
		}
		else {
			System.out.println("12345 is Not Palindrome Number");
		}

	}

}
