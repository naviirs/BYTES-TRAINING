class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        
        Map<Integer,Integer> map=new HashMap<>();
        int pairs=0;
        
    
        
        for(int i=0;i<n;i++){
            
            if(map.containsKey(k-arr[i]))
            pairs+=map.get(k-arr[i]);
            
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            
        }
        
        return pairs;
    }
}
