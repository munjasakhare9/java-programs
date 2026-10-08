package Program15b;

public class DynamicArray<T>{

    private Object[] arr;
    private int size = 0;

    public DynamicArray() {
        arr = new Object[10];
    }

    public DynamicArray(int customizedSize) {
        arr = new Object[customizedSize];
    }

    public void add(T value) {

        if (size == arr.length) {

            int len = arr.length == 0 ? 1 : arr.length + (arr.length >> 1);

            Object[] newArr = new Object[len];

            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }

            arr = newArr;
        }

        arr[size] = value;
        size++;
    }
	
    public String toString() {

        if (size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for (int i = 0; i < size; i++) {
            sb.append(arr[i]);

            if (i < size - 1) {
                sb.append(",");
            }
        }

        sb.append("]");

        return sb.toString();
    }
}