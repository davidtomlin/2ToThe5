/**
 * This program proves that the sum of {1, 2, ... , n} cubes is equal to the square of the sum of {1, 2, ... , n}.
 * The input should be an integer value greater than 1 and less than 46341.
 */
public class Program {
    public static void main(String[] args) {
        int i = 0, sum = 0, sumOfCubes = 0, n = Integer.parseInt(args[0]);
        
        while (++i <= n) {
            sumOfCubes += (i*i*i);
            sum += i;
        }
        
        if (sumOfCubes == (sum*sum)) {
            System.out.println("The sum of { 1 ... " + args[0] + " } is " + sum + ".\nThe sum of cubes is " + sumOfCubes + ".\nThe square of the sum is " + (sum*sum) + ".");
        } else {
            System.out.println("Oops, guess I was wrong.");
        }
    }
}
