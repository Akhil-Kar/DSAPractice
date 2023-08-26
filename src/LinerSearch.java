public class LinerSearch {

    public int Search(int[] arr, int target) {
        if(arr.length == 0)
            return -1;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target)
                return index;
        }

        return -1;
    }
}
