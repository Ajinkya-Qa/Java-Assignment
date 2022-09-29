package ArrayAssignment;

import java.lang.reflect.Array;

public class SortElement {

	public static void main(String[] args) {
		int[] a = { 2, 5, 4, 3, 8, 9 };
		SortElement sl = new SortElement();
		sl.sortElement(a);
	}

	void sortElement(int[] num) {
		int temp;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i] < num[j]) { // 
					
					temp = num[i]; //0=9
					num[i] = num[j]; //9=2 
					num[j] = temp; //2=9
				}
			}
		}
		for (int a : num) {
			System.out.print(a+" ");
		}
	}
	
	void findLargetNumberElement(int[] num,int position) {
		int temp;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i] > num[j]) { // 
					
					temp = num[i]; //0=9
					num[i] = num[j]; //9=2 
					num[j] = temp; //2=9
				}
			}
		}
		System.out.println(num[position-1]);
	}
}
