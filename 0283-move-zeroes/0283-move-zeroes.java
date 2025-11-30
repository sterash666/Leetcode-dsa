class Solution {
    public void moveZeroes(int[] nums) {
        int writePos = 0; // next slot for a non-zero
        for (int readPos = 0; readPos < nums.length; readPos++) {
            if (nums[readPos] != 0) {
                if (readPos != writePos) {
                    int tmp = nums[readPos];
                    nums[readPos] = nums[writePos];
                    nums[writePos] = tmp;
                }
                writePos++;
            }
        }
    }
}