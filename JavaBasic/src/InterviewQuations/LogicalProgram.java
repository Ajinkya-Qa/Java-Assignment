package InterviewQuations;

import java.util.Arrays;

//1. WAP for reverse number
//2. WAP for palindrome
//3. Write a program to generate 5 Random nos. between 1 to 100, and it should not follow with decimal point.
//4. Write a program to Find Factorial of Given number
//5. Write a program to find sum of all integers greater than 100 and less than 200 that are divisible by 7
//6. WAP swap two number without using temp variables
//7. Write a program to convert given no. of days into months and days. (Assume that each month is of 30 days)
//Example :Input - 69 Output - 69 days = 2 Month and 9 days
//8. Write a program to generate a Triangles(1 &2) or Invert Triangles(3 & 4)
//9. Write a program to find whether given no. is Armstrong or not?
//Example : Input - 153 Output - 1^3 + 5^3 + 3^3 = 153, so it is Armstrong no.
//10. WAP for perfect number?
//11. Write a program to find top two maximum numbers in the given array. You should not use any sorting functions. You
//should iterate the array only once. You should not use any kind of collections in java.
//14. how to find out sum of each digit in the given number using recursion logic. For example, if the number is 259, then the sum
//should be 2+5+9 = 16.
public class LogicalProgram {

	public static void main(StringProgram[] args) {
		fibonacciSerice();

	}
	
	static void fibonacciSerice() {
		int n1=0,n2=1,sum=0;
		for (int i = 0; i < 10; i++) {
			sum=n1+n2;//1
			System.out.println(sum);
			n1=n2;//1
			n2=sum;//1
		}
	}
	static void findRandmNuber() {
		for (int i = 1; i <= 5; i++) {

			System.out.println((int)(Math.random()*100));

		}
	}

	static void reverseNumber(int number) {
		int reminder, reverse = 0;
		for (; number != 0;) {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number /= 10;
		}
		System.out.println(reverse);
	}

	static void reverseNumberUsingWhileLoop(int number) {
		int reminder, reverse = 0;
		while (number != 0) {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number /= 10;
		}
		System.out.println(reverse);
	}

	static void reverseNumberRecursiveMethod(int number) {
//		int reminder,reverse=0;
		if (number < 10) {
			System.out.println(number);
			return;
		} else {
			System.out.print(number % 10);
			reverseNumberRecursiveMethod(number / 10);
		}

	}

	static void checkPalidrom(int number) {
		int reverse = 0, reminder = 0;
		int temp = number;
		for (; number != 0; number /= 10) {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
		}
		if (temp == reverse)
			System.out.println("Given number is palidrom");
		else
			System.out.println("Given number is not palidrom");
	}

	static int factorial(int number) {
		if (number == 0)
			return 1;
		return number * (factorial(number - 1));
	}

	static void sumofIntegers() {
		int sum = 0;
		for (int i = 100; i < 200; i++) {
			if (i % 7 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	static void convertIntoMonths(int days) {
		int months = 0, day = 0;
		months = days / 30; // give quations
		day = days % 30; // give reminder

		System.out.println("Months :" + months + "\nDays :" + day);
	}

	static void ganarateTranagle() {
		int row = 5;
		for (int i = 0; i < row; i++) {

			for (int k = row; k > i; k--) {
				System.out.print("*");
			}
//
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//			}
			System.out.println();
		}
	}

	static void count(int number) {
		int digit = 0, count = 0;
		while (number != 0) {
//			digit=number%10;
			number /= 10;
			count++;
		}
		System.out.println(count);
	}

	static void armstrongNumber(int number) {
		int temp = number;
		int digit = 0, res = 0, count = 0;
		for (; temp != 0;) {
			temp /= 10;
			count++;
		}
		System.out.println(count);
		temp = number;
		while (temp != 0) {
			int i = 1, mul = 0;
			digit = temp % 10;
//			mul=
//			System.out.println(mul);
			res += (Math.pow(digit, count));
			temp /= 10;
		}
		boolean a = temp != number ? true : false;
		if (a)
			System.out.println("It is armstrong");
		else
			System.out.println("It is not armstrong");
	}

	static void perfectNumber(int number) {
		int res = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				res += i;
			}
		}
		if (number != res)
			System.out.println("This a not perfect number");
		else
			System.out.println("This a perfect number");

	}

	static void maxTwoNumber() {
		int arr[] = { 10, 5, 8, 9, 6, 3 };
		int maxOne = 0, maxTwo = 0;
		for (int n1 : arr) {
			if (n1 > maxOne) {
				maxTwo = maxOne;
				maxOne = n1;
			} else if (maxTwo < n1) {
				maxTwo = n1;
			}
		}
		System.out.println(maxOne + " " + maxTwo);
	}

	static void ThirdLargestNumberInAnArray() {
		int temp = 0;
		int arr[] = { 10, 20, 5, 4, 63, 2, 8 };
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
	}

	static void swaptwoNumber() {
		int numberOne = 10, numberTwo = 20;
		numberOne = numberOne + numberTwo;// 10+20
		numberTwo = numberOne - numberTwo;// 30-10
		numberOne = numberOne - numberTwo;// 30-20
		System.out.println(numberOne + " " + numberTwo);
	}

	static int sum = 0;

	static int sumOfEachDigit(int digit) {
//		ReverseNumber sa=new ReverseNumber();
		if (digit == 0)
			return sum;
		else {
			sum += (digit % 10);
			sumOfEachDigit(digit / 10);
		}
		return sum;
	}

	private static boolean isPrimeNumber(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	static void getDistinctElementOFArary() {
		int arr[] = { 2, 5, 3, 2, 5, 6, 3, 2, 4, 6, 9 };
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	static void findDuplicateElementInArray() {
		int arr[] = { 4, 5, 8, 5, 6, 4, 8, 2 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
				}
			}
		}
	}
}
