package lection1.binarySearch;

public class BinarySearch {

    public static int binarySearch(int[] array, int number, int low, int high) {
        int index = -1;  // в том случае если элемент не найден возвращаем -1
        high = array.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (array[mid] < number) {
                low = mid + 1;
            } else if (array[mid] > number) {
                high = mid - 1;
            } else if (array[mid] == number) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
