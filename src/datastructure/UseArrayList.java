package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class UseArrayList {


	public static void main(String[] args) throws Exception {

		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<Object> fruit = new ArrayList<Object>();
		fruit.add("Cherries");
		fruit.add("Apples");
		fruit.add("Bananas");

		//use for loop to retrieve data
		for(int i=0; i<fruit.size(); i++){
			System.out.println(fruit.get(i));
		}
		//remove one element
		fruit.remove(1);

		//use for each loop to retrieve data
		for(Object st:fruit){
			System.out.println(st);
		}
		//add one element
		fruit.add(1,"Oranges");

		//use iterator to retrieve data
		Iterator it = fruit.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		ConnectDB connectDB = new ConnectDB();
		connectDB.InsertDataFromArrayListToMySql(fruit,"Fruits", "FruitName");
		connectDB.readDataBase("Fruits", "FruitName");

	}

}
