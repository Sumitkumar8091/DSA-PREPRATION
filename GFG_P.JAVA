// ------------ ZERO SUM SUBARRAY -------------- \\

// -------------- APPROACH 1 --------------------\\

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        long ans = 0;
        for(int i = 0; i < n; i++){
            long sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                if(sum == 0) ans++;
            }
        }
        return ans;
        
    }
}     
         
   

// ---------------APPROACH 2 ----------------------\\

public class Solution {
    public static long findSubarray(long[] arr, int n) {
        long ans = 0;
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);  // Initialize with 0 sum having frequency 1
        long sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                ans += map.get(sum);
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        return ans;
    }
}