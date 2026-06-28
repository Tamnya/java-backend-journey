package Arrays;
import java.util.*;
public class firstandsecondlargest {
//    public static int getSecondLargest(int[] arr) {
//      Arrays.sort(arr);
//      int n = arr.length;
//      for (int i = n-2; i >=0; i--){
//          if(arr[i] != arr[n-1]){
//              return arr[i];
//          }
//      }
//      return -1;
//    }

    public static int second(int[] arr){
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for(int i = 0; i < arr.length ; i++){
        if(arr[i]> largest){
            secondLargest = largest;
            largest = arr[i];
        }else if(arr[i] > secondLargest && arr[i] != largest){
            secondLargest = arr[i];
        }
    }
    return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 29, 28, 5};
      //  System.out.println(getSecondLargest(arr));
        System.out.println(second(arr));
    }

}
