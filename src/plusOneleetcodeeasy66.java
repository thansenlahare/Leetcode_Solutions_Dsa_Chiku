public class plusOneleetcodeeasy66 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] plusOne(int[] digits) {
            int size = digits.length;
            for(int i = size-1; i >= 0; i--){
                if(digits[i] != 9){
                    digits[i]++;
                    break;
                }
                else{
                    digits[i] = 0;
                }
                // check for the case [0,0,0,0];
            }
            if(digits[0] == 0){
                int[] res = new int[size+1];
                res[0] = 1;
                return res;
            }
            return digits;
        }
    }
}
