package dsaleetcode.easy;

/*
 * Find the element has minimum length
 * Check whether it is prefix
 *  - YES -> prefix
 *  - NO  -> Cut the last character off
 */

public class LongestCommonPrefix {
	public static String miniLength(String[] strs) {
        String minString = strs[0];
        for(int i=0;i<strs.length;i++) {
        	if(minString.length()>strs[i].length()) {
        		minString = strs[i];
        	}
        }
        return minString;
    }
	public static String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length==0) return "";
		String prefix = miniLength(strs);
		for(int i=0;i<strs.length;i++) {
			while(!strs[i].startsWith(prefix)) {
				prefix = prefix.substring(0,prefix.length()-1);
				if(prefix.isEmpty()) return "";
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
		String[] s = {"flower","flight","flow"};
		System.out.println(miniLength(s));
		System.out.println(longestCommonPrefix(s));
	}
}
