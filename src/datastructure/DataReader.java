package datastructure;
import databases.ConnectDB;

import java.io.*;
import java.util.*;

public class DataReader {

	public static void main(String[] args) throws Exception {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";

		FileReader fr = new FileReader(textFile);
		BufferedReader br = new BufferedReader(fr);

		//use linkedList
		LinkedList<Object> listWords = new LinkedList<Object>();
		String st = " ";
		while((st=br.readLine()) != null) {
			//System.out.println(st);

			for(int i=0; i<listWords.size(); i++){
				listWords.add(st);
			}
		}	br.close();

		for(Object word:listWords) {
			System.out.println(word);

		}

		//use stack
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < listWords.size(); i++) {
			stack.push(st);
		}

		Iterator<String> it = stack.listIterator();
		while (it.hasNext()) {
			System.out.println(stack.pop());

			if (!stack.isEmpty()) {
				System.out.println(stack.peek());
			}
		}
		ConnectDB connectDB = new ConnectDB();
		connectDB.InsertDataFromArrayListToMySql(listWords,"TextFile", "Composition");
		connectDB.readDataBase("TextFile", "Composition");

	}
}
