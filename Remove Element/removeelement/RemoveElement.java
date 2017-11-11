package removeelement;

public class RemoveElement {

	public static void main (String[] args) {
		
		int[] nums = new int[] {3,2,3,2,1};
		System.out.println(removeElement2(nums, 3));
	}
	
	public static int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return j;
    }
	
	public static int removeElement1(int[] nums, int val) {
    	int pos = 0;
    	for(int num : nums) {
    		if (num != val) {
    			nums[pos++] = num;
            }
    	}
        return pos;
    }
	
	public static int removeElement2(int[] nums, int val) {
	    int i = 0;
	    int n = nums.length;
	    while (i < n) {
	        if (nums[i] == val) {
	            nums[i] = nums[n - 1];
	            n--;
	        } else {
	            i++;
	        }
	    }
	    return n;
	}
}
