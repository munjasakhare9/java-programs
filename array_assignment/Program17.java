class Program17 {
    static int binarySearch(int arr[], int key, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (key == arr[mid]) {
                return mid;
            }
            else if (key < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 3;

        System.out.println(binarySearch(arr, key, 0, arr.length - 1));
    }
}