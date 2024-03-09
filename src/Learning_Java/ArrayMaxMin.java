package Learning_Java;

public class ArrayMaxMin {

	public static void main(String[] args) {
		int[] ar = {10, 20, 5, 17, 45, 12};

        // Initialize min and max with the first element of the array
        int min = ar[0];
        int max = ar[0];

        // Iterate through the array to find min and max
        for (int num : ar) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);

	}

}
