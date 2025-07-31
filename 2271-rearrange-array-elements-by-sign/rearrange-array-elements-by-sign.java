class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int odd = 1;
        int even = 0;
        int[] res = new int[n];
        for(int i : nums){
            if(i < 0) {
                res[odd] = i;
                odd += 2;
            }
            else{
                res[even] = i;
                even += 2;
            }
        }
        return res;
    }
}