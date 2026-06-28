package Arrays;

public class secondSmallestinArray {
    public static int small(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i]<smallest){
                second = smallest;
                smallest = arr[i];
            }else if(arr[i] > smallest && arr[i] < second) {
                second = arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int[] arr = {7,3,9,2,5};
        System.out.println(small(arr));
    }
}
