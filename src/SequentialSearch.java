public class SequentialSearch {

    public static int sequentialSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 9, 2, 7, 1, 8, 4, 6};
        int targetElement = 7;

        int result = sequentialSearch(array, targetElement);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}