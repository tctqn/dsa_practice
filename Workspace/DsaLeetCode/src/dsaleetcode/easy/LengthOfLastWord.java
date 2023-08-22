package dsaleetcode.easy;

public class LengthOfLastWord {
	public static int lengthOfLastWord(String s) {
		int res = 0;
		for (int i = s.length()-1; i >= 0; i--) {
			if (s.charAt(i) != ' ')
				res++;
			else if (s.charAt(i) == ' ' && res == 0) {
				continue;
			} else break;
		}
		return res;
	}

	public static void main(String[] args) {
		String s = "   flymoon";
		System.out.println(lengthOfLastWord(s));
	}
}
