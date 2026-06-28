package Arrays;

public class Minelement {

    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    static void main(String[] args) {
        int[] arr = {4, 9, 2, 8, 1};
        System.out.println(findMin(arr));
    }
}

