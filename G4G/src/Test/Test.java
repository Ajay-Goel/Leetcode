package Test;

import java.lang.reflect.Array;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        int b = 22;
        String a = String.valueOf(b);
        System.out.println(b);
        List<List<String>> ls = new ArrayList<>();
        int[] arr = new int[2];
        Arrays.fill(arr,1);
        arr[0]^=256;
        arr[0]^=256;
        arr[0]^=256;
        StringBuilder sb = new StringBuilder();
        sb.append('1');
        HashMap<String,TreeMap<Integer,String>> hm = new HashMap<>();
        TreeMap <Integer,String>tm = hm.get(1);
        HashSet<Character> hs = new HashSet<>();
        String ab ="wef";
        char [] c = ab.toCharArray();
        hs = new HashSet(Arrays.asList(c));
        //hs = new HashSet(Arrays.asList("ererg"));
        hs.add('a');
        List<Character> cd = new ArrayList<Character>();
        cd.add('a');
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashMap<Integer,Integer>hm2 = new HashMap<>();
        int test = 1;
        pq.add(test);
        hm2.put(1,test);

        test = 4;


        System.out.println(test);
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        boolean am = lhs.iterator().hasNext();
        System.out.println(am);
        Random rand = new Random();
        int[] aaa= {1};
        int[] bbb = Arrays.copyOf(aaa,aaa.length);
        
    }

}