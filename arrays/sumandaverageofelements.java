package Arrays;

public class sumandaverageofelements {
    public static int sumOfElements(int[] arr){
        if(arr.length == 0) return 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+= arr[i];
        }
        return sum;
    }

    public static double avg(int[] arr){
        if(arr.length == 0) return 0;
        return (double) sumOfElements(arr) / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 8, 1};
        System.out.println(sumOfElements(arr));
        System.out.println(avg(arr));
    }
}
