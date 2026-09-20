class Solution {
    public int reverseDegree(String s) {
        int prod=0;
        for(int i=0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            int pos= 'z' - ch +1;
            int deg = (i+1) * pos;
            prod += deg;
        }
        
        return prod;
    }
}