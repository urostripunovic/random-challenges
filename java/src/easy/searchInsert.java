package easy;

public class searchInsert {
    public static void main(String[] args) {
        new searchInsert().run();
    }

    public void run() {
        int[] nums = {1, 3, 5, 6};
        System.out.println(solution(nums, 7));
    }

    public int solution(int[] nums, int target) {
        int low = nums.length - nums.length;
        int high = nums.length;
        //int mid = -1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) 
                low = low + 1;
            else
                high = mid;
            //System.out.println(high + " " + low);
        }
        return low;
    }
}
