class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Boolean> map= new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], false);
            }
            else{
                map.put(nums[i], true);
            }
        }
        Integer trueKey = null;

        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            if (Boolean.TRUE.equals(entry.getValue())) {
                trueKey = entry.getKey();
                break; 
            }
        }   
        return trueKey;
    }
}