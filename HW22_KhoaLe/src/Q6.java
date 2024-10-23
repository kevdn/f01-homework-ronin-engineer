public class Q6 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2, 1};
        System.out.println(findMin(arr, 0, arr.length - 1));
    }

    public static int findMin(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        } else {
            int mid = (l + r) / 2;
            int leftMin = findMin(arr, l, mid);
            int rightMin = findMin(arr, mid + 1, r);
            return Math.min(leftMin, rightMin);
        }
    }
}
