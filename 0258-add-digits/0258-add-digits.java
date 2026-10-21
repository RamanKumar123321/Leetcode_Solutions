class Solution {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        return addDigits(sd(num));
    }

    int sd(int num) {
        if (num == 0) {
            return 0;
        }

        return (num % 10) + sd(num / 10);
    }
}