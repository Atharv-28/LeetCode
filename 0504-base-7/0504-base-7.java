class Solution {
    public String convertToBase7(int num) {
        int neg = 0;
        if(num<0)
        {
            neg=1;
            num = num- (num*2);
        }
        if(num==0)
            return "0";
        Stack<Integer> stack7 = new Stack<>();
        int rem =num, res=num;
        int i=0;
        while(res!=0)
        {
            rem = res% 7;
            res = res/7;
            stack7.push(rem);
            i++;
        }
        StringBuilder ans = new StringBuilder(i);
        i=0;
        if(neg==1)
        {
            ans.insert(i,"-");
            i++;
        }
        while(!stack7.isEmpty())
        {
            ans.insert(i, stack7.pop());
            i++;
        }
        return ans.toString();
    }
}