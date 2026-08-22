class Solution {
    public boolean checkDivisibility(int n) {
        boolean status = false;
        int sum=0, prod=1, digit, div;
        int n1 = n;
        while(n>0)
        {
            digit = n%10;
            sum += digit;
            prod *= digit;
            n = n/10;
        }
        div = sum+prod;
        if(n1%div == 0)
        {
            status = true;
            return status;
        }
        return status;
    }
}