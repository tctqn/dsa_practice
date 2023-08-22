package dsaleetcode.easy;

/*
 * Requirements:  Given two strings needle and haystack, 
 * return the index of the first occurrence of needle in haystack, 
 * or -1 if needle is not part of haystack.
 * 
 * Example: haystack = "sadbutsad", needle = "sad"  --> 0
 * 			haystack = "leetcode", needle = "leeto" --> -1
 */

public class IndexOfFirstOccurrenceString {
	public static int strStr(String haystack, String needle) {
		if(needle.length()>haystack.length()) return -1;
		if (haystack.contains(needle)) {
			return haystack.indexOf(needle);
		}
		return -1;
	}

	public static void main(String[] args) {
		String haystack = "sadbutsad";
		String needle = "sad";
		System.out.println(strStr(haystack, needle));
	}
}
