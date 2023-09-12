public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(getSecondOrderElements(array.length, array));
    }
    public static int[] getSecondOrderElements(int n, int[] a) {
        int[] result = new int[2];
        int largest = a[0];
        int second_largest = Integer.MIN_VALUE;
        int smallest = a[0];
        int second_smallest = Integer.MAX_VALUE;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                second_largest = largest;
                largest = a[i];
            }
            if (a[i] < smallest) {
                second_smallest = smallest;
                smallest = a[i];
            }
        }
        result[0] = second_largest;
        result[1] = second_smallest;
        return result;
    }
}