import java.util.HashMap;

public class q217 {
	HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();
	public boolean containsDuplicate(int[] nums) {
		if (dict.get(n) == null) {
			dict.put(n, 1);
		} else {
			int val = dict.get(n) + 1;
			dict.put(n, val);
		}
		if (dict.get(n) > 1) {
			return true;
		}
	}
	return false;  
}




