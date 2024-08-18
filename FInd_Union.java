import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {
    public static Set<Integer> mergeSortedArrays(int[] arr1, int n, int[] arr2, int m) {
        Set<Integer> ans = new LinkedHashSet<>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                ans.add(arr1[i]);
                i++;
            } else {
                ans.add(arr2[j]);
                j++;
            }
        }

        while (i < n) {
            ans.add(arr1[i]);
            i++;
        }

        while (j < m) {
            ans.add(arr2[j]);
            j++;
        }

        return ans;
    }
}
