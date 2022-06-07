import java.util.* ;
import java.io.*; 
public class sortcolors
{
    public static void sort012(int[] nums)
    {
        int ans[] = new int[3];
        for (int i : nums) {
            ans[i]++;
        }
        int k = 0;
        while(ans[k++] ==0);
        k--;
        for (int i = 0; i < nums.length; i++) {
            if(ans[k] == 0){
                while(ans[k++] ==0);
                k--;
            }
            nums[i] = k;
            ans[k]--;

        }
    }
}