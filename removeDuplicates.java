class Solution {
    public int removeDuplicates(int[] nums) {
        
        int l=nums.length,prev=nums[0],count=0;

        for(int i=1;i<l;i++){
            
            if(prev==nums[i])
            nums[i]=101;

            else
            prev=nums[i];
        }

        for(int i=0,j=0;i<l && j<l;i++,j++){

            if(nums[i]!=101)continue;
            for(;j<l;j++){

                if(nums[j]!=101){
                    nums[i]=nums[j];
                    nums[j]=101;
                    break;
                }
            }
        }

        for(int i=0;i<l;i++){
            if(nums[i]!=101)count++;
            else break;
        }
        
        return count;

    }
}
