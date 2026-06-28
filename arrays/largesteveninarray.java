package Arrays;

public class largesteveninarray {
   public static void main(String[] args) {
//        int[] arr = {7, 12, 5, 18, 9};
//        int largestEven = Integer.MIN_VALUE;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i]%2 == 0 && arr[i] > largestEven){
//                largestEven = arr[i];
//            }
//        }
//       System.out.println(largestEven);

//       int[] arr = {8,4, 7, 9, 5};
//       int smallestOdd = Integer.MAX_VALUE;
//       for(int i = 0; i < arr.length; i++){
//           if(arr[i] % 2!= 0 && arr[i] < smallestOdd){
//               smallestOdd = arr[i];
//           }
//       }
//       if(smallestOdd == Integer.MAX_VALUE){
//           System.out.println("NO ODD number here");
//       }else{
//       System.out.println(smallestOdd);
//    }

       int[] arr = {-8, 4, -2, -15, 7};
       int largestNegative = Integer.MIN_VALUE;
       for(int i = 0; i < arr.length; i++){
           if(arr[i] < 0 && arr[i] > largestNegative){
               largestNegative = arr[i];
           }
       }
       if(largestNegative == Integer.MIN_VALUE){
           System.out.println("Doesn't exist");
       }else{
           System.out.println(largestNegative);
       }
   }

}
