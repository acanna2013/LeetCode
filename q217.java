import java.util.HashMap;

public class q217 {
	HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();
	public boolean containsDuplicate(int[] nums) {
		for (int val : nums) {
			dict.put(val, dict.get(val)++);
			if (dict.get(val) != 1) {
				return false;
			}
		}
		return true;
	}
}
