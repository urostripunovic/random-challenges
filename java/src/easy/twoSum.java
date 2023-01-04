package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */

public class twoSum {

	public static void main(String[] args) {
        new twoSum().run();
	}

    void run() {
        int[] arr = {3,2,4};
		System.out.println("Svar: "+Arrays.toString(On2(arr,6)));
        System.out.println("Svar: "+Arrays.toString(lessThanOn2(arr,6)));
        int[] arr2 = {2,7,11,15};
		System.out.println("Svar: "+Arrays.toString(lessThanOn2(arr2,9)));
    }
	
    //O(n^2)
	public int[] On2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }    
        }
        return null;
    }

    //less than O(n^2)
    public int[] lessThanOn2(int[] nums, int target) {
        Map<Integer,Integer> tracker = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (tracker.containsKey(comp)) 
                return new int[]{tracker.get(comp), i};  
            tracker.put(nums[i], i);
        }

        return new int[] {};
    }

}
