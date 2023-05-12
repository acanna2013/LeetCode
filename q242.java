class q242 {
	HashMap<Character, Integer> dict1 = new HashMap<Character, Integer>();
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) { 
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			dict1.put(c, dict1.getOrDefault(c,0)+1);
		}

		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			if (dict1.get(c) != null) {
				dict1.put(c, dict1.get(c)-1);
			} else {
				return false;
			}
			if (dict1.get(c) < 0) {
				return false;
			}
		}
		return true;
	}
}
