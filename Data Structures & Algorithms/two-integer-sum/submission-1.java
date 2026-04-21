class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int[] ii=new int[2];
                    ii[0]=i;
                    ii[1]=j;
                    return ii;
                }
            }
        }
        return new int[] {};
    }
}
