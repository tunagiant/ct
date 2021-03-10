package hash;

import java.util.HashMap;
import java.util.Map;

//정확성o 효율성o
public class hash01_1 {

	class Solution {
		public String solution(String[] participant, String[] completion) {

			Map<String, Integer> hash = new HashMap<>();
			for (String arg : participant) {
				hash.put(arg, hash.getOrDefault(arg, 0) + 1);
			}
			for (String arg : completion) {
				hash.put(arg, hash.get(arg) - 1);
			}
			for (String key : hash.keySet()) {
				if (hash.get(key) != 0) {
					return key;
				}
			}
			return null;
		}
	}

}
