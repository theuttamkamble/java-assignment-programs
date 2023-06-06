// Binary search algo 

public class BinarySearchAlgoEx1 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 13, 44, 45, 50, 105}; // sorted array
        int search = 50; // want to find element'th index 

        int number = BinarySearchAlgoEx1.searchElement(arr, search);
        System.out.println(number);
    }

// making static method
    public static int searchElement(int[] arr, int search) {
        int mid = (arr.length-1)/2;  // here find middle index which is 3

        if(search == arr[mid]) {
            return mid;
        } 
        else if(search > arr[mid]) {
            for(int i=mid+1; i<arr.length; i++) {
                if(search == arr[i]) {
                    return i;
                }
            }
        } 
        else if(search < arr[mid]) {
            for(int i=0; i<mid; i++) {
                if(search == arr[i]) {
                    return i;
                }
            }
        } 
        else {
            return -1;
        }
        return -1;
    }
}
