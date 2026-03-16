
import java.util.Arrays;


/*
    Leetcode problem no : 283

*/


public class MoveZeroes {
    
    public static void main(String[] args){
        
        int[] nums={0}; //Move all zeroes to the end of the array -{1, 3, 12, 0, 0}
        
        
        moveZeroes(nums);
        
    }
    
    private static void moveZeroes(int[] nums){
        int endIndex=nums.length-1;
        
        for(int i=0; i<nums.length && i < endIndex ; i++){
            if(nums[i]==0){
                swap(nums, i, endIndex);
                endIndex--;
            }
        }
        
        System.out.println(Arrays.toString(nums));
    }
    

    private static void swap(int[] nums, int i, int endIndex) {
       int temp=nums[i];
       nums[i]=nums[endIndex];
       nums[endIndex]=temp;
    }
    
}
