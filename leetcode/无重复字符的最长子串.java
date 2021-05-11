package leetcode;

public class 无重复字符的最长子串 {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring(""));
	}
	
	public static int lengthOfLongestSubstring(String s) {
		char[] ch = s.toCharArray();
		int l = ch.length;
		int res = 1;
		if(ch.length==0)return 1;
		for(int i=0;i<l;i++) {
			if(res > l-1-i) break;
			int t = 0;
			int[] arr = new int[26];
			for(int j=i;j<l;j++) {
				if(arr[ch[j]-'a']==1) {
					res = t>res?t:res;
					break;
				}else {
					arr[ch[j]-'a'] = 1;
					t++;
				}
				res = t>res?t:res;
			}
		}
		return res;
    }
}
