package packageOne;

public class QuickSort {
	
	public void Quicksort(){
		int count = 5;

		System.out.println("QuickSort" + "\n");
		Timing TM = new Timing();				//Grabs the time it takes to run the program three times
		TM.TimingLogic(count);					//Tells the class which algorithm to use
	}
	public long[] sort(long[] arr){				//Quick sort Algorithm
		
		QuickSort ob = new QuickSort(); 
        ob.logic(arr, 0, arr.length-1); 
        return arr;
        
	}
		
	int partition(long arr[], int low, int high) 
    { 
        long pivot = arr[high];  
        int i = (low-1); 
        for (int j=low; j < high; j++) 
        { 
            if (arr[j] <= pivot) 
            { 
                i++; 
                long temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        long temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
 
    void logic(long arr[], int low, int high) 
    { 
        if (low < high) 
        {
            int pi = partition(arr, low, high); 

            logic(arr, low, pi-1); 
            logic(arr, pi+1, high); 
        } 
    } 


}
