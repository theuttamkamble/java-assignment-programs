public class ReverseArraySwapExample2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int reversedArray[] = reverseArray(arr);
        for(int i=0; i<reversedArray.length; i++) {
            System.out.println(reversedArray[i]);
        }
    }

    // using swap method
    public static int[] reverseArray(int[] a) {
        // int[] arr1 = new int[a.length];
        int n = a.length;
        int t;
        for(int i=0; i<n/2; i++) { // i = 2
            t = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = t;
        }
        
        return a;
    }

}
