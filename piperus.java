import java.util.*;

public class piperus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[m];
        int sum = 0, res = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arr[i] = arr[i] - k;
            sum += arr[i];
        }
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
            arr1[i] = arr1[i] - k;
            res += arr1[i];
        }
        int result = sum - res;
        if(result>0)
        {
            System.out.println(res-sum-k);
        }
        else
        {
            System.out.println(result+k);
        }

    }
}
