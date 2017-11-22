package firstuniquecharacterstring;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterString {

	public static void main (String[] args) {
		String s = "aaaaaaaaaddddddaaaaaaaa";
		System.out.println(firstUniqChar(s));
	}
	
	public static int firstUniqChar(String s) {
		int lenght = s.length();
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i = 0; i < lenght; i++) {
			map.merge(s.charAt(i), 1, Integer::sum);
		}
		
		for(Map.Entry<Character, Integer> e : map.entrySet()) {
			if(e.getValue() == 1) {
				return s.indexOf(e.getKey().toString());
			}
		}

		return -1;
    }
	
    public static int firstUniqChar1(String s) {
        int freq [] = new int[26];
        
        for(int i = 0; i < s.length(); i ++) {
            freq [s.charAt(i) - 'a'] ++;
        }
        
        for(int i = 0; i < s.length(); i ++) {
            if(freq [s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
	
}
