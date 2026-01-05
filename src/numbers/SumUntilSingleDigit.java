package numbers;



import org.testng.annotations.Test;

//Mental Notes:
// Also called as Digital Root
// number%10 gives last digit
// number/10 removes last digit [gives remaining or first digit]
// Two while loops
// 1 - outer loop till becomes single digit
// 2- inner loop do sum of digits 

// Pro people way
// %9 gives "single digit signature of a number except if it a multiple of 9"
// so doing (num-1)%9 gives single digit in range 0-8 , adding +1 shift back to 1-9.

// Logic 
// do temp = num -1 [given no-1]
// do modresult = temp%9
// do digital_root = modresult+1 [again add 1]

// single line
// int digitalroot = (num==0)?0:(num-1)%9+ 1;

public class SumUntilSingleDigit {

	@Test
	public void SumofDigits_NormalVersion() {
		int n = 2298;
		int lastdigit = 0;

		if (n == 0) {
			System.out.println("Digit root is 0");

		}
		while (n >= 10) { // until number becomes single digit
			int sum = 0;
			while (n > 0) {
				lastdigit = n % 10;
				sum += lastdigit; // Add last digit
				n = n / 10; // Remove last digit
			}
			n = sum;
			// iteration 1 - 21
			// iteration 2 -3
		}

		System.out.println("Digital root: " + n);
	}

	@Test
	public void SumofDigits_EfficientVersion() {
		int digitalRoot;
		int n = 2298;

		// Step 1: Handle special case n=0
		if (n == 0) {
			digitalRoot = 0;
		} else if (n % 9 == 0) {
			digitalRoot = 9;
		} else {
			// Step 2: Subtract 1 first
			int temp = n - 1; // 2298 - 1 = 2297

			// Step 3: Take modulo 9
			int modResult = temp % 9; // 2297 % 9 = 2

			// Step 4: Add 1 to get final result
			digitalRoot = 1 + modResult; // 1 + 2 = 3
		}

		System.out.println("Digital root: " + digitalRoot);

	}
}
