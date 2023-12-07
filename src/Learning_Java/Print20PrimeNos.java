package Learning_Java;

public class Print20PrimeNos {

	public static void main(String[] args) {
		int count = 0;

        System.out.println("First 20 prime numbers:");

        for (int number = 2; count < 20; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
        }
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }

        return true; // Prime number
    }
	}

