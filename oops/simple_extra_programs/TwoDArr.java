import java.util.Arrays;
class TwoDArr{
	public static void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;

            while (left < right) {

                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
		System.out.println(Arrays.toString(matrix).length);
		
    }
	public static void main(String args[]){
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		rotate(arr);
	}
}
/*
(1,1)=(3,1)		
(1,2)=(2,1)
(1,3)=(1,1)

(2,1)=(3,2)
(2,2)=(2,2)
(2,3)=(1,2)

(3,1)=(3,3)
(3,2)=(2,3)
(3,3)=(1,3)
*/