package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class hash02_3 {

	class Solution {
			public boolean solution(String[] phone_book) {
	            
	            Map<String, Integer> hashMap = new HashMap<>();
	            
	            for (int i = 0; i < phone_book.length; i++) {
	                hashMap.put(phone_book[i], i);
	            }
	            
	            for (int i = 0; i < phone_book.length; i++) {
	                for (int j = 0; j < phone_book[i].length(); j++) {
	                    if (hashMap.containsKey(
	                        phone_book[i].substring(0, j))
	                       ) {
	                        return false;
	                    }
	                }
	            }
	            return true;
	            
	        }
	    }

}
