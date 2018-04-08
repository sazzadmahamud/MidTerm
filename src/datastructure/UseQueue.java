package datastructure;

import databases.ConnectDB;

import java.util.*;
public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		ConnectDB connectDB = new ConnectDB();
		Queue<String> queue = new LinkedList<String>();
		queue.add("ABCD");
		queue.add("DCEF");
		queue.add("DFCX");
		queue.add("ASCJM");

		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue.poll());

		System.out.println("Retriving elements by enhance for loop");
		for(String singer:queue){
			System.out.println(singer);
		}
		System.out.println("Retriving elements by while loop with Iterator");
		Iterator it = queue.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		List<String> nameList = new ArrayList<String>();
		try {
			connectDB.insertProfileToMySql(Queue, "tbl_Queue", "column_Queue");
			nameList = connectDB.readDataBase("tbl_Queue", "column_Queue");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_Queue) and displaying to the console");
		for (String st : nameList) {
			System.out.println(st);
		}

	}
}