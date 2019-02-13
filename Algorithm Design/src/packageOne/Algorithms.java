package packageOne;

public class Algorithms {

	public static void main(String[] args) {
		System.out.println(
				"|======================================================================="+ "\n" +
				"|Program 2 - Sorting								   					 "+ "\n" +
			    "|======================================================================="+ "\n" +
				"|Brad Wilfong"															  + "\n" +
			    "|COSC 336 - 001"                                                         + "\n" +
				"|October 25th, 2018"													  + "\n");
		
		
		BubbleSort 	  BS 	= new BubbleSort();
		InsertionSort IS 	= new InsertionSort();
		SelectionSort SS 	= new SelectionSort();
		MergeSort	  MS	= new MergeSort();	
		QuickSort     QS	= new QuickSort();
		
		BS.BubbleLogic();			//Calls the BubbleSort algorithm and prints the time
		IS.InsertionLogic();		//Calls the InsertionSort algorithm and prints the time
		SS.SelectionLogic();		//Calls the SelectionSort algorithm and prints the time
		MS.MergeLogic();			//Calls the MergeSort algorithm and prints the time
		QS.Quicksort();				//Calls the BubbleSort algorithm and prints the time

	}
}
