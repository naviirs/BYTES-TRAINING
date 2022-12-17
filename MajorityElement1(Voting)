class Solution {
    public int majorityElement(int[] nums) {
         
         int total=1,max=nums[0];

         for(int i=1;i<nums.length;i++){

             if(nums[i]==max)
             total++;

             else
             total--;

             if(total<0){
                 max=nums[i];
                 total=1;
             }
         }

         return max;
    }
}
