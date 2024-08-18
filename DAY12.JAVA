class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            int temp = 0;
            for(int j = i+1; j < arr.length; j++){
                temp += arr[j];
            }
            if(temp == sum) return true;
            if(temp < sum) return false;
        }
        return false;
    }
}

class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int arrSum = 0, sum = 0, n = arr.length;
        
        // sum of total array..
        for(int i=0; i < n; i++) {
            arrSum += arr[i];
        }
        
        // sub array Sum..
        for(int i=0; i < n; i++) {
            sum += arr[i];
            if(sum * 2 == arrSum) {
                return true;
            }
        }
        return false;
    }
}