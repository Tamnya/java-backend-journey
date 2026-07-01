package arrays;

public class pairpracticetwo {
    public static void main(String[] args) {
        int[] arr = {4,7 ,2, 9,1};
        int count =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
   for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j<arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
                count++;
                if((arr[i] + arr[j]) > max){
                    max = arr[i] + arr[j];
                }
                if(Math.abs(arr[i] - arr[j]) < min){
                    min = Math.abs(arr[i] - arr[j]);
                }
                if((arr[i]+arr[j]) % 5 == 0){
                    System.out.println(arr[i] +" "+arr[j]);
                }
            }
        }
        System.out.println(count);
        System.out.println(max);
        System.out.println(min);
    }
}
