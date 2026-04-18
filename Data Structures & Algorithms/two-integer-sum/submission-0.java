class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i =0; i<nums.length;i++){
            int sum = target - nums[i];
            int j = i+1;
            while(j<nums.length){
                if(sum==nums[j]){
                    return new int []{i,j};
                }
                j++;
            }
        }
        return new int []{};
    }
}
