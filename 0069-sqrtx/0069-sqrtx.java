class Solution {
    public int mySqrt(int x) {
        int res =0;
        int i=1;
        while(x>0 && x>=i)
        {
            x-=i;
            i+=2;
            res +=1;
        }
        return res;
    }
}