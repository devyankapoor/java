package easyQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class TwoSum {
//time O(n)
//time O(n)
public int[] twoSum(int[] nums, int target) {
    // time complexity = O(n)
    Map<Integer,Integer> map = new HashMap();
    for(int i = 0;i<nums.length;i++){
        int curr = nums[i];
        int x = target - curr;
        if(map.containsKey(x)){
            return new int[] {map.get(x),i};
        }
        map.put(curr,i);
    }
    return null;
}

public static void main(String args[])
{
int[] nums = {2,7,11,15};
int target = 9;
TwoSum ts = new TwoSum();
int[] result= ts.twoSum(nums,target);
System.out.println(Arrays.toString(result));
}
}
