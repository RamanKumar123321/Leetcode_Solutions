class Solution {
    public int countValidSelections(int[] a) {
        int sum = 0, left = 0, ans = 0;
        for (int x : a) sum += x;

        for (int x : a) {
            if (x == 0) {
                int d = Math.abs(left - (sum - left));
                ans += d == 0 ? 2 : d == 1 ? 1 : 0;
            }
            left += x;
        }
        return ans;
    }
}