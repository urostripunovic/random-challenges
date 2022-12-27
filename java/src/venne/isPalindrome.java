package venne;

public class isPalindrome {
    public static void main(String[] args) {
        new isPalindrome().run();
    }

    void run() {
        System.out.println(palindrome(121));
    }

    public boolean palindrome(int x) {
        int temp = x;
        int palindrome = 0;
        while (temp > 0) {
            palindrome = palindrome*10 + temp % 10;
            temp = temp / 10;
        }
        return palindrome == x;
    }
}
