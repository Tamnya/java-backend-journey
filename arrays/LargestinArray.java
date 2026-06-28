package Arrays;
import java.util.*;
public class LargestinArray {
    public static int getLargest(int[] arr){
        int largest = Integer.MIN_VALUE; //-infinity
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
         int[] arr = { 23, 14, 16, 37, 74, 21};
        System.out.println(getLargest(arr));
    }

}
