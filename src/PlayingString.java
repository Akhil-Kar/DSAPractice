import java.util.Arrays;
import java.util.List;

public class PlayingString {
    public static void main(String[] args) {
        System.out.println("hello world!");
        int a[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        test(a);
        System.out.println(Arrays.toString(a));
    }
    static void test(int[] arr) {
        int[] b = arr;
        b[0] = 5;
    }
}
