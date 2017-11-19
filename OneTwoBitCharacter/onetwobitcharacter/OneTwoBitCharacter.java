package onetwobitcharacter;

public class OneTwoBitCharacter {

	public static void main (String[] args) {
		int[] bits = new int[]{1,1,1,0};
		System.out.println(isOneBitCharacter(bits));
	}
	
    public static boolean isOneBitCharacter(int[] bits) {
        
    	int lenght = bits.length;
    	
    	for(int i = 0; i < lenght; i++) {
    		if(bits[i] == 1) {
    			i++;
    		} else if (i+1 == lenght) {
    			return true;
    		}
    	}
    	
    	return false;
    }
    
    public static boolean isOneBitCharacter2(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }
    
    public static boolean isOneBitCharacter1(int[] bits) {
        int n = bits.length, i = 0;
        while (i < n - 1) {
            if (bits[i] == 0) {
            	i++;
            } else {
            	i += 2;
            }
        }
        return i == n - 1;
    }
}
