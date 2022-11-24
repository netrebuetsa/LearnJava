

class Solution {
    int[] nums = {1, 2, 3, 4};

    public boolean containsDuplicate(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    k++;
                }
            }
        }
        if (k > 2) {
            return true;
        }
        else return false;

    }

}
