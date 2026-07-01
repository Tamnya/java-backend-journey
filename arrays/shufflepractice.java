package arrays;

public class shufflepractice {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {7, 8, 9};
        //output: {1,7,2,8,3,9}
        int[] ans = new int[2*a.length];
        int left = 0;
        int right = 0;
        int i = 0, j = 1;

        while(left<a.length && right < b.length){
            ans[i] = a[left++];
            ans[j] = b[right++];
            i += 2;
            j += 2;
        }
        for(int k = 0; k < ans.length; k++){
            System.out.println(ans[k]);
        }
    }
}
