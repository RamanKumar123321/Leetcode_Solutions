class Solution {
    public int countValidSelections(int[] nums) {
        int total = 0;
        for (int x : nums) total += x;

        int left = 0;
        int ans = 0;

        for (int x : nums) {
            left += x;

            if (x == 0) {
                int right = total - left;

                if (left == right) {
                    ans += 2;
                } else if (Math.abs(left - right) == 1) {
                    ans += 1;
                }
            }
        }

        return ans;
    }
}