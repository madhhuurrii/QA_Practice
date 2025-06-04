package code.BrowserSatck20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class alldupli {
  public static void main(String[] args) {
    
  
   int []nums={1,2,3,2,1,6,7,8,5,6,7};
        List<Integer> a=new ArrayList();
        HashMap <Integer,Integer> h= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i],h.get(nums[i])+1);
            }
            else{
                h.put(nums[i],1);
            }
        }
        for(Object c:h.keySet()){
            if(h.get(c)==2){
                int z=(int)c;
                a.add(z);
            }
        }
        System.out.println(a);
    }
}

