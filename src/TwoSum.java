/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].



 */




import java.util.Hashtable;


public class TwoSum {

    public int[] twosum(int[] nums, int target){

        Hashtable hash=new Hashtable();
        int[] answer=new int[2];

        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(nums[i])){
                //return number
                answer[0]=(int)hash.get(nums[i]);
                answer[1]=i;
                break;

            }
            else{
                hash.put(target-nums[i],i);
            }
        }
        return answer;

    }

}
