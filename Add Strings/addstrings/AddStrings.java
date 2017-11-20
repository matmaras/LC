package addstrings;

public class AddStrings {

	public static void main (String[] args) {
		String num1 = "584";
		String num2 = "18";
		System.out.println(addStrings(num1, num2));
	}
	
    public static String addStrings1(String num1, String num2) {
        int l1 = num1.length() - 1;
        int l2 = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        
        while(l1 >= 0|| l2 >= 0 || carry == 1){
            int a = l1 <= -1 ? 0 : num1.charAt(l1--) - '0';
            int b = l2 <= -1 ? 0 : num2.charAt(l2--) - '0';
            int c = a + b + carry;
            carry = c/10;
            sb.append(c%10);
        }
        
        return sb.reverse().toString();
    }
	
	public static String addStrings(String num1, String num2) {
		int num1Lenght = num1.length() - 1;
		int num2Lenght = num2.length() - 1;
		StringBuilder sb = null;
		
		if(num1Lenght > num2Lenght) {
			sb = sum(num1, num2, num1Lenght, num2Lenght);
			
		} else {
			sb = sum(num2, num1, num2Lenght, num1Lenght);
		}
		
		return sb.reverse().toString();
    }

	private static StringBuilder sum(String numBigger, String numSmaller, int biggerLenght, int smallerLenght) {
		Integer sum = 0;
		int memory = 0;
		StringBuilder sb = new StringBuilder();
		
		while(smallerLenght >= 0) {
			sum = numBigger.charAt(biggerLenght)-'0' + numSmaller.charAt(smallerLenght)-'0' + memory;
			if(sum >= 10) {
				sb.append(sum %10);
				memory = 1;
			} else {
				sb.append(sum);
				memory = 0;
			}
			biggerLenght--;
			smallerLenght--;
		}
		
		if(memory != 0 && biggerLenght < 0) {
			sb.append(memory);
			return sb;
		}
		
		while(biggerLenght >= 0) {
			sum = numBigger.charAt(biggerLenght)-'0' + memory;
			if(sum >= 10) {
				sb.append((sum) %10);
				memory = 1;
			} else {
				sb.append(sum);
				memory = 0;
			}
			biggerLenght--;
		}
		
		if(memory != 0) {
			sb.append(memory);
			return sb;
		}
		
		return sb;
	}
}
