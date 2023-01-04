package easy;

public class lengthOfLastWord {
    public static void main(String[] args) {
        new lengthOfLastWord().run();
    }

    public void run() {
        String s = "Hello      ";
        System.out.println(solution(s));
    }

    public int solution(String s) {
        /*
         * Split solution
         * String[] words = s.split(" ");
         * return words[words.length-1].length();
         */

        /*
         * Brute force solution
         * for (int i = s.length() - 1; i > 0; i--) {
         * for (int j = i - 1; j > 0; j--) {
         * if (s.charAt(i) != ' ' && s.charAt(j) == ' ') {
         * return s.substring(j, i).length();
         * }
         * }
         * }
         * System.out.println(s.indexOf(' '));
         * return s.trim().length();
         */

        /*
         * leet code solution
         * int len = 0;
         * for (int i = s.length() - 1; i >= 0; i--) {
         * if (s.charAt(i) != ' ')
         * len++;
         * else
         * if (len > 0) return len;
         * }
         * 
         * return len;
         */
        return s.split(" ")[s.split(" ").length-1].length();
    }
}
