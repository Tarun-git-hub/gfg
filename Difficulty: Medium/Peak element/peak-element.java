class Solution {
    public int peakElement(int[] arr) {

        int n = arr.length;

        if (n == 1) {
            return 0;
        }

        int s = 0;
        int e = n - 1;

        while (s < e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] <= arr[mid + 1]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }

        return e;
    }
}