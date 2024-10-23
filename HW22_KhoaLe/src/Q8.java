public class Q8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println(isPalindrome(arr, 0, arr.length - 1));
    }

    public static boolean isPalindrome(int[] arr, int l, int r) {
        if (l >= r) {
            return true;
        } else {
            if (arr[l] != arr[r]) {
                return false;
            } else {
                return isPalindrome(arr, l + 1, r - 1);
            }
        }
    }
}
