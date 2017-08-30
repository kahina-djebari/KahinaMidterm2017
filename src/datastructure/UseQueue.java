package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<String> queue = new LinkedList<String>();

		queue.add("kahina");
		queue.add("sofiane");
		queue.add("djebari");
		queue.add("oumsalem");


		Iterator<String> it = queue.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		System.out.println(queue.peek());

		queue.poll();

		Iterator<String> it1 = queue.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}

		while(!queue.isEmpty()){
			System.out.println(queue.remove());
		}
	}

}
