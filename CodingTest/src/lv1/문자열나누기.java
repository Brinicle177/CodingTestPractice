package lv1;

public class 문자열나누기 {

	public static void main(String[] args) {
		System.out.println(solution("banana"));
	}

	public static int solution(String s) {
		int answer = 0;

		while (s.length()>1) {
			int x = 1, y = 0;
			for (int i = 1; i < s.length(); i++) {
				if (s.charAt(0) == s.charAt(i))
					x++;
				else
					y++;
				
				if (x == y) {
					answer++;
					s = s.substring(i + 1);
					break;
				} else if (i == s.length() - 1) {
					answer++;
					s = "";
					break;
				}
			}
		}

		return s.length()>0?answer+1:answer;

	}

}
