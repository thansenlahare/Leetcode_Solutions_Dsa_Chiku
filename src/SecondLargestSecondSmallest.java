import java.util.Arrays;

/*
https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
 */


public class SecondLargestSecondSmallest {
    public static void main(String[] args) {
        int[] array = {1,43,-167,54,3839,3839,34,54,54};
        //System.out.println(Arrays.toString(getSecondOrderElements(array.length, array)));
        //System.out.println(secondlargest(array));
        System.out.println(secondlargestoptimal(array));
    }
    public static int[] getSecondOrderElements(int n, int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num < firstLargest) {
                secondLargest = num;
            }
        }
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = num;
            } else if (num < secondSmallest && num > firstSmallest) {
                secondSmallest = num;
            }

        }
        return new int[] { secondLargest, secondSmallest};
    }
    // bf solution for finding the secondlargest
    // sorting nlong.
    // worstcase big oh of n. if dublicate element.
    // nlong + n

    public static int secondlargest(int[] array){
        Arrays.sort(array);
        int largest = array[array.length-1];
        for (int i = array.length-1; i >=0 ; i--) {
            if (array[i] != largest){
                return array[i];
            }
        }
        return -1;
    }
    //secondlargest findin optimat solution
    // time complexity of the approach is Bigoh of N.
    // where N is the length of the array.
    // assuming all the comparision will take constatnt time.
    public static int secondlargestoptimal(int[] array){
        int secondlargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > largest){
                secondlargest = largest;
                largest = array[i];
            }
            if (array[i]<largest && array[i] > secondlargest){
                secondlargest = array[i];
            }
        }
        return secondlargest;
    }
}
