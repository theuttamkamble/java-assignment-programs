

public class BinarySearchAlgoEx2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 9, 13, 43, 44, 50};
        int search = 6;

        BinarySearchAlgoEx2 b = new BinarySearchAlgoEx2();
        int number = b.binarySearch(arr, search);
        System.out.println(number);
    }

    public int binarySearch(int[] arr, int search) {
        int low = 0, high = arr.length-1;
        while(low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == search) {
                return mid;
            }
            else if(search > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return -1;
    }
}
