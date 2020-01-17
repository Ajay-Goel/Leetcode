package Test;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String [] args){
        int [][] res = new int[2][2];
        res[0][1]=256;
        res[1][1]=1;
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                res[i][j]^=256;
                res[i][j]^=256;
            }
        }

        System.out.println(Integer.valueOf("696E73746167"));

        String[] words = new String[] {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;

        HashMap<String, Integer> hm = new HashMap<>();
        for(String word: words){
            hm.put(word, hm.getOrDefault(word,0)+1);
        }

//        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
//                (a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue()
//        );

    }
}
