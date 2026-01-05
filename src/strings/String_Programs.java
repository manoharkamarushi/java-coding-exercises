package strings;



public class String_Programs {

//program to reverse a string
	public void reverseString() {

		String s = "Java", output = null;
		for (int i = s.length() - 1; i >= 0; i--) {
			output = output + s.charAt(i);
		}
		System.out.println(output);
	}

//Java program to reverse each word of a given string
	public void reverseEachWord() {

		String s = "Hello world learning java is fun";
		String[] words = s.split(" ");
		int count = words.length;
		String reverseString = "";

		for (int i = 0; i < count; i++) {
			// each word reverse
			String eachword = words[i];
			String revWord = "";

			for (int j = eachword.length() - 1; j >= 0; j--) {
				revWord = revWord + eachword.charAt(j);
			}

			// add revWords
			reverseString = reverseString + revWord;

		}
		System.out.println(reverseString);

	}

//program to find duplicate characters in a String
//java program to print unique characters/remove duplicates

	public void duplicatechars() {
		String str = "Hello Java";
		char[] chars = str.toCharArray();

		// using loops compare and if same found increase count, print count & letter
		for (int i = 0; i < chars.length; i++) {
			int count = 1;
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					count++;
				}
			}

			if (count > 1)// print duplicates
				System.out.println(chars[i] + " appeared " + count + " times");
			if (count == 1)// print unique chars
				System.out.println(chars[i]);

		}

	}

//program to print each letter twice from a given string
	public void doubledLetters() {
		String str = "hello";
		StringBuilder doubled = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			doubled.append(ch).append(ch);

		}
		System.out.println("Doubled string" + doubled);
	}

// program to swap two string without 3rd variable
	public void swapStrings() {
		String str1 = "Hello";
		String str2 = "world";

//	Integers
//	a=a+b;
//	b=a-b;
//	a=a-b;

// doing same as in integers
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

	}

// program to print a2b2c3d2 for the input aabbcccdd
	public void findCharSequence() {

		String str = "aabbcccdd";
		int count = 1;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;// same character repeating
			} else {
				// append letter a and count of a 2 'a2'
				sb.append(str.charAt(i)).append(count);
				count = 1; // reset for new char
			}
		}

	}

//	SeparateChars
//	Input: String Str = “aBACbcEDed”	Output: “abcde”, “ABCDE”  
//	isLowercase()
	public static void separateChars() {

		String str = "aBACbcEDed";
		StringBuilder lowerCase = new StringBuilder();
		StringBuilder upperCase = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (Character.isLowerCase(ch)) {
				lowerCase.append(ch);
			} else {
				upperCase.append(ch);
			}
		}
		System.out.println("Output in lowercase: " + lowerCase);
		System.out.println("Output in uppercase " + upperCase);
	}

//	Input- String Str = “Subbu123raj” Output- “Subburaj”, “123”
//	isLetter(ch)
//	isDigit(ch)
	
	public static void separateAlphaNumeric() {
		String Str = "Subbu123raj";

		StringBuilder alphaPart = new StringBuilder();
		StringBuilder numericPart = new StringBuilder();
		
		for (char ch : Str.toCharArray()) {
			if (Character.isLetter(ch)) {
				alphaPart.append(ch);
			} else if (Character.isDigit(ch)) {
				numericPart.append(ch);
			}
		}

	}

//program to find all permutations of the string
// indirect ask of recursion
	public static void main(String[] args) {
		String str = "ABC";
		System.out.println("All permutations of " + str + " are:");
		findPermutations(str, "");
	}

	public static void findPermutations(String str, String ans) {

		if (str.isBlank()) {
			System.out.println("Empty or white space string");
		} else {
			for (int i = 0; i < str.length(); i++) {
				String remaining = str.substring(0, i) + str.substring(i + 1);
				findPermutations(remaining, ans + str.charAt(i));
			}
		}
	}

}
