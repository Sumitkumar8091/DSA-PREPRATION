// ----------------- APPROACH 1 --------------------
//  --------------- PROBLEM NO 1508 ----------------
class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> sum = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int ad = 0;
            for (int j = i; j < n; j++) {
                ad += nums[j];
                sum.add(ad);
            }
        }
        Collections.sort(sum);
        
        int ans = 0;
        int mod = 1000000007;
        
        for (int start = left - 1; start < right; start++) {
            ans = (ans + sum.get(start)) % mod;
        }
        return ans;
    }
}