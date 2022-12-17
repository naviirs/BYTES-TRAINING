class Solution {
    public void sortColors(int[] nums) {
        
        int[] map=new int[3];

        for(int i : nums)
        map[i]++;

        int k=0;

        for(int i=0;i<3;i++){
           
           for(int j=1;j<=map[i];j++)
           nums[k++]=i;

        }

    }
}
