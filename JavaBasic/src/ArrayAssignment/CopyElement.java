package ArrayAssignment;

public class CopyElement {

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4 };
		CopyElement cp = new CopyElement();
		cp.printArray(num);
		
	}

	Object[] copyElement(int[] num) {
		int temp[]=new int[num.length];
		for(int i=0;i<num.length;i++) {
			temp[i]=num[i];
		}
		return new Object[] {num,temp};
	}
	void printArray(int [] num) {
		int count=0;
		Object []temp=copyElement(num);
		for (int i=0;i<temp.length;i++) {
			int a[]=(int[])temp[i];
			if(count==1) {
				System.out.println("******************");
//				break;
			}
			count++;
			for (int j : a) {
				System.out.println(j);
			}
			
		}
	}
}
