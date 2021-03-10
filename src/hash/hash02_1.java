package hash;

//정확성o 효율성x
public class hash02_1 {

	class Solution {
		public boolean solution(String[] phone_book) {

			for (int i = 0; i < phone_book.length; i++) {
				for (int j = i + 1; j < phone_book.length; j++) {
					if (phone_book[i].contains(phone_book[j]) 
							&& phone_book[i].indexOf(phone_book[j]) == 0) {
						return false;
					}
					if (phone_book[j].contains(phone_book[i]) 
							&& phone_book[j].indexOf(phone_book[i]) == 0) {
						return false;
					}
				}
			}
			return true;
		}
	}

}
