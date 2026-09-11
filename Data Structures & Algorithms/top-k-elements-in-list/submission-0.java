class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        PriorityQueue<int []> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for(int i : map.keySet()){
            queue.add(new int []{i, map.get(i)});
            if (queue.size() > k) {
                queue.poll();
            }
        }
        int [] result = new int [k];
        for(int i = 0;i < k;i++){
            result[i] = (int)queue.poll()[0];
        }
        return result;
    }
}
