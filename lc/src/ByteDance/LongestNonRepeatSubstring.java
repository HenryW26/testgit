package ByteDance;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatSubstring {
    /**
     * brute force*/
/*    public static int lengthOfLongestSubstring(String str){
        int n = str.length();
        int r = 0;
        int ans=0;
        for(int i=0;i<n;i++){
            Set<Character> set = new HashSet<>();
            r=i;
            while((r<n)&&!set.contains(str.charAt(r))){
                set.add(str.charAt(r));
                r = r+1;
            }
            ans = Math.max(ans,r-i);
        }
        return  ans;
    }*/
    /**
     * after optimizing*/
    public static int lengthOfLongestSubstring(String str){
        int n = str.length();
        int r = 0;
        int ans=0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(i!=0) {
                set.remove(str.charAt(i - 1));
            }
            while((r<n)&&!set.contains(str.charAt(r))){
                set.add(str.charAt(r));
                r = r+1;
            }
            ans = Math.max(ans,r-i);
        }
        return  ans;
    }

    public static void main(String[] args) {
        String str = "abcbabac";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
