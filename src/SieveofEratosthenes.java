import java.util.Scanner;

public class SieveofEratosthenes {

    public static void main(String[] args) {

        // Get the ceiling on our prime numbers
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the prime number ceiling:");
        N = sc.nextInt();
        sc.close();

        //Init our numbers array, where true denotes primality
        boolean[] isPrime = new boolean[N];
        isPrime[0] = false;
        for (int c = 1; c < N; c++) {
            isPrime[c] = true;
        }

        //Check every number >= 2 for primality
        for (int i = 2; i <= N; i++) {

            //i is prime if hasn't been "crossed of" yet
            if (isPrime[i - 1]) {

                //print out prime number
                System.out.println(i);

                // "cross off" all the subsequent multiples of i
                for (int j = 2 * i; j <= N; j += i) {
                    isPrime[j - 1] = false;
                }
            }
        }

    }
}
