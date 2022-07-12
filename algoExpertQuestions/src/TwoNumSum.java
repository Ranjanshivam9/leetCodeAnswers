import java.util.HashMap;
import java.util.Map;

public class TwoNumSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Map<Integer,Boolean> nums = new HashMap<>();
        for (int num: array) {
            int potentialMatch = targetSum - num;
            if(nums.containsKey(potentialMatch)) {
                return new int[]{potentialMatch, num};
            } else {
                nums.put(num,true);
            }
        }
        return new int[]{};
    }
}
