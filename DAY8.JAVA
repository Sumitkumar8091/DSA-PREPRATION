// ---------------------------------- GFG POTD -------------------------------------

// -------------------------------------  APPROACH 1-----------------------------

class Solution {
    long floorSqrt(long n) {
        // Your code here
       long ans = 0L;
       for(long i = 1; i <= (n/2)+1; i++){
           if(i*i == n) return i;
           else if(i*i > n) return i-1;
       }
       return n;
    }
}
// -------------------------------------------------  APPROACH 2 ----------------------------------------------
class Solution {
    long floorSqrt(long n) {
        // Your code here
        if (n == 0 || n == 1) {
            return n;
        }

        long l = 1, r = n;
        long ans = 0;

        while (l <= r) {
            long mid = l + (r - l) / 2;
            long sq = mid * mid;

            if (sq == n) {
                return mid;
            } else if (sq < n) {
                l = mid + 1;
                ans = mid;  // Update the answer to mid, as it is a candidate for the floor square root
            } else {
                r = mid - 1;
            }
        }

        return ans;
    }
}
