class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int n = nums.length;
        // for(int i=0 ; i<n-1; i++){
        //     for(int j = i+1; j<n; j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //optimize solution using hashset 
        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}