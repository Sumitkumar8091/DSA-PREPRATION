// GFG POTD

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        return pq.poll();
    }
}

// LEETCODE POTD PROBLEM NUMBER 991

class Solution {
    public int minSteps(int n) {
        if(n == 1) return 0;
        if(1 > n) return 1-n;
        if(n % 2 == 0){
            return 1 + minSteps(n/2);
        }
        return 1 + minSteps(n+1);
    }
}
