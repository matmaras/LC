package baseballgame;

import java.util.LinkedList;

public class BaseballGame {

	public static void main (String[] args) {
		
		String[] ops = {"36","28","70","65","C","+","33","-46","84","C"};
		System.out.println(calPoints(ops));
	}
	
    public static int calPoints1(String[] ops) {
        
    	Integer[] points = new Integer[ops.length];
    	Integer sum = 0;
    	int actionCounter = 0;
    	
    	for(int i = 0; i < ops.length; i++) {
    		if(ops[i].equals(String.valueOf("+"))) {
    			points[i-actionCounter] = points[i-1-actionCounter] + points[i-2-actionCounter];
    			sum += points[i-actionCounter];
    		}
    		else if(ops[i].equals(String.valueOf("D"))) {
    			points[i-actionCounter] = points[i-1-actionCounter] * 2;
    			sum += points[i-actionCounter];
    		}
    		else if(ops[i].equals(String.valueOf("C"))) {
    			sum -= points[i-1-actionCounter];
    			actionCounter += 2;
    		}
    		else {
    			sum += Integer.valueOf(ops[i]);
    			points[i-actionCounter] = Integer.valueOf(ops[i]);
    		}
    	}
    	
    	return sum;
    }
	
    public static int calPoints(String[] ops) {
            int sum = 0;
            LinkedList<Integer> list = new LinkedList<>();
            
            for (String operation : ops) {
                if (operation.equals("C")) {
                    sum -= list.removeLast();
                }
                else if (operation.equals("D")) {
                    list.add(list.peekLast() * 2);
                    sum += list.peekLast();
                }
                else if (operation.equals("+")) {
                    list.add(list.peekLast() + list.get(list.size() - 2));
                    sum += list.peekLast();
                }
                else {
                    list.add(Integer.parseInt(operation));
                    sum += list.peekLast();
                }
            }
            return sum;
    }
}
