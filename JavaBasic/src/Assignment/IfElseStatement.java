package Assignment;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		evenOddNumber(4);
//		checkVowel('O');
		checkPositiveOrNegativeNumber(1254);
		System.out.println("Largest numer is "+findLargestNumer(10, 12, 11));
	}
	static boolean evenOddNumber(int a) {
		if(a%2==0){
			System.out.println("Given Number "+a+" is Even");
			return true;
		}
		else {
			System.out.println("Given Number "+a+" is odd");
			return false;
		}
	}
	
	static void checkVowel(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println("The Given Charcter "+ ch +" is Vowel");
		else
			System.out.println("The Given Charcter "+ ch +" is Not Vowel");
	}
	
	static int findLargestNumer(int a, int b, int c) {
		if(a>b && a> c)
			return a;
		else if(b>a && b> c)
			return b;
		else
			return c;
	}
	
	static boolean checkLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			 System.out.println("LEAP YEAR");
			return true;
		} else {
			System.out.println("COMMON YEAR or NON LEAP YEAR");
			return false;
		}
	}
	
	static void checkPositiveOrNegativeNumber(int a) {
		if(a>0)
			System.out.println("The given numer is positive");
		else
			System.out.println("The given numer is negativve");
	}

}
