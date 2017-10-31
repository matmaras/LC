package longestcommonprefix;

public class LongestCommonPrefix {

	public static void main (String[] args) {
		
		String[] strs = {"aaaaqwe", "", "aaaahjk"};
		System.out.println(longestCommonPrefix3(strs));
	}
	
    public static String longestCommonPrefix(String[] strs) {
    	if(strs.length == 0) {
    		return "";
    	}
    	
    	String longestCommonPrefix = strs[0];
    	
		for(int i = 1; i < strs.length; i++) {
			if(strs[i].startsWith(longestCommonPrefix)) {
				continue;
			} else {
				longestCommonPrefix = longestCommonPrefix.substring(0, longestCommonPrefix.length() - 1);
				if (longestCommonPrefix.isEmpty()) return "";
				i = 0;
			}
		}
		
		return longestCommonPrefix;
    }
    
    public static String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) {
        	return "";
        }
        
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }        
        return prefix;
    }
    
    public static String longestCommonPrefix3(String[] strs) {
    	if(strs.length == 0) {
    		return "";
    	}
    	
    	String longestCommonPrefix = strs[0];
    	
		for(int i = 1; i < strs.length; i++) {
			
			while(!strs[i].startsWith(longestCommonPrefix))
			{
				longestCommonPrefix = longestCommonPrefix.substring(0, longestCommonPrefix.length() - 1);
				if (longestCommonPrefix.isEmpty()) {
					return "";
				}
			}
		}
		
		return longestCommonPrefix;
    }
}
