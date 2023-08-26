import java.util.ArrayList;
import java.util.List;

public class Twonum {
    static List<List<Integer>> combiner(int[] nums) {
        List<List<Integer>> temp = new ArrayList<>();
        int i = 0;
        int j = i + 1;
        while (i < nums.length - 1) {
            if (j == nums.length) {
                i++;
                j = i + 1;
            }
            temp.add(List.of(nums[i], nums[j]));
            j++;
        }
        return temp;
    }

    public static void main(String args[]) {
        List<List<Integer>> test = combiner(new int[]{1, 2, 3, 4, 5, 6});
        for (List<Integer> element : test) {
            System.out.println(element);
        }
    }
}

