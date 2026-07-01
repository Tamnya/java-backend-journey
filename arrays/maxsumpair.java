package arrays;

public class maxsumpair {

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10};
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int maxindex = Integer.MIN_VALUE;
        int secondindex = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                secondmax = max;
                secondindex = maxindex;
                max = arr[i];
                maxindex = i;
            }else if(arr[i]>secondmax && arr[i] != max){
                secondmax = arr[i];
                secondindex = i;
            }
        }
        System.out.println("Index = "+ secondindex +" ,"+ maxindex);
    }
}
