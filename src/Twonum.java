import java.util.List;
import java.util.ArrayList;

public class Twonum {
	static List<List<Integer>> combiner(int[] nums) {
		List<List<Integer>> temp = new ArrayList<>();
		int i = 0;
        int j = i+1;
        int k = j+1;
        while (k < nums.length) {
        	if (nums[i]+nums[j]+nums[k] == 0)
            	temp.add(List.of(nums[i], nums[j], nums[k]));
            ++k;
            if (k == nums.length) {
                ++j;
                k = j+1;
            }
            if (j == nums.length-1) {
            	++i;
            	j = i+1;
            	k = j+1;
            }
            if (i == nums.length-2) {
                break;
            }
        }
        return temp;
        
        //List<List<Integer>> final = new ArrayList<>();
        //int a = 0;
        //int b = a+1;
        //while (b < temp.length) {
        	
        //}
	}
	 
	public static void main(String args[]) {
		System.out.println("main");
		List<List<Integer>> test = combiner(new int[]{-1,0,1,2,-1,-4});
		for (List<Integer> element : test) {
            System.out.println(element);
        }
	}
}
