class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length; // 4
        int m = 2 * n; // 8 -> 4 5 6 7
        int [] ans = new int [m];
        for(int i = 0 ;i < m;i++){
            if(i < n){
                ans[i] = nums[i];
            } else{
                ans[i] = nums[i - n];
            }
        }
        return ans;
    }
}