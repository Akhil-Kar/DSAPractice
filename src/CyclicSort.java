import java.util.Arrays;

public class CyclicSort {
    public static void main(String args[]) {
        System.out.println("Cyclic Sort!");
        int[] arr = {3, 5, 2, 1, 4};
        CyclicSort cyc = new CyclicSort();
        cyc.sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    public void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }

    public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
