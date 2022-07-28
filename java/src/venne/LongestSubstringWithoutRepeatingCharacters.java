package venne;

public class LongestSubstringWithoutRepeatingCharacters {
	
	/**
	 * Given a string s, find the length of the longest substring without repeating characters.
	 * 
	 * Example 1:
	 * Input: s = "abcabcbb"
	 * Output: 3
	 * Explanation: The answer is "abc", with the length of 3.
	 * 
	 * Example 2:
	 * Input: s = "bbbbb"
	 * Output: 1
	 * Explanation: The answer is "b", with the length of 1.
	 * 
	 * Example 3:
	 * Input: s = "pwwkew"
	 * Output: 3
	 * Explanation: The answer is "wke", with the length of 3.
	 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
	 */

	public static void main(String[] args) {
		String s = "pwwkew"; //dvdf
		System.out.println(lengthOfLongestSubstring(s));
	}

	/**
	 * Vi vill l�gga till character om den inte finns i build str�ngen.
	 * Finns den, d� vill vi ta bort f�rg�ende och b�rja om p� nytt med den nya karakt�ren i str�ngen build. 
	 * T�nk p� att inte ta bort all efter, exempel 3 va en liten f�lla
	 */
	public static int lengthOfLongestSubstring(String s) {
		int longest = 0;
		String build = "";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!build.contains(c+"")) {
				build += c;
				System.out.println(build);
			} else {
				//build = build.replace(c, c); //vi f�r med unwanted characters
				build = build.substring(build.indexOf(c)+1)+c; 
			}
			longest = build.length() > longest ? build.length() : longest;
		}		
		return longest;
	}
}
