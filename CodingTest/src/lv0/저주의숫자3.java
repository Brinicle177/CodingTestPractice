package lv0;

public class 저주의숫자3 {

	public static void main(String[] args) {
		System.out.println(solution(100));
	}

	public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
        	answer++;
        	while(answer%3==0||answer%10==3||answer/10==3||answer/10%10==3||answer/100==3)
        		answer++;
        	System.out.println(answer);
        }
        return answer;
    }
}
