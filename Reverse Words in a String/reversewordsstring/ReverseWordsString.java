package reversewordsstring;

public class ReverseWordsString {

	public static void main (String[] args) {
		
		System.out.print(reverseWords("Let's take LeetCode contest"));
	}
	
    public static String reverseWords(String s) {
    	
    	String[] words = s.split(" ");
    	StringBuilder sb = new StringBuilder();
    	
    	for(String word : words) {
    		sb.append(new StringBuilder(word).reverse().toString() + " ");
    	}

    	return sb.toString().trim();
    }
    
    public String reverseWords2(String s) 
    {
        char[] s1 = s.toCharArray();
        int i = 0;
        for(int j = 0; j < s1.length; j++)
        {
            if(s1[j] == ' ')
            {
                reverse(s1, i, j - 1);
                i = j + 1;
            }
        }
        reverse(s1, i, s1.length - 1);
        return new String(s1);
    }

    public void reverse(char[] s, int l, int r)
    {
    	while(l < r)
    	{
    		char temp = s[l];
    		s[l] = s[r];
    		s[r] = temp;
    		l++; r--;
    	}
    }
    
}
