package Assignment;

public class ForLoopStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		displayTextFiveTimes('a');
//		displayTheNumbers();
//		sumOfNuturalNumbers(3);
//		displayLowerCaseAlphabate();
//		printReverseNumber(123);
//		checkPalidromNumber(656565656);
//		656565656=656565656
//		primeNumber(6);
		positiveFactor(10);
//		findDigitOfCounts(15);

	}
	
	static void displayTextFiveTimes(char ch) {
		for(int i=0;i<5;i++) {
			System.out.println(ch);
		}
	}
	
	static void displayTheNumbers() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
	
	static void sumOfNuturalNumbers(int n) {
		int i,sum=0;
		for( i=1;i<=n;i++) {
		    sum=sum+i;

		}
	    System.out.println("Sum of first "+n+" Natural Numbers is = " + sum);
	}
	
	static void displayUpperCaseAlphabate() {
		char c;
		for(c='A';c <='Z';c++) {
			System.out.println(c);
		}
	}
	
	static void displayLowerCaseAlphabate() {
		char c;
		for(c='a';c <='z';c++) {
			System.out.println(c);
		}
	}
	
	static void findDigitOfCounts(int num) {
		int i=0,count=0;
		for(;0!=num;num/=10,++count) {
//			num=num/10;
//			count++;
		}
		System.out.println(count);	
	}
	
	//123
	static void printReverseNumber(int num) {
	
		int digit=0,reverse=0;
		for(int i=0;num!=0;i++) {
			digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println(reverse);
	}
	
  static void checkPalidromNumber(int num) {
		int i, count=0,revsers=0;
		int temp=num;
		for(i=0;num!=0;i++) {
			//ld=3
			//ld=2
			//ld=1
			int reminder=num%10;//123
			//0=0*10+3;//3
			//3=3*10+2;//32
			//32=32*10+1//321
			revsers=revsers*10+reminder;//4=4*10+3=44
			//12
			//1
			num=num/10;
		}	
		if(temp==revsers)
			System.out.println("Given number is palidrom");
		else
			System.out.println("Given number is not palidrom");
	}
    static void primeNumber(int num) {
    	boolean flag=false;
    	for(int i=2;i<=num/2;i++) {
    		if(num%i==0) {
    			flag=true;
    			break;
    		}
    		
    	}
    	if(!flag)
    		System.out.println("Given numer is Prime");
    	else
    		System.out.println("Given numer is not Prime");
    }
	
    static void positiveFactor(int num) {
    	for(int i =1;i<=num;i++) {
    		if(num%i==0) {
    			System.out.println(i);
    		}
    	}
    }
    static void negativeFactor(int num) {
    	for(int i =num;i<=Math.abs(num);i++) {
    		if(i==0) {
    			continue;
    		}
    		else {

        		if(num%i==0) {
        			System.out.println(i);
        		}
    		}
    	}
    }
	

}
