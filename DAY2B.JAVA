//  ----------- PROBLEM NO 2134 -------------

class Solution {
    public int minSwaps(int[] nums) {
        int totalOnes = 0;
        
        // Calculate the total number of 1s in the array
        for (int num : nums) {
            if (num == 1) {
                totalOnes++;
            }
        }
        
        // If there are no 1s, no swaps are needed
        if (totalOnes == 0) {
            return 0;
        }
        
        int n = nums.length;
        int[] doubledNums = new int[2 * n];
        
        // Create the doubled array to handle the circular nature
        for (int i = 0; i < n; i++) {
            doubledNums[i] = nums[i];
            doubledNums[i + n] = nums[i];
        }
        
        // Use sliding window to find the maximum number of 1s in a window of size totalOnes
        int maxOnesInWindow = 0;
        int currentOnesInWindow = 0;
        
        // Initial window
        for (int i = 0; i < totalOnes; i++) {
            if (doubledNums[i] == 1) {
                currentOnesInWindow++;
            }
        }
        
        maxOnesInWindow = currentOnesInWindow;
        
        // Slide the window
        for (int i = 1; i < n; i++) {
            if (doubledNums[i - 1] == 1) {
                currentOnesInWindow--;
            }
            if (doubledNums[i + totalOnes - 1] == 1) {
                currentOnesInWindow++;
            }
            maxOnesInWindow = Math.max(maxOnesInWindow, currentOnesInWindow);
        }
        
        // The minimum swaps required will be the difference between totalOnes and maxOnesInWindow
        return totalOnes - maxOnesInWindow;
    }
    
}