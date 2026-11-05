class Solution {
    public int numberOfSteps(int num) {
        return solve(num);
    }

    int solve(int num) {
        if (num == 0) {
            return 0;
        }

        if (num % 2 == 0) {
            return 1 + solve(num / 2);
        }

        return 1 + solve(num - 1);
    }
}