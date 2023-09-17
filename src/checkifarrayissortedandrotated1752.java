public class checkifarrayissortedandrotated1752 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(check(array));
    }

    public static boolean check(int[] nums) {
        int sizeOfArray = nums.length;
        int count = 0;
        for(int i = 1; i <sizeOfArray;i++){
            if(nums[i-1] > nums[i] ){
                count++;
            }
            if(nums[sizeOfArray-1]> nums[0]){
                count++;
            }

        }
        return count <= 1; // for considering the case in which all the elements are same and count will be zero.
    }

}
