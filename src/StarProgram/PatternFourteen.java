package StarProgram;

public class PatternFourteen {

	public static void main(String[] args) {
		for (int i = 0; i <= 5 - 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= 5 - 1; k++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		for (int i = 5 - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= 5 - 1; k++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}

	}

}
