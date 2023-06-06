import java.util.Arrays;

public class SortIntArrayEx1 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 6, 1, 9, 2};

        for(int item: arr) {
            System.out.println(item);
        }

        Arrays.sort(arr);

        for(int item: arr) {
            System.out.println(item);
        }
    }
}
