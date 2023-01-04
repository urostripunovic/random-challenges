package easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class removeElement {
    public static void main(String[] args) {
        new removeElement().run();
    }

    public void run() {
        int k = 0;
        int[] nums = { 3, 2, 2, 3 };
        k = solution(nums, 3);

        int[] nums2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
        k = solution(nums2, 2);

        int[] nums3 = { 1 };
        k = solution(nums3, 1);
    }

    public int solution(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) 
            if (nums[i] != val) 
                nums[k++] = nums[i];
        
        System.out.println(Arrays.toString(nums) + " " + k);
        return k;
    }
}
