class Solution {
    public void reverseString(char[] s) {
        int size = s.length;
        int i=0, j=size-1;
        while(i<=j)
        {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
            j--;
        }
    }
}