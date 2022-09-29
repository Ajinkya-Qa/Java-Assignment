package Assignment;

public class whileLoopStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		findDigit(123456);
//		printReverseNumber(132);
//		checkPrime(4);
		checkArmstrongNumber(152);

	}
	
	static void findDigit(int num) {
	    int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
	
	static void printReverseNumber(int num) {
	    int reverse=0,digit;
		while(num!=0)
		{
			digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println(reverse);
	}
	
	static void checkPalidrom(int num) {
	    int reverse=0,digit;
	    int temp=num;
		while(num!=0)
		{
			digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		
		boolean flag=reverse==temp?true:false;
		if(flag)
			System.out.println("Given numer is palimdrom");
		else{
			System.out.println("Given numer is not palimdrom");
		}
		
		
	}
	
	static void checkPrime(int num) {
		int i=2;
		boolean flag=false;
		while(i<=num/2) {
			if(num%i==0) {
				flag=true;
				break;
			}
			i++;
		}
		if(!flag)
			System.out.println("Given numer is  prime");
		else{
			System.out.println("Given numer is not prime");
		}
		
	}
	
	static void checkArmstrongNumber(int num) {
		int digit=0,temp=num,count=0,arm=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		int temp2=temp;
		while(temp2!=0) {
			int mul=1;
			digit=temp2%10;
			for(int i=1;i<=count;i++) {
				mul=mul*digit;
			}
			arm=arm+mul;
			temp2=temp2/10;
		}
		boolean flag=num==arm?true:false;
		if(!flag)
			System.out.println("Given numer is Armstrong");
		else{
			System.out.println("Given numer is not Armstrong");
		}
	}

}
