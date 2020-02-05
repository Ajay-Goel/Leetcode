package Test;

import java.lang.reflect.Array;
import java.util.*;

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
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(2);

        System.out.println("******");
        System.out.println(790/26);
        System.out.println(790%26);
        char s = '4';
        StringBuilder sb = new StringBuilder();

        //System.out.println(Character.s);
        Map<Integer, List<Integer>> tweetMap = new HashMap<Integer, List<Integer>>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashMap<String,Integer> hm2 = new HashMap<>();
        hm2.put("ded",2);

        HashSet<Integer> hs = new HashSet<>();
        hs.add(21);
        String s33 ="BSAB";
        
        //StringBuilder sb = new StringBuilder();
        sb.append("ABSABS");
      //  sb.indexOf(s);

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

        int[] arr = new int[1];
        arr[0]=1;
        System.out.println(Arrays.toString(arr));
        StringBuilder sb33 = new StringBuilder();
        String eer = sb33.toString().toUpperCase();
        System.out.println(Arrays.toString(ls.toArray()));
        int ch = 121;
        String chs = String.valueOf(121);


        List<List<String>> ls44 = new ArrayList<List<String>>();
        HashMap<String,List<String>> hm44 = new HashMap<>();
        hm44.putIfAbsent("d",new ArrayList<String>());
        hm44.get("d").add("dd");

//        hm44.putAll((Map<? extends String, ? extends List<String>>) hm.values());
        char [] rr= new char []{'d','e'};
        String arre = Arrays.toString(rr);
        System.out.println(arre +"kdjfv");
        double  r=  2.33;
        if(r==(int)r){
           System.out.println("yes");
        }
        System.out.println((37296.0*37296.0)+54001*54001);

        int three_sum=0;
        int common =0;
        for(int i=100;i<=999;i++){
            if(i%3==0 && i%4==0){
                common++;
            }
            else if(i%3==0 || i%4==0)
                three_sum++;
        }
        System.out.println(three_sum);
        System.out.println(common);
        String[] res444 = {"a","ab","ba","a"};
        String word = "ba";

        for(int i=0;i<word.length();i++){
            System.out.println(word.substring(i-1));
            //for(int j=0;j<word.length();j++){
            //    System.out.println(word.substring(i,i+j));
            //}
        }
        Arrays.sort(res444);
        System.out.println(Arrays.toString(res444));



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
