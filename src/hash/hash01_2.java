package hash;

import java.util.Arrays;

//정확성o 효율성o
public class hash01_2 {

class Solution {
	public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i = 0;
        
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[i];

        
	}
}

}
