package Arrays;

public class reversearray {
    public static void getReverse(int[] arr){
        int first = 0, last = arr.length - 1;
        while(first<last){
            //swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7};
        getReverse(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
