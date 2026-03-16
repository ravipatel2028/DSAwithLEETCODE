
import java.util.Arrays;
import java.util.HashMap;

/*
    Leetcode problem number - 1.
    Given an array of integers nums and an integer target , return indices , return indices of the two numbers such that they add upto target.
    ex :
        nums=[2, 7, 11, 15], target=9
    output :
        [0, 1]


    ex :
        nums=[3, 2, 4], target=6
    output :
        [1, 2]    

*/
public class TwoSum {
    public static void main(String[] args){
        int[] nums={2, 7, 11, 15};
        int target=9;
        
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    
    private static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> sums=new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            int val=target-nums[i];
            if(sums.containsKey(val)){
                return new int[]{sums.get(val), i};
            }
            sums.put(nums[i], i);
        }
        
        return new int[]{-1, -1};
    }
}
