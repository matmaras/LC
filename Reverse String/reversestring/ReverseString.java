package reversestring;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	public static void main (String[] args) {
		
		System.out.println(reverseString5("hello"));
	}
	
    public static String reverseString(String s) {
    	return new StringBuilder(s).reverse().toString();
    }
    
    public static String reverseString5(String s) {
        char[] word = s.toCharArray();
        
        List<Character> list = new LinkedList<>();

        for(char ch : word) {
        	list.add(ch);
        }
        
        ListIterator<Character> liEnd = list.listIterator(list.size());
        ListIterator<Character> liBegin = list.listIterator();
        
        while(liEnd.hasPrevious() && liBegin.hasNext() && liEnd.previous() != liBegin.next()) {
        	  Character tmp = liEnd.previous();
        	  liEnd.set(liBegin.next());
        	  liBegin.set(tmp);
        	}
        
        return list.toString();
    }
    
    public static String reverseString3(String s) {
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            word[i] = (char) (word[i] ^ word[j]);
            word[j] = (char) (word[i] ^ word[j]);
            word[i] = (char) (word[i] ^ word[j]);
            i++;
            j--;
        }
        return new String(word);
    }
    
    public static String reverseString1(String s) {
    	char[] word = s.toCharArray();
    	int wordLenght = word.length - 1;
    	
		for(int i = 0; i < word.length/2; i++ ) {
    		char tmp = word[i];
    		word[i] = word[wordLenght - i];
    		word[wordLenght - i] = tmp;
    	}
    	
    	return String.valueOf(word);
    }
    
    public static String reverseString2(String s) {
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(word);
    }
    
    public static String reverseString4(String s) {
        byte[] bytes = s.getBytes();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            byte temp = bytes[i];
            bytes[i] = bytes[j];
            bytes[j] = temp;
            i++;
            j--;
        }
        return new String(bytes);
    }
}
