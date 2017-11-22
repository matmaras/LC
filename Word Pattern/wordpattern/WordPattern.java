package wordpattern;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main (String[] args) {
		String pattern = "abba";
		String str = "dog dog dog cat";
		System.out.println(wordPattern1(pattern, str));
	}
	
	public static boolean wordPattern(String pattern, String str) {
		String[] strings = str.split(" ");
		
		if(strings.length != pattern.length()) return false;
		
		Map<Character, String> map = new HashMap<>();
		
		for(int i = 0; i < strings.length; i++) {
			char key = pattern.charAt(i);
			if(map.containsKey(key)) {
				if (!map.get(key).equals(strings[i])) {
					return false;
				}
			} else if (map.containsValue(strings[i])){
				return false;
			} else {
				map.put(key, strings[i]);
			}
		}
		
		return true;
    }
	
	public static boolean wordPattern1(String pattern, String str) {
	    String[] words = str.split(" ");
	    if (words.length != pattern.length()) {
	    	return false;	    	
	    }
	    
	    Map index = new HashMap<>();
	    
	    for (Integer i = 0; i < words.length; ++i) {
	        if (index.put(pattern.charAt(i), i) != index.put(words[i], i)) {
	            return false;
	        }
	    }
	    
	    return true;
	}
}
