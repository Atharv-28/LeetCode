class Solution {
    public int missingNumber(int[] nums) {
        int sum=0, miss, max=0;
        int len = nums.length;
        for(int i=0; i<len; i++)
        {
            sum = sum+nums[i];
            max = max + i;
        }
        max = max + len;
        miss = max - sum;
        return miss;
    }
}