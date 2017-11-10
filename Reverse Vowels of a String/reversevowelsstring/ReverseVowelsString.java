package reversevowelsstring;

public class ReverseVowelsString {
	static final String vowels = "aeiouAEIOU";

	public static void main (String[] args) {
		
		System.out.println(reverseVowels("leetcode"));
	}
	
	public static boolean isVowel(char c) {
		return vowels.indexOf(c) != -1;
	}
	
    public static String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int begin = 0;
        int end = s.length() - 1;
        while (begin < end) {
        	if(isVowel(word[begin]) && isVowel(word[end])) {
	            char temp = word[begin];
	            word[begin] = word[end];
	            word[end] = temp;
	            begin++;
	            end--;
        	}
        	
            if(!isVowel(word[begin])) begin++;
            if(!isVowel(word[end])) end--;
        }
        return String.valueOf(word);
    }
    
    public static String reverseVowels1(String s) {
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        
        while(start < end){
            
            while(start < end && !isVowel(word[start])) {
                start++;
            }
            
            while(start < end && !isVowel(word[end])) {
                end--;
            }
            
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            
            start++;
            end--;
        }
        return new String(word);
    }
}
