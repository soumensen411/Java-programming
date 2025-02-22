import java.util.*;

public class New {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        long sum = 0;
        // array input
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            sum += arr[i]; // 1. Sum of all numbers
        }
        Arrays.sort(arr); // 3. sort array
        double avg = (double) sum / n; // 2. avarage
        int maxval = arr[n - 1]; // 3. maximum value
        int minval = arr[0]; // 4. minimum value
        double variance = 0;
        double median;
        for (int i = 0; i < n; i++) {
            variance += Math.pow((arr[i] - avg), 2);
        }
        double stndDeviation = Math.sqrt(variance / n); // 6. Standard deviation
        if (n % 2 != 0) {
            median = arr[n / 2];
        } else {
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2;
        }
        System.out.println("1.Sum of all numbers : " + sum);
        System.out.println("2.Average: " + avg);
        System.out.println("3.Maximum : " + maxval + "\n" + "4.Minimum : " + minval);
        System.out.println("6.Standard Deviation: " + stndDeviation);
        System.out.println("7.Median: " + median);
        System.out.print("8.Sorted Array: ");
        scn.close();
        // array output in ascending order
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}