package movezeroes;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MoveZeroes {

	public static void main (String[] args) {
		
		int[] nums = new int[] {0, 1, 0, 3, 12};
		moveZeroes4(nums);
		System.out.println(nums.toString());
	}
	
    public static void moveZeroes4(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        
        return;
    }
	
    public static void moveZeroes3(int[] nums) {
    	if(nums == null || nums.length == 0 || nums.length == 1) return;
    	
    	int pos = 0;
    	for(int num : nums) {
    		if (num != 0) {
    			nums[pos++] = num;
    		}
    	}
    	
    	while(pos < nums.length) {
    		nums[pos++] = 0;
    	}
    	
    	return;
    }
	
	public static void swap(int[] nums, int first, int second) {
		if(second >= nums.length) return;
		
		if(nums[second] != 0) {
			nums[first] = nums[second];
			nums[second] = 0;
		} else {
			swap(nums, first, second+1);
		}
	}
	
    public static void moveZeroes(int[] nums) {
    	if(nums == null || nums.length == 0 || nums.length == 1) return;
    	
    	for(int i = 0 ; i < nums.length; i++) {
    		if(nums[i] == 0) {
    			swap(nums, i, i+1);
    		}
    	}
    	return;
    }
    
    public static void moveZeroes1(int[] nums) {
    	if(nums == null || nums.length == 0 || nums.length == 1) return;
    	
    	for(int i = 0 ; i < nums.length; i++) {
    		if(nums[i] == 0) {
    	    	int j = 0;
    			while(nums[i+j] == 0) {
    				j++;
    				if(i+j == nums.length) {
    					return;
    				}
    			}
				nums[i] = nums[i+j];
				nums[i+j] = 0;
    		}
    	}
    	return;
    }
    
    public static void moveZeroes2(int[] nums) {
    	if(nums == null || nums.length == 0 || nums.length == 1) return;
    	
    	List<Integer> list =  Arrays.stream(nums).boxed().collect(Collectors.toList());
    	int zeroCounter = 0;
    	
		Iterator<Integer> listIt = list.iterator();
		while (listIt.hasNext()) {
			if(listIt.next() == 0) {
				listIt.remove();
				zeroCounter++;
			}
		}
    	
//		for (int i = 0; i < list.size(); i++) {
//			if(list.get(i) == 0) {
//				list.remove(i);
//				zeroCounter++;
//			}
//		}
		
		while(zeroCounter != 0) {
			list.add(0);
			zeroCounter--;
		}
		
    	return;
    }
}
