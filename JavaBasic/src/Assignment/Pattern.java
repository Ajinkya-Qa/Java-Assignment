package Assignment;

public class Pattern {

	public static void main(String[] args) {
		simplePyramid(5);

	}

	static void simplePyramid(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
				
			}
//			for (int k = n; k > i; k--) {
//				System.out.print("* ");
//			}
//			- - - - -
//			
//
//			for (int k = n; k > i; k--) {
//				System.out.print("* ");
//			}

			System.out.println();
		}
	}

}
