package hash;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class hash04_1 {

	class Solution {
		public int[] solution(String[] genres, int[] plays) {

			Map<Integer, String> g_map = new HashMap<>();
			Map<Integer, Integer> c_map = new HashMap<>();
			Map<String, Integer> g_rank = new HashMap<>();
			List<String> rank = new ArrayList<>();
			
			
			for (int i = 0; i < genres.length; i++) {
				g_map.put(i, genres[i]);
				c_map.put(i, plays[i]);
				g_rank.put(genres[i], g_rank.getOrDefault(genres[i], 0) + plays[i]);
				if (!rank.contains(genres[i])) {
					rank.add(genres[i]);
				}
			}
			
			rank.sort(new Comparator<String> () {

				@Override
				public int compare(String o1, String o2) {
					return g_rank.get(o1) > g_rank.get(o2) ? 1 : -1; 
				}
			});

			for (int i = 0; i < rank.size(); i++) {
				for (int j = 0; j < c_map.get(i); i++) {
					
				}
			}
			
			
			int[] answer = {};
			return answer;
		}
	}

}
