package workshop;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class PrimeNumberFinder{
        public static void main(String[] args) {
            int[] numbers = { 5, 7, 2, 1, 9, 6, 17, 7 };
            Set<Integer> primes = new HashSet<>();

            for (int number : numbers) {
                if (isPrime(number)) {
                    primes.add(number);
                }
            }
            Integer[] sortedPrimes = primes.toArray(new Integer[0]);
            Arrays.sort(sortedPrimes);
            System.out.println(Arrays.toString(sortedPrimes));
        }
        private static boolean isPrime(int number) {
            if (number < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }