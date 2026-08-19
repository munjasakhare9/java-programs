import java.util.Arrays;

class FixArray {
    public static double[] fixToArray(double arr[]) {
        int len = arr.length;
        double sum = 0;
		
        for (int i = 0; i < len; i++) {
            sum += arr[i];
        }
		
        double avg = sum / len;
        for (int i = 0; i < len; i++) {
            arr[i] = avg;
        }
        return arr;
    }
	
    public static void main(String args[]) {
        double arr[] = {2, 4, 6, 7, 8, 8};

        System.out.println(Arrays.toString(fixToArray(arr)));
    }
}