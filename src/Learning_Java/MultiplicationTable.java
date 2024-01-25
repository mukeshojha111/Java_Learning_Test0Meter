package Learning_Java;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		// Loop for each multiplier from 1 to 10
        for (int j = 1; j <= 10; j++) {
            // Loop for the table from 1 to 20
            for (int i = 1; i <= 20; i++) {
                // Skip rows 6, 12, and 17
                if (i == 6 || i == 12 || i == 17) {
                    continue;
                }

                int result = i * j;
                System.out.print(result + "\t");

            }
            System.out.println(); 

		}

	}
}

