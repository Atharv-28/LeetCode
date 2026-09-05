class Solution {
    public int lengthOfLastWord(String s) {
        
        int lenLast=0;
        int flag=0;

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isWhitespace(c))
            {
                flag =0;
            }
            else{
                if(flag ==0)
                {
                    flag =1;
                    lenLast =0;
                }
                lenLast++;
            }
        }

        return lenLast;
    }
}