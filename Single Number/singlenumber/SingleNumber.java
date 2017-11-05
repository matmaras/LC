package singlenumber;

import java.util.Arrays;

public class SingleNumber {

	public static void main (String[] args) {
		
		int[] nums = new int[] {1, 1, 2, 3, 3};
		
		System.out.println(singleNumber(nums));
	}
	
    public static int singleNumber(int[] nums) {
        
    	Arrays.sort(nums);
    	
    	for(int i = 0; i <= nums.length - 2; i = i + 2) {
    		if(nums[i] + (-1 * nums[i+1]) != 0) {
    			return nums[i];
    		}
    	}
    	
    	return nums[nums.length - 1];
    }
    
    public static int singleNumber1(int[] nums) {
        
        int result = 0;
        
        int len = nums.length;
        for(int i = 0; i < len; i++) {
        	result ^= nums[i];
        }
        
        return result;
    }
}
