class Solution {
    public int climbStairs(int n) {
        int a=1, b=0;
        int res=1;
        for(int i=0; i<n; i++)
        {
            a = res;
            res = a+b;
            b = a;
        }
        return res;
    }
}