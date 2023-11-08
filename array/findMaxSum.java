import java.util.Scanner;
import java.util.HashMap;

public class findMaxSum {
    public static int maxSum(int n, int arr[]) {
        int sum = 0;
        int res = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1); // Initialize the sum 0 at index -1

        for (int i = 0; i < n; i++) {
            sum += (arr[i] == 1) ? 1 : -1;
            if (mp.containsKey(sum)) {
                res = Math.max(res, i - mp.get(sum));
            } else {
                mp.put(sum, i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = maxSum(n, arr);
        System.out.println("Maximum subarray length with equal 1s and -1s: " + res);
    }
}
