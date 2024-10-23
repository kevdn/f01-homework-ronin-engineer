public class Q7 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2, 1};
        System.out.println(sumEven(arr, 0, arr.length - 1));
    }

    public static int sumEven(int[] arr, int l, int r) {
        if (l == r) {
            if (arr[l] % 2 == 0) {
                return arr[l];
            } else {
                return 0;
            }
        } else {
            int mid = (l + r) / 2;
            int leftSum = sumEven(arr, l, mid);
            int rightSum = sumEven(arr, mid + 1, r);
            return leftSum + rightSum;
        }
    }
}
