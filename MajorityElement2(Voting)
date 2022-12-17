class Solution {
    public List<Integer> majorityElement(int[] nums) {
          

          Map<Integer,Integer> map=new LinkedHashMap<>();

          List<Integer> ans=new ArrayList<>();

          for(int val : nums)
          map.put(val,map.getOrDefault(val,0)+1);

          for(int key : map.keySet()){
              if(map.get(key)>Math.floor(nums.length/3))
              ans.add(key);
          }

          return ans;
    }
}
