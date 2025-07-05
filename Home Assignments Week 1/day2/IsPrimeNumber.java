package Homeassignment_Week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int number = 4;
		boolean isPrime = true;

		if (number <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= number - 1; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println("Prime number.");
		} else {
			System.out.println("Not a Prime number.");
		}
	}
	}
