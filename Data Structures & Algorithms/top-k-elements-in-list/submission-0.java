class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            } else{
                map.put(num, 1);
            }
        }
        int res[] = new int[k];
        Queue<Integer> queue = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for (int key: map.keySet()){
            queue.add(key);
            if(queue.size()>k){
                queue.poll();
            }
        }

        while(k-- > 0)
            res[k] = queue.poll();

        return res;
    }
}
