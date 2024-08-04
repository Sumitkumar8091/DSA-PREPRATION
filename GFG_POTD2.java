// ------------ The celebrity Problem GFG ------------

class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        int know[] = new int[n];
        int knownBy[] = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 1){
                    know[i]++;
                    knownBy[j]++;
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(know[i] == 0 && knownBy[i] == n-1) return i;
        }
        return -1;
    }
}