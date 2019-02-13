package packageOne;

public class BubbleSort {
	
	public void BubbleLogic(){
		int count  = 1;
		System.out.println("BubbleSort" + "\n");	
		Timing TM = new Timing();				//Grabs the time it takes to run the program three times
		TM.TimingLogic(count);					//Tells the class which algorithm to use
		
	}
	
	public long[] sort(long[] arr){				//BubbleSort Algorithm
		boolean swapped = true;
		long hold = 0;
		
		do{
			swapped = false;
			for(int i = 0; i < arr.length-1; i++){
				if (arr[i] > arr[i+1]){
					
					hold = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = hold;
					swapped = true;
				}
			}
		}
		while(swapped);
		return arr;
	}

}
