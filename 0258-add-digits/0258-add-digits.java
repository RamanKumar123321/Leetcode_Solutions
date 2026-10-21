class Solution {
    public int addDigits(int num) {
      if(num < 10){
        return num;
      } 
      return addDigits(sumdig(num)); 
    }
    int sumdig(int num){
        if(num==0){
            return 0;
        }
        return (num%10)+sumdig(num/10);
    }
}