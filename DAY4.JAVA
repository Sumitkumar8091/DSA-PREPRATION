// ---------- LEETCODE 2053 ---------------------
class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        
        // Count the frequency of each string
        for (String str : arr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        // Iterate again to find the k-th distinct string
        int count = 0;
        for (String str : arr) {
            if (map.get(str) == 1) {
                count++;
            }

            if (count == k) {
                    return str;
                }
        }
        
        return "";  // Return an empty string if the k-th distinct string does not exist
    }
}
