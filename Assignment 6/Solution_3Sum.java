class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length < 3)
            return ans;
        
        Arrays.sort(nums);        
        for (int i=0; i< nums.length - 2; i++){
            if (i > 0 && nums[i] == nums[i-1])
                continue;
            int left=i+1;
            int right=nums.length-1;      
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    int currentLeft=nums[left];
                    while(left < right && nums[left] == currentLeft) 
                        left++;
                    int currentRight=nums[right];
                    while(left < right && nums[right] == currentRight) 
                        right--;
                } else if(sum > 0) 
                    right--;
                else 
                    left++;
            }
        }
        return ans;
    }
}