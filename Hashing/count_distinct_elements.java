// It is same as "print_non_repeated_elements.java"
package Hashing;
import java.util.*;
public class count_distinct_elements {
    static ArrayList<Integer> distinct(int[] arr, int n) {
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
        for(int i = 0; i<n; i++) {
            if(hm.isEmpty() == true || hm.containsKey(arr[i]) == false) {
                hm.put(arr[i], 1);
            }else {
                hm.put(arr[i], hm.get(arr[i])+1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e : hm.entrySet()) {
            if(e.getValue() == 1)
                ans.add(e.getKey());
        }
        return ans;
    }
}
