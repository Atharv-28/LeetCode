class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        arr1.add(nums[0]);
        
        if(nums.length > 1) {
            arr2.add(nums[1]);
        }
        
        for(int i = 2; i < nums.length; i++) {
            if(arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }
        
        int[] res = new int[nums.length];
        int index = 0;
        for(int val : arr1) {
            res[index++] = val;
        }
        for(int val : arr2) {
            res[index++] = val;
        }
        return res;
    }
}