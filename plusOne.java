class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}

public class plusOne {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] digits = { 4, 3, 2, 9 };
        int[] result = sol.plusOne(digits);
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
