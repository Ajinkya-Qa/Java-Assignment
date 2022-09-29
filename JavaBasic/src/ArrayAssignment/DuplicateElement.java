package ArrayAssignment;

public class DuplicateElement {
	public static void main(String[] args) {
		int[] num = { 1, 2, 5, 6, 5, 2, 8, 2 };
		DuplicateElement dpl = new DuplicateElement();
		dpl.printDuplicateElement(num);
	}
	void printDuplicateElement(int[] num) {
		int[] fr = new int[num.length];
		int visit = -1;
		for (int i = 0; i < num.length; i++) {
			int count = 1;
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					count++;
					fr[j] = visit;
				}
			}
			if (fr[i] != visit)
				fr[i] = count;
		}
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visit) {
				if (fr[i] >= 2)
					System.out.println(num[i]);
			}
		}
	}
	void removeDuplicateElement(int[] num) {
		int[] fr = new int[num.length];
		int visit = -1;
		for (int i = 0; i < num.length; i++) {
			int count = 1;
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					count++;
					fr[j] = visit;
				}
			}
			if (fr[i] != visit)
				fr[i] = count;
		}
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visit) {
					System.out.println(num[i]);
			}
		}
	}
}
