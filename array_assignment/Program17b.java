class Program17b {
    static int binarySearch(int arr[], int key) {
		int start=0, end=arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;//0+3-0=3,0+3/2=1

            if (key == arr[mid]) {//arr[4]=5
                return mid;
            }
            else if (key < arr[mid]) {// 2<5 yes
                end = mid - 1;//4-1=3
            }
            else {
                start = mid + 1;//7+1=8
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 2;

        System.out.println(binarySearch(arr, key));
    }
}