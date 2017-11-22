package validanagram;

import java.util.Arrays;

public class ValidAnagram {

	public static void main (String[] args) {
		String s = "a";
		String t = "b";
		System.out.println(isAnagram1(s, t));
	}
	
	//Time complexity : O(n)
	//Space complexity : O(1).
	public static boolean isAnagram(String s, String t) {
    	if(s.length() != t.length()) return false;
    	
    	int lenght = s.length();
    	int[] results = new int[26];
    	
    	for(int i = 0; i < lenght; i++) {
    		results[s.charAt(i) - 'a']++;
    		results[t.charAt(i) - 'a']--;
    	}
    	
    	for(int result : results) {
    		if(result != 0) {
    			return false;
    		}
    	}
    	
		return true;
    }
	
	public static boolean isAnagram1(String s, String t) {
    	if(s.length() != t.length()) return false;
    	
    	int lenght = s.length();
    	int[] results = new int[26];
    	
    	for(int i = 0; i < lenght; i++) {
    		results[s.charAt(i) - 'a']++;
    	}
    	
    	for(int i = 0; i < lenght; i++) {
    		if(--results[t.charAt(i) - 'a'] < 0) return false;
    	}
    	
		return true;
    }
	
	//Time complexity : O(n log n)
	//Space complexity : O(1).
	public static boolean isAnagram3(String s, String t) {
	    if (s.length() != t.length()) {
	        return false;
	    }
	    char[] str1 = s.toCharArray();
	    char[] str2 = t.toCharArray();
	    Arrays.sort(str1);
	    Arrays.sort(str2);
	    return Arrays.equals(str1, str2);
	}
}
