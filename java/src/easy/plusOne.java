package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class plusOne {
    public static void main(String[] args) {
        new plusOne().run();
    }

    public void run() {
        int[] digits = {9,8};
        System.out.println(Arrays.toString(solution(digits)));
    }

    //Effective
    /*public int[] solution(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newSize = new int[digits.length+1];
        newSize[0] = 1;

        return newSize;
    }*/

    public int[] solution(int[] digits) {
        int carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                break;
            } else
                digits[i] = 0;
        }
        System.out.println(Arrays.toString(digits));

        if (digits[0] == 0) {
            int[] newSize = new int[digits.length + 1];
            newSize[0] = 1;
            return newSize;
        } 

        //See if all contains zero
        return digits;
    }
    
    /* Out of range
    public int[] solution(int[] digits) {
        String sum = "";

        for (int i = 0; i < digits.length; i++) {
            sum += "" + digits[i];
        }
        int plusOne = Integer.parseInt(sum) + 1;
        //new arr length
        int len = Integer.toString(plusOne).length();
        int[] res = new int[len];

        for (int i = len - 1; i >= 0; i--) {
            res[i] = plusOne % 10;
            plusOne /= 10;
        }
        return res;
    }
    */
}
