package maxconsecutiveones;

public class MaxConsecutiveOnes {

	public static void main (String[] args) {
		
		int[] nums = new int[] {1,1,0,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}
	
    public static int findMaxConsecutiveOnes(int[] nums) {
        
    	int result = 0;
    	int counter = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		if(nums[i] == 1) {
    			counter += 1;
    		} else {
    			if(counter > result) {
    				result = counter;
    			}
    			counter = 0;
    		}
    	}
    	
    	return result > counter ? result : counter;
    }
    
    public int findMaxConsecutiveOnes2(int[] nums) {
        int maxHere = 0, max = 0;
        for (int n : nums)
            max = Math.max(max, maxHere = n == 0 ? 0 : maxHere + 1);
        return max; 
    }
}
