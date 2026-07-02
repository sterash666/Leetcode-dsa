class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer>ar=new HashSet<>();
        for(int y:nums){
            ar.add(y);
        }
        for(int i=0;i<=ar.size();i++){
            if(!ar.contains(i))return i;
        }
        return 0;
    }
}