class Solution {
    public int totalNumbers(int[] digits) {
        int count =0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<digits.length;i++)
        {
            for(int j=0; j<digits.length; j++)
            {
                for(int k=0; k<digits.length; k++)
                {
                    if(i==j || j==k || i==k)
                    {
                        continue;
                    }
                    else{
                        int num = digits[i]*100;
                        num = num+ digits[j]*10;
                        num = num+ digits[k];

                        if(num%2 == 0 && num>99)
                        {
                            if(set.contains(num))
                            {
                                continue;
                            }
                            else{
                                set.add(num);
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}