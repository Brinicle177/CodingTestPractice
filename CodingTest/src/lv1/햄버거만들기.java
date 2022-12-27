package lv1;

import java.util.Stack;

public class 햄버거만들기 {

	public static void main(String[] args) {
		int[] arr = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		System.out.println(solution(arr));

	}
	
	public static int solution(int[] ingredient) {
		int answer = 0;
		boolean first1 = false;
		Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<ingredient.length; i++) {
        	if(!first1 && ingredient[i]==1)
        		first1 = true;
        	if(first1)
        		stack.add(ingredient[i]);
        	int stackSize = stack.size();
        	if(stackSize>3&&stack.get(stackSize-1)==1&&stack.get(stackSize-2)==3&&stack.get(stackSize-3)==2&&stack.get(stackSize-4)==1) {
        		answer++;
        		stack.pop();
        		stack.pop();
        		stack.pop();
        		stack.pop();
        	}
//        	System.out.println(stack.toString());
        }
        return answer;
    }

}

/*
int answer = 0;
int answered = 0;
String props = "";
for(int i = 0; i < ingredient.length; i++)
	props += ingredient[i];

do {
	answered = answer;
	String[] temp = props.split("1231", 2);
	if(temp.length == 2) {
		answer++;
		props = temp[0] + temp[1];
	}
	
} while (answer != answered);

return answer;
*/