package numbercomplement;

public class NumberComplement {

	public static void main (String[] args) {
		
		System.out.println(findComplement2(5));
	}
	
    public static int findComplement(int num) {
     
    	int result = 0;
    	char[] bits = Integer.toBinaryString(num).toCharArray();

    	for(int i = 0; i < bits.length; i++) {
    		if (bits[i] == '0') {
    			result += Math.pow(2, i);
    		}
    	}
    	
    	return result;
    }
    
    public static int findComplement1(int num) {
        
    	int result = 0;

    	char[] bits = Integer.toBinaryString(num).toCharArray();
    	int i = 0;
    	
    	for(char bit : bits) {
    		if (bit == '0') {
    			result += Math.pow(2, i);
    		}
    		i++;
    	}
    	
    	return result;
    }
    
    public static int findComplement2(int num) {
    	int result = 0;
    	int i = 0;

    	while(num != 0) {
    		if(num % 2 == 0) {
    			result += Math.pow(2, i);
    		}
    		num = num /2;
    		i++;
    	}
    	
    	return result;
    }
    
    public int findComplement3(int num) 
    {
        int i = 0;
        int j = 0;
        
        while (i < num)
        {
            i += Math.pow(2, j);
            j++;
        }
        
        return i - num;
    }
}
