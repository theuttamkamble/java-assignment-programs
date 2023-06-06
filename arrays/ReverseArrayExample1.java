public class ReverseArrayExample1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 40};    

        int[] reversedArray = reversedArray(arr);
        for(int i=0; i<reversedArray.length; i++) {
            System.out.println(reversedArray[i]);
        }
    }

    public static int[] reversedArray(int[] a) {
        int[] arr1 = new int[a.length];

        for(int i=0, j= arr1.length-1; i<arr1.length; i++) {
            arr1[i] = a[j];
            j--;
        }
        
        return arr1;
    }
}
