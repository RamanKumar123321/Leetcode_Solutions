
import java.util.Arrays;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] sorted = score.clone();
        Arrays.sort(sorted);

        String[] ans = new String[n];
        assign(score, sorted, ans, n - 1, 0);

        return ans;
    }

    void assign(int[] score, int[] sorted, String[] ans, int index, int rank) {
        if (index < 0) {
            return;
        }

        int pos = score.length - 1 - index;
        int value = sorted[index];
        int originalIndex = findIndex(score, value, 0);

        if (rank == 0) ans[originalIndex] = "Gold Medal";
        else if (rank == 1) ans[originalIndex] = "Silver Medal";
        else if (rank == 2) ans[originalIndex] = "Bronze Medal";
        else ans[originalIndex] = String.valueOf(rank + 1);

        assign(score, sorted, ans, index - 1, rank + 1);
    }

    int findIndex(int[] score, int value, int i) {
        if (i == score.length) return -1;
        if (score[i] == value) return i;
        return findIndex(score, value, i+1 );
    }
}
