class Solution {
    int res = 0;
    public int sumFourDivisors(int[] nums) {
        for(int n : nums)
            helper(n);
        
        return res;
    }
    
    public void helper(int n){
        int cnt = 0, sum = 0;
        for(int i = 1; i * i <= n && cnt < 5; i++){
            if(n % i == 0){
                cnt += 2;
                sum += i;
                if(n / i == i){
                    cnt--;
                }else{
                    sum += (n / i);
                }
            }
        }
        if(cnt == 4){
            res += sum;
        }
        return;
    }
}
