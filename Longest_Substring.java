package Leetcode;

import java.util.HashMap;

public class Longest_Substring {

    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        for(int i = 0, j = 0; i < s.length(); ++i){
            if(map.containsKey(s.charAt(i))){
                j = Math.max(j, map.get(s.charAt(i))+1);
            }
            max = Math.max(max,i-j+1);
            map.put(s.charAt(i),i);
            System.out.println(j);
        }
        return max;
    }

    public static void main(String []args){
        Longest_Substring result = new Longest_Substring();
        String test = "abcabf";
        System.out.println(result.lengthOfLongestSubstring(test));
    }
}
