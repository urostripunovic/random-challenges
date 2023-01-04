package easy;

import java.util.Arrays;

public class longestCommonPrefix {
    public static void main(String[] args) {
        new longestCommonPrefix().run();
    }

    void run() {
        String[] strs = {"a"};
        System.out.println(solution(strs));
    }

    String solution(String[] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a.length(), b.length()));
        String prefix = arr[0];
        for (int i = 0; i < prefix.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[0].charAt(i) != arr[j].charAt(i)) {
                    System.out.println(i);
                    return arr[0].substring(0, i);
                }
            }
        }

        return arr[0].substring(0, prefix.length());
    }
}
