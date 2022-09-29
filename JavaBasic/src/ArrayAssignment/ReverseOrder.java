package ArrayAssignment;

public class ReverseOrder {

	public static void main(String[] args) {
		ReverseOrder rs=new ReverseOrder();
		int [] num= {1,10,2,45,32};
		rs.findMinNumer(num);

	}
	
	void printReverseOrder(int num[]) {

		System.out.println(num.length);
		for(int i=num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
	}
	
	void printEvenPosition(int [] num) {
		for(int i=0;i<num.length;i++) {
			if(i%2==0)
				System.out.println(num[i]);
		}
	}
	
	void printOddPosition(int [] num) {
		for(int i=0;i<num.length;i++) {
			if(i%2!=0)
				System.out.println(num[i]);
		}
	}
	void sumOfAllElement(int [] num) {
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		System.out.println(sum);
	}
	void findMaxNumer(int [] num) {
		int max=0;
		for(int i=0;i<num.length;i++) {
//			0<1
			if(max<num[i])
				max=num[i];
		}
		System.out.println(max);
	}
	
	void findMinNumer(int [] num) {
		int min=1;
		for(int i=0;i<num.length;i++) {
//			0>1
			if(min>num[i])
				min=num[i];
		}
		System.out.println(min);
	}
	
}
