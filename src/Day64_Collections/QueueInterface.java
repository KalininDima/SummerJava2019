package Day64_Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
/*
 * Queue(I):
			poll(): FIFO = First In FIRST OUT
			return the first object as same data type,
			at the same time it removes the first object from the Queue
			
			
	Deque(I): 
			addFirst();adds the given object to starting order
			addLast();
			removeFirst():
			removeLast();
			getFirst():
			getLast();
			
	Iterable(I): extend by root interface interface collection
	we can apply Iterator(I) to the classes or interfaces that are sub type of Iterable
	
	Iterator(I):
	1. allows us to get access to each objects of the collection type
	2. allows us to remove objects from a collection type
	
	The OnLY legit way to remove data elements from a collection-type
	
	iterator(): iterates the collection, and returns Iterator
	
	hasNext(): check if there are enough elements that can be iterated
				returns boolean expression
	
	Next(): if hasnext() is true it retrives the current iteration from the collection type 
	
	remove(): remove current element of the iteration from the collection type
			
	*/			
public class QueueInterface {

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new PriorityQueue<>();
		q1.add(10);
		q1.add(30);
		q1.add(40);
		q1.add(50);
		
		//System.out.println(q1.get(1));  does not have indexes number
		
		System.out.println(q1);
		int a = q1.poll(); // unboxing
				
		System.out.println(q1);
		
		Integer b = q1.poll();
		System.out.println(q1);
		
		q1.poll();
		
		System.out.println(q1);
		
		Queue<String> q2 = new PriorityQueue<>();
		
		q2.add("Dima");
		q2.add("Alla");
		q2.add("Sasha");
		q2.add("Milana");
		q2.add("Zele");
		q2.add("Tim");
		System.out.println(q2);
		
		q2.poll();
		
		System.out.println(q2);
		
		q2.poll();
		
		System.out.println(q2);
		
		Queue<Integer> q3 = new PriorityQueue<>();
		
		Deque<Integer> DQ = new ArrayDeque<>();// []
		DQ.addFirst(10);//[10]
		DQ.addFirst(20);//[20,10]
		
		
		DQ.addLast(5);
		
		System.out.println(DQ);
		
		
		
	}
	
	
}
