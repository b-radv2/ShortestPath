package packageOne;

public class InsertionSort {

	public void InsertionLogic() {
		int count = 2;

		System.out.println("InsertionSort" + "\n");
		
		Timing TM = new Timing();				//Grabs the time it takes to run the program three times
		TM.TimingLogic(count);					//Tells the class which algorithm to use

	}
	public long[] sort(long [] arr){			//Insertion sort Algorithm
		long hold = 0, z = arr.length-1;
		
		for(int i= 0; i<= z; i++){
			long min = arr[i];
			for(int j = i; j > 0; j--){
				if(min < arr[j-1]){
					hold = arr[j - 1];
					arr[j-1] = min;
					arr[j] = hold;
				}
			}
		}
		return arr;
	}

}
