class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0) return false;
        Set<Integer>slidingwindow=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(slidingwindow.contains(nums[i]))
            return true;
            if(i>=k)
            slidingwindow.remove(nums[i-k]);
            slidingwindow.add(nums[i]);
        }
        return false;
        
    }
}