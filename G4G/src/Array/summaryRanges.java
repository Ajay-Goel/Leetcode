package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class summaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> ls = new ArrayList<>();
        if(nums.length==0) return ls;
        int prev = nums[0];
        StringBuilder sb = new StringBuilder();
        sb.append(prev);
        for(int i=0;i<nums.length;i++){
            if(prev+1==nums[i]){
                prev++;
            }
            else{
                if(sb.charAt(sb.length()-1)!=(char)prev){
                    sb.append("-");
                    sb.append(">");
                    sb.append(prev);
                }
                ls.add(sb.toString());
                sb=new StringBuilder();
                prev=nums[i];
                sb.append(prev);
            }
        }
        return ls;
    }
    public static void main(String args[]){
        summaryRanges sr = new summaryRanges();
        int[] arr = {0,1,2,4,5,7};
        List<String>ls = sr.summaryRanges(arr);
        System.out.println(ls);
    }
}
