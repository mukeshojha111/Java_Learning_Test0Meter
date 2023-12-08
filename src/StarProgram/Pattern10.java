package StarProgram;

public class Pattern10 {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {
            // Print spaces before asterisks
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 1; k <= 6; k++) {
                System.out.print("*");
            }

            // Move to the next line after printing each row
            System.out.println();
        }
		
		
	}
}