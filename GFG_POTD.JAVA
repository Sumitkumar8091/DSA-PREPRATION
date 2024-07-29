// Given a boolean 2D array, consisting of only 1's and 0's, where each row is sorted. Return the 0-based index of the first row that has the most number of 1s. If no such row exists, return -1.

// Examples:

// Input: arr[][] = [[0, 1, 1, 1],
//                [0, 0, 1, 1],
//                [1, 1, 1, 1],
//                [0, 0, 0, 0]]
// Output: 2
// Explanation: Row 2 contains 4 1's (0-based indexing).

// APPROACH 1: ---------- O(N^2)

// class Solution {
//     public int rowWithMax1s(int matrix[][]) {
//         // code here
//          int rows = matrix.length;
//         int cols = matrix[0].length;
//         int ans = 0, rel = -1;
//         for (int i = 0; i < rows; i++) {
//             int cnt = 0;
//             for (int j = 0; j < cols; j++) {
//               if(matrix[i][j] == 1) cnt++;
//             }
//             if(ans < cnt){
//                 ans = cnt;
//                 rel = i;
//             }
//             // System.out.println();
//         }
//         return rel;
//     }
// }

// APPROACH 2: --------------O(N+M)

class Solution {
    public int rowWithMax1s(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxRow = -1;
        int j = cols - 1; // Start from the top-right corner

        for (int i = 0; i < rows; i++) {
            while (j >= 0 && matrix[i][j] == 1) {
                j--; // Move left if you find a 1
                maxRow = i; // Update the row with max 1s
            }
        }
        
        return maxRow;
    }
}
