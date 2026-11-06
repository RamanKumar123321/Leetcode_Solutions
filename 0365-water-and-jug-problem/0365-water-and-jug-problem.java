class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if((x+y)<target)return false;
        int gcd=gcd(x,y);
        return target%gcd==0;
    }
    int gcd(int divd,int divi){
        if(divi==0)return divd;
        return gcd(divi,divd % divi);
    }
}