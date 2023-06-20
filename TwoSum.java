/*
 * time Complexity: O(n)
 * Space complexity: O(n)
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class TwoSum { 

    public static void main(String args[]) {
        int nums[] = {2,7,11,15};
        int target = 9;
        TwoSum obj = new TwoSum();
        int ans[] = obj.twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < nums.length; i++){
            int remains = target - nums[i];
            if(map.containsKey(remains)){
                return new int[] {i, map.get(remains)};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }


    
}
