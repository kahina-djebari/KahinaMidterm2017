package datastructure;

import databases.ConnectDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class UseMap {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<String,String> map = new HashMap<String,String>();
		map.put("USA","Washington");
		map.put("France","Paris");
		map.put("Algeria","Algiers");

		for(Map.Entry entry:map.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		Map<String, List<Object>> cities = new HashMap<String, List<Object>>();

		cities.put("USA", Arrays.asList("Washington", "NewYork", "Boston"));
		cities.put("France", Arrays.asList("Paris", "Nice", "Lyon"));
		cities.put("Algeria", Arrays.asList("Algiers", "Bejaia", "Annaba"));

		for (Map.Entry<String, List<Object>> entry : cities.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		Iterator<Map.Entry<String, List<Object>>> entries = cities.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<String, List<Object>> entry = entries.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		ConnectDB connectDB = new ConnectDB();
		for(Map.Entry<String, List<Object>> entry : cities.entrySet()){
			connectDB.InsertDataFromArrayListToMySql(entry.getValue(), "UseMap", "Cities");
			connectDB.readDataBase("UseMap","Cities");
		}
	}
}


