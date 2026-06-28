package Arrays;

public class countpositivenegativezero {
    public static int zero(int[] arr){
        if(arr == null || arr.length == 0) return 0;
        int count = 0;
        for (int j : arr) {
            if (j == 0) {
                count++;
            }
        }
        return count;
    }

    public static int positive(int[] arr){
        if(arr == null || arr.length == 0) return 0;
        int count = 0;
        for (int j : arr) {
            if (j > 0) {
                count++;
            }
        }
        return count;
    }

    public static int negative(int[] arr){
        if(arr == null || arr.length == 0) return 0;
        int count = 0;
        for (int j : arr) {
            if (j < 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 0, 7, -9, 5, 0, -11};
        System.out.println("Positive: " + positive(arr));
        System.out.println("Negative: " + negative(arr));
        System.out.println("Zero: " + zero(arr));

    }
}
