
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int firstLargest = 0;
        boolean firstSet = false;

        int secondLargest = 0;
        boolean secondSet = false;

        for (int i = 0; i < nums.size(); i++) {
            int currentNum = nums.get(i);
            if (currentNum > firstLargest || !firstSet) {
                secondLargest = firstLargest;
                firstLargest = currentNum;
                firstSet = true;
            } else if (currentNum > secondLargest || !secondSet) {
                secondLargest = currentNum;
                secondSet = true;
            }
        }

        return firstLargest + secondLargest;
    }
}