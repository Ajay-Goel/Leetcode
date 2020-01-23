package Test;

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

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
        LinkedHashMap<Integer,List<Integer>> lhm = new LinkedHashMap<>();
        for(List<Integer> ls2: lhm.values()){

        }
//        lhm.put(1,new ArrayList<Integer>(){{add(2);}});
        List<Integer> ls = new ArrayList<>();
//        ls.add(2);
//
//        ls.add(0,1);
//        //System.out.println(lhm.);
//
//        Map<Integer, List<Integer>> tweetMap = new HashMap<Integer, List<Integer>>();
//
//        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
//            public int compare(int[] it1, int[] it2) {
//                return tweetMap.get(it2[0]).get(it2[1]) - tweetMap.get(it1[0]).get(it1[1]);
//            }
//        });

        //pq.add(new int[] { 1, ls.size() - 1 });
//        ls.add(1);
//        int index = ls.indexOf(1);
//
//        String w ="wefwe";
//        w.trim();
//        int num =1;
//        if(Character.isDigit('2')){
//            char a ='2';
//        }
//        Arrays.sort(w.toCharArray());
//        String sb = w.toString();
//        System.out.println(w);
        List<Integer> ls2 = new ArrayList<>();
//        ls2.add("word");
//        if(ls2.contains("*wo")){
//            System.out.println("Yes");
//        }

        //int [] ls4 = ls2;

        char[] arr = new char[2];
      // arr[0]='a';
        //arr[1]=1;
//        arr[2]=2;
        StringBuilder sb = new StringBuilder("sdcdsc");

//        sb.setCharAt(sb.length(),sb.charAt(0));
//        sb.deleteCharAt(0);
//        String a ="vsfv";
        int f= 9933;
        char [] ch= Integer.toString(f).toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='6'){
                ch[i]='9';
                break;
            }
        }
        int ans = Integer.parseInt(ch.toString());
        String a ="123";
        String b ="456";
        //BigInteger c = Math.BigInteger.valueOf(Long.parseLong(a)) BigInteger.valueOf(Long.parseLong(b));
       // String cc= String.valueOf(c);
    }
}
