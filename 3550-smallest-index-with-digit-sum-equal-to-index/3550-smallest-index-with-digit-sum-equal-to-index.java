class Solution {
    public int smallestIndex(int[] nums) {
        int small= nums.length;
        for(int i=0;i<nums.length;i++)
        {
            int rem, sum =0;
            int rev = nums[i];
            while(rev>0)
            {
                rem = rev%10;
                rev = rev/10;
                sum += rem;
            }
            if(sum == i)
            {
                small = Math.min(small, i);
            }
        }
        if(small == nums.length)
        {
            return -1;
        }
        else{
            return small;
        }
    }
}