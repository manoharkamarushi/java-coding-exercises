package numbers;

import java.util.Scanner;

public class Numbers {
	int a, b, number;

	public void checkOddorEven() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int number = scanner.nextInt();

		if (number % 2 == 0) {
			System.out.println(number + " is even.");
		} else {
			System.out.println(number + " is odd.");
		}
	}

	public void convertInteger2Binary() {
// Integer --> Bin => Divide by 2, store remainders in reverse order.	OR Integer.toBinaryString(num)
// Binary --> Integer =>  Start from right, multiply bits by powers of 2, sum up OR Integer.parseInt(binary, 2)

		String binary = "11001"; // binary for 25
		int num = Integer.parseInt(binary, 2);
		System.out.println("Integer value" + num);

		String binary1 = Integer.toBinaryString(num);
		System.out.println("Binary of " + num + " = " + binary1);

	}

	public void SwapNumbers() {
// swap numbers without using 3rd variable
		System.out.println("Before swapping: a = " + a + ", b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping: a = " + a + ", b = " + b);

	}

	public void countDigits() {
		
		int num=97896, count=0;
		
		while(num!=0) {
			num = num/10; //removes last digit
			count++;
		}
		System.out.println(count);
	}

public void armstrong(int n) {
//Sum of the cubes of its digits equals the number itself.
// 153 = 1^3+5^3+3^3 = 153 … Armstrong
// 123 = 1^3+2^3+3^3 =36 ...Not

		int num = 153;
		int original = num, sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum += digit * digit * digit;
			num /= 10;
		}

		if (sum == original)
			System.out.println(original + " is an Armstrong number");
		else
			System.out.println(original + " is not an Armstrong number");
	}

	public void fibonacci() {
//A sequence where each number is the sum of the previous two.
//Starts as: 0, 1, 1, 2, 3, 5, 8, 13...

		int count = 10, n1 = 0, n2 = 1;
		System.out.print("Fibonacci Series: " + n1 + " " + n2);

		for (int i = 2; i < count; i++) {
			int n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

	public void Pallindrome() {
// A number or string that remains the same forwards and backwards.
// Number: 121 or madam  same backward and forward
		
//Mental Note:-
//For digits: reverse by math (get reminder and add it to rev *10). 
//For text: reverse by reading it from last. or use stringbuiler/buffer for reverse()

		int num = 121;
		int original = num, rev = 0, rem =0;

		while (num > 0) {
			rem = num%10;
			rev = rev * 10 + rem; //why rev *10 - it shifts digits to the left by multiplying with 10.
			num /= 10;
		}

		if (rev == original)
			System.out.println(original + " is a palindrome");
		else
			System.out.println(original + " is not a palindrome");

// if string 
		String str = "hello";
		String rev_ = null;

		for (int i = str.length() - 1; i >= 0; i--) {
			rev_ = rev_ + str.charAt(i);
		}
//		or
		String reverse1 = new StringBuilder(str).reverse().toString();
	}

	public void isprime(int num) {
//Check given number is prime or not [if remainder==0 not a prime]
		int i, m = num / 2; 
		boolean isPrime = true;

		if (num == 0 || num == 1) {
			System.out.println(num + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not prime number");
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				System.out.println(num + " is prime number");
			}
		} // end of else
	}

	public void printPrime() {
// Print Prime numbers from 1 to 100 

		for (int num = 2; num <= 100; num++) {
			boolean isPrime = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println(num + " ");
			}

		}
	}
}