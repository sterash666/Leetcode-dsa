class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
       
       PriorityQueue<Integer> pq=new PriorityQueue();
       for(int a:nums){
        pq.add(a);
       }
       while(k>0){
        pq.offer(pq.poll()*-1);
        k--;
       }
       int sum=0;
       for(int l: pq){
        sum+=l;
       }
       return sum;
    }
}