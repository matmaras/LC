package ransomnote;

public class RansomNote {

	public static void main (String[] args) {
		String ransomNote = "aagh";
		String magazine = "aaaaaaa";
		System.out.println(canConstruct(ransomNote, magazine));
	}
	
    public static boolean canConstruct(String ransomNote, String magazine) {
    	if(ransomNote.length() > magazine.length()) return false;
    	
    	int[] result = new int[26];
    	
    	for(int i = 0; i < magazine.length(); i++) {
    		result[magazine.charAt(i) - 'a']++;
    	}
    	
    	for(int i = 0; i < ransomNote.length(); i++) {
    		if(--result[ransomNote.charAt(i) - 'a'] < 0) return false;
    	}
    	
		return true;
    }
    
    public static boolean canConstruct1(String ransomNote, String magazine) {
    	int[] result = new int[26];
    	
    	for(char ch : magazine.toCharArray()) {
    		result[ch - 'a']++;
    	}
    	
    	for(char ch : ransomNote.toCharArray()) {
    		if(--result[ch - 'a'] < 0) return false;
    	}
    	
		return true;
    }
}
