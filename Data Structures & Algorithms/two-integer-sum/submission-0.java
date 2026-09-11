class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            int complex = target - nums[i];
            if(map.containsKey(complex)){
                return new int []{map.get(complex), i};
            }
            map.put(nums[i], i);
        }
        return new int []{};
    }
}
