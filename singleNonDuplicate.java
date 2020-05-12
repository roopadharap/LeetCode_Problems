public class Solution
{

//input example : int [] arr = {3,3,6};

  public int singleNonDuplicate(int[] nums) 
  {

          if(nums.length % 2 == 0)
              return -1;

          for(int i=0; i<nums.length-1; i=i+2)
          {
              if(nums[i] != nums[i+1])
                  return nums[i];
          }

          return nums[nums.length-1];
  }
}
