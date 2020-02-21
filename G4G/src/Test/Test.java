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


    }

}