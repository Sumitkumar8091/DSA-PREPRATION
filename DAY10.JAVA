// ------------- 624. Maximum Distance in Arrays --------------------
class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int ans = 0;
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        
        for (int i = 1; i < arrays.size(); i++) {
            int firstEle = arrays.get(i).get(0);
            int lastEle = arrays.get(i).get(arrays.get(i).size() - 1);
            
            int a1 = Math.abs(max - firstEle);
            int a2 = Math.abs(min - lastEle);
            
            ans = Math.max(ans, Math.max(a1, a2));
            
            min = Math.min(min, firstEle);
            max = Math.max(max, lastEle);
        }
        
        return ans;
    }
}
