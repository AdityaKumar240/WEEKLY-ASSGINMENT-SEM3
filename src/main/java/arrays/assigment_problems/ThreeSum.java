package arrays.assigment_problems;
import java.util.*;
public class ThreeSum {
    static int[][] threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<int[]> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                long sum = (long) nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(new int[]{nums[i], nums[left], nums[right]});
                    int a = nums[left], b = nums[right];
                    while (left < right && nums[left] == a) left++;
                    while (left < right && nums[right] == b) right--;
                } else if (sum < 0) left++;
                else right--;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(threeSum(new int[]{-1, 0, 1, 2, -1, -4})));
    }
}