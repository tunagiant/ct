package stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class stack_queue01_1 {

	class Solution {
		public int solution(int bridge_length, int weight, int[] truck_weights) {

			int answer = 0;
			int current = 0;
			int time = 0;
			Queue<Integer> queue = new LinkedList<Integer>();

			for (int i = 0; i < truck_weights.length; i++) {

				while (true) {
					//다리가 비었을 때
					if (queue.isEmpty()) {
						queue.add(truck_weights[i]);
						current += truck_weights[i];
						answer++;
					//맨 앞 차가 통과할 때. 현재 다리하중에서 나가는 차 무게 뺌
					} else if (queue.size() == bridge_length) {
						current -= queue.poll();
					//맨 앞 차가 통과하기 멀었을 때
					} else {
						//새로운 트럭진입X, 시간만count(0 삽입). while문 돔
						if (current + truck_weights[i] > weight) {
							queue.add(0);
							answer++;
						//무게 충분 : 새로운 트럭이 진입
						} else {
							queue.add(truck_weights[i]);
							current += truck_weights[i];
							answer++;
							break;
						}
					}
				}

			}
			return answer + bridge_length;

		}
	}

}
