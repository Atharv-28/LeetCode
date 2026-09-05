class Solution {
    public int lengthOfLastWord(String s) {
        
        int lenLast=0;
        for(int i=s.length()-1; i>=0;i--)
        {
            if(s.charAt(i) != ' ')
            {
                lenLast++;
            }
            else if(s.charAt(i)==' ' && lenLast!=0)
            {
                return lenLast;
            }
        }

        return lenLast;
    }
}