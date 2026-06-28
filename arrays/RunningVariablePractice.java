package Arrays;

public class RunningVariablePractice {
    public static void getLargestOddAndSmallestEven(int[] arr){
        int largestOdd = Integer.MIN_VALUE;
        int smallestEven = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0 && arr[i] > largestOdd){
                largestOdd = arr[i];
            }
            if(arr[i] % 2 == 0 && arr[i] < smallestEven){
                smallestEven = arr[i];
            }
        }
        if(largestOdd == Integer.MIN_VALUE) {
            System.out.println("Odd doesn't exist");
        }
        if(smallestEven == Integer.MAX_VALUE){
            System.out.println("Even doesn't exist");
        }
        System.out.println("Largest Odd is : "+ largestOdd + " and smallest even is: " + smallestEven);
        }
    public static void main(String[] args) {
        int[] arr = {4, 9, 7, 2, 8, 5};
        getLargestOddAndSmallestEven(arr);
    }
}
