public class duplicate {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int uniqueIndex = 0; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i]; 
            }
        }

        return uniqueIndex + 1; 
    }

    public static void main(String[] args) {
        duplicate solution = new duplicate();

        // Example 1
        int[] nums1 = {1, 1, 2};
        System.out.println("Output: " + solution.removeDuplicates(nums1)); // Output: 2

        // Example 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Output: " + solution.removeDuplicates(nums2)); // Output: 5
    }
}
