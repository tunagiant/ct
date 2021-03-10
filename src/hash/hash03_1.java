package hash;

import java.util.Map;
import java.util.HashMap;

public class hash03_1 {

class Solution {
	public int solution(String[][] clothes) {

		int answer = 1;

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < clothes.length; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
		}

		for (int count : map.values()) {
			answer *= (count + 1);
		}
		return answer - 1;
	}

}}
