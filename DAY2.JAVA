
// ---------------- APPROACH 1 -----------------
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        boolean ans = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < target.length; j++){
                ans = false;
                if(target[i] == arr[j]){
                    ans = true;
                    arr[j] = -1;
                    break;
                }
            }
            if(ans == false) return false;
        }
        return true;
    }
}

// ------------------- APPROACH 2 ------------------

import java.util.HashMap;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) return false;

        HashMap<Integer, Integer> targetMap = new HashMap<>();
        HashMap<Integer, Integer> arrMap = new HashMap<>();

        // Count frequencies of each element in target array
        for (int num : target) {
            targetMap.put(num, targetMap.getOrDefault(num, 0) + 1);
        }

        // Count frequencies of each element in arr array
        for (int num : arr) {
            arrMap.put(num, arrMap.getOrDefault(num, 0) + 1);
        }

        // Compare frequency maps
        return targetMap.equals(arrMap);
    }
}

// -------------- APPROACH 3 ------------------

import java.util.Arrays;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }
}


