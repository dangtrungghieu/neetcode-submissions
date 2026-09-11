class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        HashSet <Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int i : set){
            if(!set.contains(i - 1)){
                int current = i;
                int count = 1;
                while(set.contains(current + 1)){
                    current++;
                    count++;
                }
                if(max < count){
                    max = count;
                }
            }
        }
        return max;
    }
}
