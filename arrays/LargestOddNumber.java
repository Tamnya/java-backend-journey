package Arrays;

public class LargestOddNumber {
    public static int largestOdd(int[] arr){
        int odd = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0) {
                odd = largest;
                largest = arr[i];
            }
            if(odd > largest){
                return odd;
                }else{
            return largest;
            }
            }

        return 0; // doesn't exist
    }
    public static void main(String[] args) {
        int[] arr = {2, 8, 5, 10, 7};
        System.out.println(largestOdd(arr));
    }
}
