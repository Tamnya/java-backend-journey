package arrays;

public class shufflepracticetwo {
    public static void
    main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {10, 20 , 20};
        int[] ans = new int[4 * a.length - 2];
        int left = 0, right = 0;
        int even = 0, odd = 1;
        int secondleft = a.length -1, secondright = b.length -1;

            while(left< a.length && right < b.length){
                ans[even] = a[left++];
                ans[odd] = b[right++];
                even+=2;
                odd+=2;
            }
            while(secondleft >0 && secondright >= 0){

                ans[odd] = a[secondleft--];
                ans[even] = b[secondright--];
                even+=2;
                odd+=2;
        }
//        for(int i = ans.length/2; i < ans.length; i++){
//            }

        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }

    }
}
