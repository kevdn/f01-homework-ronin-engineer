import java.util.*;
import java.lang.*;

class Q1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        Arrays.sort(arr);


        if(k == 0) {
            if(arr[0] > 1) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
            return;
        }


        if(k == n) {
            System.out.println(arr[n-1]);
            return;
        }


        if(k > 0 && k <= n) {

            if(k < n && arr[k-1] != arr[k]) {
                System.out.println(arr[k-1]);
            } else {
                System.out.println(-1);
            }
            return;
        }

        System.out.println(-1);
    }
}