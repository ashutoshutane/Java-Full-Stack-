import java.util.Scanner;

public class SumOfPrime 
	{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        int sum = 0;
        int num = 2; // Start from the smallest prime number

        System.out.print("Output: ");

        while (sum < input) {
            // Check if 'num' is prime without using a separate method
            boolean isPrime = true;
            if (num < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                if (sum + num <= input) {
                    sum += num;
                    System.out.print(num);
                    if (sum < input) {
                        System.out.print("+");
                    }
                }
            }
            num++;
        }

        System.out.println("=" + input);
    }
	}
