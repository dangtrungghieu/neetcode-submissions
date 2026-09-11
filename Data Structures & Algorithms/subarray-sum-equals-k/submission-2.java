class Solution {
    public int subarraySum(int[] nums, int k) {
        // nums = [1,2,3,4], k = 7
        // left = [0,1,3,6,10]
        // 0 -> 0 - 7 = -7
        // 1 -> 1 - 7 = - 6 =>
        // 3 -> 3 - 7 = - 4
        // 6 -> 6 - 7 = -1
        // 10 -> 10 - 7 = 3 => count++
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int left = 0;
        map.put(0,1);
        for(int i = 0;i < nums.length; i++){
            left = left + nums[i];
            int current = left - k;
            if(map.containsKey(current)){
                count = count + map.get(current);
            }
            map.put(left, map.getOrDefault(left, 0) + 1);
        }
        return count;
    }
}