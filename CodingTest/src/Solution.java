
class Solution {

	public static void main(String[] args) {
		//int[] arr = { 2,6,8,14 };
		// String s = "baabaa";
		System.out.println(solution(6));

	}

	public static long solution(int n) {
        long answer = 0;
        
        for(int i = 0; i<n/2+1;i++) {
        	// i:2의 개수, n-i*2:1의 개수
        	 long temp = 1;
        	for(int j = 0; j<(i>(n-i*2)?i:(n-i*2)); j++) {
        		temp *= n-i-j;
        		temp /= j+1;
        		System.out.println(temp);
        	}
        	answer += temp%1234567;
        }
        return answer%1234567;
    }
}
