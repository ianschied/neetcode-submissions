class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> seen = new HashMap<>();
        int [] sol = new int [2];

        for (int i = 0; i < nums.length; i++) {

            int goal = target - nums[i];

            if (seen.containsKey(goal)) {

               sol[0] = seen.get(goal);
               sol[1] = i;

               return sol;
            }

            seen.put(nums[i], i);
        }

        return sol;

    }
}
