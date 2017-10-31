package maximumlengthrepeatedsubarray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MaximumLengthRepeatedSubarray {

	public static void main (String[] args) {
		
		int[] a = {1,2,3,2,1};
		int[] b = {3,2,1,4,7};
		
		System.out.println(findLength1(a, b));
	}
	
    public static int findLength(int[] A, int[] B) {
        int result = 0;
        int[][] memo = new int[A.length + 1][B.length + 1];
        
        for (int i = A.length - 1; i >= 0; --i) {
            for (int j = B.length - 1; j >= 0; --j) {
                if (A[i] == B[j]) {
                    memo[i][j] = memo[i+1][j+1] + 1;
                    if (result < memo[i][j]) {
                    	result = memo[i][j];
                    }
                }
            }
        }
        return result;
    }
    
    public static int findLength1(int[] A, int[] B) {
        int result = 0;
        Map<Integer, ArrayList<Integer>> bStarts = new HashMap();
        
        for (int j = 0; j < B.length; j++) {
        	bStarts.computeIfAbsent(B[j], x -> new ArrayList()).add(j);
        }

        for (int i = 0; i < A.length; i++) 
        	if (bStarts.containsKey(A[i])) {
	            for (int j: bStarts.get(A[i])) {
	                int k = 0;
	                while (i+k < A.length && j+k < B.length && A[i+k] == B[j+k]) {
	                    k++;
	                }
	                result = Math.max(result, k);
	            }
        }
        return result;
    }
}
