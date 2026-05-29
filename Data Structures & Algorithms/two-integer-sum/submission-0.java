class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> tempMap = new HashMap<>();
        int[] result = new int[2];
        for(int i=0; i < nums.length; i++){
            int temp = target - nums[i];
            if(tempMap.containsKey(temp)){
                result[0] = tempMap.get(temp);
                result[1] = i;
            } else { 
                tempMap.put(nums[i], i);
            }
        }
        return result;
    }
}
