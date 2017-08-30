package algorithm;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import databases.ConnectDB;

/*
 *Created by PIIT_NYA on 04/22/2017.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 */

	public static void main(String[] args) throws Exception {

		int [] num = new int[10000];

		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(100000);
		}

		ConnectDB connectDB = new ConnectDB();
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
		connectDB.InsertDataFromArryToMySql(num, "selection_sort", "SortingNumbers");
		List<String> numbers = connectDB.readDataBase("selection_sort", "SortingNumbers");
		for(String st:numbers){
			System.out.println(st);
		}
		int n = num.length;
		randomize (num, n);
		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		//Continue for rest of the Sorting Algorithm....

		//bubble sort
		randomize (num, n);
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + bubbleSortExecutionTime + " milli sec");

		//bucket sort
		randomize (num, n);
		algo.bucketSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + bucketSortExecutionTime + " milli sec");

		//heap sort
		randomize (num, n);
		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + heapSortExecutionTime + " milli sec");

		//merge sort
//		randomize (num, n);
//		algo.mergeSort(num);
//		long mergeSortExecutionTime = algo.executionTime;
//		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + mergeSortExecutionTime + " milli sec");

		//quick sort
//		randomize (num, n);
//		algo.quickSort(num);
//		long quickSortExecutionTime = algo.executionTime;
//		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + quickSortExecutionTime + " milli sec");

		//shell sort
		randomize (num, n);
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + shellSortExecutionTime + " milli sec");

	}

	public static void randomize( int arr[], int n) {
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}


}
