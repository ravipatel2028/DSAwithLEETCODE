
import java.util.HashSet;
import java.util.Set;

/*
        Leetcode problem no : 217
*/

public class ContainsDuplicate {

  private static boolean hasDuplicates(int[] nums) {
    Set<Integer> ele = new HashSet<>();

    for (int i : nums) {
      if (ele.contains(i)) {
        return true;
      }
      ele.add(i);
    }
    return false;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4 };

    System.out.println(hasDuplicates(nums));
  }

}
