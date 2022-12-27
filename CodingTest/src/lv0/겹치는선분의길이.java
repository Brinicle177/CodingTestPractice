package lv0;

import java.util.HashSet;

public class 겹치는선분의길이 {

	public static void main(String[] args) {
		int[][] arr = {{0,5},{3,9},{1,10}};
		solution(arr);

	}
	
	public static int solution(int[][] lines) {
        int answer = 0;
        HashSet<Integer> temp = new HashSet<>();
        
        for(int i = 0; i < lines.length; i++)
        	for(int j = lines[i][0]; j < lines[i][1]; j++)
        		if(temp.contains(j)) {
        			answer++;
        			temp.remove(j);
        		} else
        			temp.add(j);
        
        return answer;
    }

}
