package Arrays;

public class Maxelement {
    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static void main(String[] args) {
        int[] arr = {4, 9, 2, 8, 1};
        System.out.println(findMax(arr));
    }
}
