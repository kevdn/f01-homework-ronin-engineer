public class Q3 {
    public static void main(String[] args) {
        int[] sortedArr1 = {1, 3, 5, 7, 9};
        int[] sortedArr2 = {2, 4, 6, 8, 10};
        merge(sortedArr1, sortedArr2);
    }

    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] arr = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }
        while (i < n) {
            arr[k++] = arr1[i++];
        }
        while (j < m) {
            arr[k++] = arr2[j++];
        }
        for (int x = 0; x < n + m; x++) {
            System.out.print(arr[x] + " ");
        }
        System.out.println();
    }


}
