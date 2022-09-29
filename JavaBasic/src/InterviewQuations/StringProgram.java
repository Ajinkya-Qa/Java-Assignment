package InterviewQuations;

import java.lang.reflect.Array;
import java.util.*;

public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		findDuplicateCharsWithCount("Better Butter");
//		countWordInTheString();
//		occuranceOfEachChar();
//		findPercentageOfChar();
//		findDuplicateCharOfString();
//		findCountOfDigitInAString();
//		reveseStringWithPreservingPosition();
//		checkAnagram();
//		stringIsImmutable();
//		reveseStringWithPreservingPosition();
		subString();

	}

	static char ch;

	static void removeSpecialChar() {
		String str="Aji@nkya@ S@a@want";
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
	}
	static void subString() {
		String str="AJinkya Sawant";
		String str1="Sawant AJinkya";
		System.out.println(str.substring(1,2));
	}
	static void stringIsImmutable() {
		String str="Ajinkya";
		str.concat("Sawant");
		System.out.println(str);
	}
	static void checkAnagram() {
		String strOne="abcd";
		String strTwo="adcb";
		char [] strOneArray=strOne.toCharArray();
		char [] strTwoArray=strTwo.toCharArray();
		Arrays.sort(strOneArray);
		Arrays.sort(strTwoArray);
		if(Arrays.toString(strOneArray).equals(Arrays.toString(strTwoArray)))
			System.out.println("String is Anagram");
		else
			System.out.println("String is not an Anagram");
	}
//	Percentage of uppercase, lowercase, digits and special characters in a string
	static void findPercentageOfChar() {
		String str = "Hello HOW are you MR 51";
		int lowerCase = 0;
		int upperCase = 0;
		int digit = 0;
		int specialChar = 0;
		char[] charArray = str.toCharArray();
		int totalChar = charArray.length;
		for (char c : charArray) {
			if (c == ' ')
				continue;
			if (Character.isDigit(c))
				digit++;
			else if (Character.isUpperCase(c))
				upperCase++;
			else if (Character.isLowerCase(c))
				lowerCase++;
			else
				specialChar++;
		}
		System.out.println((lowerCase * 100) / totalChar + "%");
		System.out.println((upperCase * 100) / totalChar + "%");
		System.out.println((specialChar * 100) / totalChar + "%");
		System.out.println((digit * 100) / totalChar + "%");

	}

	static void findCountOfDigitInAString() {
		String str = "hey1234876hey";
		char[] charArray = str.toCharArray();
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == ' ')
				continue;
			if (Character.isDigit(charArray[i]))
				count++;
		}
		System.out.println(count);
	}

	static void occuranceOfEachChar() {
		String str = "Java J2EE Java JSP J2EE";
		Map<Character, Integer> charMap = new HashMap();
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if (c == ' ')
				continue;
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> charCountSet = charMap.entrySet();
		for (Map.Entry<Character, Integer> entry : charCountSet) {
			if (((int) entry.getValue() > 1)) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}

	static void findDuplicateCharOfString() {
		String str = "Ajinkya Sawant";
		Map<Character, Integer> charMap = new HashMap();
		char charArray[] = str.toCharArray();
		for (char c : charArray) {
			if (c == ' ')
				continue;
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> countSet = charMap.entrySet();
		for (Map.Entry<Character, Integer> entry : countSet) {
			if (entry.getValue() > 1)
				System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

//	Reverse the string with preserving the position of spaces
	static void reveseStringWithPreservingPosition() {
		String str = "I am not a string";
		char[] inputArray = str.toCharArray();
		char[] result = new char[inputArray.length];
		for (int i = 0; i < result.length; i++) {
			if (inputArray[i] == ' ') {
				result[i] = ' ';
			}
		}
		int j = result.length-1;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != ' ') {
				if (result[j] == ' ') {
					j--;
				}
				result[j] = inputArray[i];
				j--;
			}
		}
		System.out.println(String.valueOf(result));
	}

	static void palinDrom() {
		String str = "Ajinkya Sawant";
		char[] arr = str.toCharArray();
		String reverseString = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			reverseString += arr[i];
		}
		if (str.equals(reverseString))
			System.out.println("String is Palindrom");
		else
			System.out.println("String is not Palindrom");
	}

	static void countWordInTheString() {
		String str = "Ajinkya Sawant is cleaver";
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println(count);
	}

	static void reverseEachWord() {
		String str = "Ajinkya Sawant";
		String reverseString = "";
		String[] word = str.split(" ");
		for (String string : word) {
			String reverseWord = "";
			for (int i = string.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + string.charAt(i);
			}
			reverseString += reverseWord + " ";
		}
		System.out.println(reverseString);
	}

	static void reverseString() {
		String str = "Ajinkya Sawant";
		char[] arr = str.toCharArray();
//		System.out.println(arr.length);
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

	static String reverseString(String str) {
//		String str="Ajinkya";
		if (str.isEmpty()) {
			return str;
		} else {
			return reverseString(str.substring(1)) + str.charAt(0);
		}
	}

	static String removeWhiteSpace() {
		String str = "A j i k y a Sawa n t";
		char[] arr = str.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ' && arr[i] != '\t') {
				stringBuffer.append(arr[i]);
			}
		}
		return stringBuffer.toString();
	}

	private static void findDuplicateCharsWithCount(String str) {
		System.out.println("Duplicates in- " + str);
		int count;
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			// Take one char at a time
			char c = str.charAt(i);
			// don't count the spaces
			if (c == ' ')
				continue;
			for (int j = i + 1; j < str.length(); j++) {
				if (c == str.charAt(j)) {
					count++;
					// remove the char so that it is not picked again
					// in another iteration
					str = str.substring(0, j) + str.substring(j + 1);
				}
			}
			if (count > 1) {
				System.out.println(c + " found " + count + " times");
			}
		}
	}
}
