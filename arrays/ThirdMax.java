package arrays;

public class ThirdMax {
    public static int getMax(int[] arr) {
        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;
        long thirdLargest = Long.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            } else if (arr[i] > thirdLargest && arr[i] < secondLargest) {
                thirdLargest = arr[i];
            }
        }
        if (thirdLargest == Long.MIN_VALUE) {
            return (int) largest;
        } else {
            return (int) thirdLargest;
        }
    }
    public static void main(){
        int[] arr = {1, 2, 2, 5, 3, 1};
        System.out.println(getMax(arr));
    }
}
