public class checkArrayIsSortedInNondecendingorder {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,89};
        System.out.println(isSorted(arr));

    }
    static boolean isSorted(int[] array){
        boolean flag = true;
        int i =0;
        while(i < array.length-1){
            if (array[i]<=array[i+1]){
                flag = true;
            }
            else{
                return false;
            }
            i++;
        }
        return flag;
    }
}
