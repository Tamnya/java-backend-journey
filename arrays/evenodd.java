package Arrays;

public class evenodd {
    public static int even(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if( arr[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int odd(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if( arr[i] % 2 != 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 9 , 2, 8, 1};
        System.out.println(even(arr));
        System.out.println(odd(arr));
    }
}
