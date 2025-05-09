public class optneedle {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        optneedle solution = new optneedle();

        // Example 1
        String haystack1 = "hello";
        String needle1 = "ell";
        System.out.println("Output: " + solution.strStr(haystack1, needle1)); // Output: 0

        // Example 2
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println("Output: " + solution.strStr(haystack2, needle2)); // Output: -1
    }
}
