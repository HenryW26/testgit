package ByteDance;

import java.util.*;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        if(strs == null||strs.length == 0){
            return "";
        }
        List<String>list = new ArrayList<>(Arrays.asList(strs));
        /*按字符串长度对字符串数组排序*/
        Collections.sort(list,(String s1,String s2)->(s1.length()-s2.length()));
        String shortest = list.get(0);
        int col = shortest.length();
        int row = strs.length;
        for(int i=0;i<col;i++){
            char c = shortest.charAt(i);
            for(int j=1;j<row;j++){
                if(list.get(j).charAt(i)!=c){
                    return shortest.substring(0,i);
                }
            }
        }
        return shortest;
    }

    public static void main(String[] args) {
        String[] strs = {"abc","dsds","cb","b"};
        List<String>list = new ArrayList<>(Arrays.asList(strs));
        Collections.sort(list,(String s1,String s2)->(s1.length()-s2.length()));
//        Collections.sort(list,new SortByLengthComparator());
        System.out.println(list);
    }
}

//class SortByLengthComparator implements Comparator<String>{
//    @Override
//    public int compare(String s1,String s2){
//        return s1.length()-s2.length();
//    }
//}

