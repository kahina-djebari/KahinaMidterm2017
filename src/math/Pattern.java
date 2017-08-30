package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class Pattern {

	public static void main(String[] args) throws Exception {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		int i = 100;

		while(i>=0) {
			System.out.print(i + ",");
			if(i>90){
				i=i-1;
			}
			else if(i>70){
				i=i-2;
			}
			else if(i>40){
				i=i-3;
			}
			else {
				i = i-4;
			}
		}
		List<Object> list = new ArrayList<Object>();
		for(int j=0; j<list.size(); j++){
			list.add(list.get(i));
		}
		ConnectDB connectDB = new ConnectDB();
		connectDB.InsertDataFromArrayListToMySql(list,"Pattern", "Numbers");
		connectDB.readDataBase("Pattern", "Numbers");
	}
}
