class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=0; i<digits.length; i++) {
            if(digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        return new int[digits.length+1];
    }
}

public class plusOne {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] digits = {1, 2, 3};
        int[] newDigits = sol.plusOne(digits);
        for(int i=0; i<newDigits.length; i++) {
            System.out.print(newDigits[i] + " ");
        }
    }
}
