package venne;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	/**
	 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
	 * The overall run time complexity should be O(log (m+n)) (Glömt helt hur big O fungerar så ba kör på).
	 * 
	 * Example 1:
	 * Input: nums1 = [1,3], nums2 = [2]
	 * Output: 2.00000 
	 * Explanation: merged array = [1,2,3] and median is 2.
	 * 
	 * Example 2:
	 * Input: nums1 = [1,2], nums2 = [3,4] 
	 * Output: 2.50000
	 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
	 */

	public static void main(String[] args) {
		int [] nums1 = {1,2}, nums2 = {3,4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] mergedArr = new int[nums1.length + nums2.length];
		int i = 0, j = 0, k = 0; //i: nums1, j: nums2, k: mergedArr

		/**
		 * Så länge nums1 eller nums2 inte är "klara" så kör vi
		 * Om nums1 inte har några elements kvar så lägg in alla från nums2
		 * Eller om nums2 inte har några element kvar så lägg in alla från nums1
		 * Eller om nums1 har ett längre värde än nums2 så lägg in den först
		 * Annars lägg in nums2 för den är lägre än nums1
		 */
		while (i < nums1.length || j < nums2.length) {
			if (i >= nums1.length) {
				mergedArr[k] = nums2[j];
				j++;
			} else if (j >= nums2.length) {
				mergedArr[k] = nums1[i];
				i++;
			} else if (nums1[i] < nums2[j]) {
				mergedArr[k] = nums1[i];
				i++;
			} else {
				mergedArr[k] = nums2[j];
				j++;
			}
			k++;
		}
		//System.out.println(Arrays.toString(mergedArr));
		if (mergedArr.length % 2 == 0) {
			return (double) (mergedArr[mergedArr.length / 2 - 1] + mergedArr[mergedArr.length / 2])/2;
		} else {
			return mergedArr[mergedArr.length/2];
		}
	}
	
	/**
	 * Den enklare vägen, inte mycket till problem lösning though.
	 */
	public static double findMedianSortedArraysBs(int[] nums1, int[] nums2) {
		int[] mergedArr = new int[nums1.length + nums2.length];
		
		for (int i = 0; i < nums1.length; i++) {
			mergedArr[i] = nums1[i];
		}
		
		for (int i = 0; i < nums2.length; i++) {
			mergedArr[i + nums1.length] = nums2[i];
		}

		//System.out.println(Arrays.toString(mergedArr));
		Arrays.sort(mergedArr);
		//System.out.println(Arrays.toString(mergedArr));
		
		if (mergedArr.length % 2 == 0) {
			return (double) (mergedArr[mergedArr.length / 2 - 1] + mergedArr[mergedArr.length / 2])/2;
		} else {
			return mergedArr[mergedArr.length/2];
		}
	}

}
