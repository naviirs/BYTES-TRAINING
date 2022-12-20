class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_len = 0;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)) && start <= map.get(s.charAt(i))){
             start = map.get(s.charAt(i)) + 1;
            } else{
               max_len = Math.max(max_len, i-start+1);
            }
            map.put(s.charAt(i), i);
        }
        return max_len;
    }
}
Console
