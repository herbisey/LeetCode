class Solution{
    // time: O(n)
    // space: O(n)
    public int[] twoSum(int[] nums, int target){
        // Create a map for a quick search
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // Put the number and indice into the map, and then look for the difference
        map.put(nums[0], 0);
        
        for(int i=1; i<nums.length; i++){

            if(map.containsKey(target-nums[i]))
                return new int[]{map.get(target-nums[i]), i};
            else
                map.put(nums[i], i);
        }
        return null;
    }

    // time: O(n)
    // space: O(n)
    public int[] twoSum2(int[] nums, int target){
        // put the difference in a map to search for it quickly.
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        for(int i = 1; i<nums.length; i++){
            int a = nums[i];
            if(map.containsKey(target-a)){
                return new int[]{map.get(target-a), i};
            }
            else{
                map.put(a, i);
            }
        }
        return null;
    }
    
    // time: O(n2)
    // space: O(1)
    public int[] twoSum_bruteForce(int[] nums, int target) {
        int a = 0;
        int b = 1;
        int l = nums.length;
        while(a < l){
            if(nums[a] + nums[b] == target) return new int[]{a,b};
            else{
                if(b == l-1){
                    a++;
                    b = a + 1;
                }
                else b++;
            }
        }
        return new int[]{a, b};
        
    }
}