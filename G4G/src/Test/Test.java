package Test;

import java.math.BigInteger;
import java.security.Key;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    public static void main(String[] args) {
        int[][] res = new int[2][2];
        res[0][1] = 256;
        res[1][1] = 1;
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] ^= 256;
                res[i][j] ^= 256;
            }
        }

//        System.out.println(Integer.valueOf("696E73746167"));
//
//        String[] words = new String[] {"i", "love", "leetcode", "i", "love", "coding"};
//        int k = 2;
//
//        HashMap<String, Integer> hm = new HashMap<>();
//        for(String word: words){
//            hm.put(word, hm.getOrDefault(word,0)+1);
//        }

//        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
//                (a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue()
//        );
//
        LinkedHashMap<Integer, List<Integer>> lhm = new LinkedHashMap<>();
        for (List<Integer> ls2 : lhm.values()) {

        }
//        lhm.put(1,new ArrayList<Integer>(){{add(2);}});
        List<Integer> ls = new ArrayList<>();

//        ls.add(2);
//
//        ls.add(0,1);
//        //System.out.println(lhm.);
//
        Map<Integer, List<Integer>> tweetMap = new HashMap<Integer, List<Integer>>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashMap<String,Integer> hm2 = new HashMap<>();
        hm2.put("ded",2);

        HashSet<Integer> hs = new HashSet<>();
        hs.add(21);
        String s ="BSAB";
        StringBuilder sb = new StringBuilder();
        sb.append("ABSABS");
        sb.indexOf(s);

        int num1 = 1;
        int num2 = 4;


        Random rand = new Random();
        int a = rand.nextInt(2);
        System.out.println(a);

        PriorityQueue<Map.Entry<Integer,Integer>> pq33 = new PriorityQueue<>(
                (m1,m2)->m2.getValue()-m1.getValue());


        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] it1, int[] it2) {
                return tweetMap.get(it2[0]).get(it2[1]) - tweetMap.get(it1[0]).get(it1[1]);
            }
        });

        String order = "hlabcdefgijkmnopqrstuvwxyz";



    }


    public static String addStrings(String num1, String num2) {
        int index1 = num1.length()-1;
        int index2 = num2.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(index1>=0 || index2>=0){
            int sum=carry;
            if(index1>=0){
                sum+=num1.charAt(index1--)-'0';
            }
            if(index2>=0){
                sum+=num2.charAt(index2--)-'0';
            }
            carry = sum/10;
            sum=sum%10;
            sb.append(sum);
        }

        if(carry!=0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
