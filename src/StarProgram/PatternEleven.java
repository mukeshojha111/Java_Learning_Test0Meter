package StarProgram;

public class PatternEleven {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
            // Print spaces before asterisks
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 1; k <= 5; k++) {
                System.out.print("*");
            }

            // Move to the next line after printing each row
            System.out.println();
        }
		
		
	}
}