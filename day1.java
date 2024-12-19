class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int arr[]=new int[2];
        for (i=0;i<nums.length;i++)
        {
            for (j=i+1;j<nums.length;j++)
            {
                if (nums[i]+nums[j]==target)
                {
                  arr[0]=i;
                  arr[1]=j;
                //   return arr;
                }
            }
        }  
        return arr;
    } 
}
public class day1{
   public static void main (String[]agrs){
       int[] a={2,7,11,15};
       int t=9;
       Solution s=new Solution ();
       int[] res= new int[2];
       res = s.twoSum(a,t); 
        System.out.println(res[0]+" "+res[1]);
   }
}