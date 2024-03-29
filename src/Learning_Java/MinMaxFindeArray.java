package Learning_Java;

import java.util.Arrays;

/**
 * Test cases to consider:

1. An array with distinct values:
2. An array with repeated values:
3. An array with negative numbers:
4. An array with both positive and negative numbers:

 */

public class MinMaxFindeArray {

	public static void main(String[] args) {
		int[] ar = {10, 20, 5, 17, 45, 12};

        // Sort the array in ascending order
        Arrays.sort(ar);

        // Find the last 2 minimum numbers
        int lastTwoMin1 = ar[ar.length - 2];
        int lastTwoMin2 = ar[ar.length - 1];

        // Find the last 2 maximum numbers
        int lastTwoMax1 = ar[1];
        int lastTwoMax2 = ar[0];

        System.out.println("Last 2 minimum numbers: " + lastTwoMin1 + ", " + lastTwoMin2);
        System.out.println("Last 2 maximum numbers: " + lastTwoMax1 + ", " + lastTwoMax2);
    }

	}

