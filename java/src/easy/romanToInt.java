package easy;

import java.util.HashMap;
import java.util.Map;

public class romanToInt {
    public static void main(String[] args) {
        new romanToInt().run();
    }

    void run() {
        String s = "XI";
        System.out.println("Roman: " + s + " is: " + romanToInt(s));
    }

    int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int a = map.get(s.charAt(i));
            int b = map.get(s.charAt(i + 1));

            if (a < b)
                sum -= a;
            else
                sum += a;
        }
        return sum + map.get(s.charAt(s.length() - 1));
    }
}
