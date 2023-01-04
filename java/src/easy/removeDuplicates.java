package easy;

public class removeDuplicates {
    public static void main(String[] args) {
        new removeDuplicates().run();
    }

    void run() {
        int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int k2 = solution(nums2);
        System.out.println("Break off: " + k2);
    }

    public int solution(int nums[]) {
        if (nums.length == 0) {
            return 0;
        } else {
            int breakOff = 0;
            for (int i = 0; i < nums.length; i++)
                if (nums[breakOff] != nums[i]) {
                    breakOff++;
                    nums[breakOff] = nums[i];
                }

            return breakOff + 1;
        }
    }
}
