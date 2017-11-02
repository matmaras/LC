package fizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

	public static void main (String[] args) {
		
		System.out.println(fizzBuzz2(15));
	}
	
    public static List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
        	
        	if(i%15 == 0) { 
        		output.add("FizzBuzz");
        	} else if(i%3 == 0) {
        		output.add("Fizz");
        	} else if(i%5 == 0) {
        		output.add("Buzz");
        	} else {
        		output.add(String.valueOf(i));
        	}
        }
        
        return output;
    }
    
    public static List<String> fizzBuzz2(int n) {
        String[] output = new String[n];
        
        for(int i = 1; i <= n; i++) {
        	if(i%3 == 0) output[i-1] = "Fizz";
        	if(i%5 == 0 && output[i-1] == null) {
        		output[i-1] = "Buzz";
        	} else if (i%5 == 0){
        		output[i-1] += "Buzz";
        	}
        	if (output[i-1] == null) output[i-1] = String.valueOf(i);
        }
        
        return Arrays.asList(output);
    }
}
