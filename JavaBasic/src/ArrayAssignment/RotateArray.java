package ArrayAssignment;

public class RotateArray {

	public static void main(String[] args) {
		RotateArray rt = new RotateArray();
		int[] num = { 1, 2, 3, 5, 4, 69 };
//		{2,3,5,4,69,1}
		rt.rotateLeftArray(num, 2);
	}
	void rotateLeftArray(int[] num, int postion) {
		for(int j=0;j<postion;j++) {
			int first=num[0];
			for(int i=0;i<num.length-1;i++) {
				num[i]=num[i+1];
			}
			num[num.length-1]=first;	
		}
		for (int j = 0; j < num.length; j++) {
			System.out.print(num[j]+" ");
		}
	}
	void rotateRightArray(int[] num, int postion) {
		System.out.println("Original Array");
		for (int j = 0; j < num.length; j++) {
			System.out.print(num[j]+" ");
		}
		for (int k = 0; k < postion; k++) {
			int lastElement = num[num.length-1];
			for (int i = num.length - 1; i >0 ; i--) {
				num[i] = num[i - 1];
			}
			num[0] = lastElement;
		}
		System.out.println("\nNew Array");
		for (int j = 0; j < num.length; j++) {
			System.out.print(num[j]+" ");
		}
	}
}
