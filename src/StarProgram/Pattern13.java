package StarProgram;

public class Pattern13 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 6; i++) {
            // Print spaces before asterisks
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 6; k >= i; k--) {
                System.out.print("*");
            }

            // Move to the next line after printing each row
            System.out.println();
        }

        // Print the lower half of the pattern
        for (int i = 2; i <= 6; i++) {
            // Print spaces before asterisks
            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // Move to the next line after printing each row
            System.out.println();

	}

	}}
