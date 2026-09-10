class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<m; i++)
        {
            for(int j=0;j<n;j++)
            {
                if(nums2[j]<nums1[i])
                {
                    int temp = nums1[i];
                    nums1[i] = nums2[j];
                    nums2[j] = temp;
                }
            }
        }
        int j=0;
        Arrays.sort(nums2);
        for(int i=m; i<m+n; i++)
        {
            nums1[i] = nums2[j];
            j++;
        }
    }
}