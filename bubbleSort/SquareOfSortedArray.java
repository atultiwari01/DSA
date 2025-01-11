import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] SortedArray = nums.clone();
        for(int i=0;i<SortedArray.length;i++)SortedArray[i]=SortedArray[i]*SortedArray[i];
        Arrays.sort(SortedArray);
        return SortedArray;
    }
}

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        Solution solution = new Solution();
        System.out.println(solution.sortedSquares(nums));
    }
}
