package packageOne;

public class SelectionSort {

	public void SelectionLogic() {
		int count = 3;
		System.out.println("SelectionSort" + "\n");
		
		Timing TM = new Timing();				//Grabs the time it takes to run the program three times
		TM.TimingLogic(count);					//Tells the class which algorithm to use
	}

	public long[] sort(long[] arr){				//Selection sort Algorithm
		
		for(int i = 0; i <= arr.length-1; i++){
			long min = arr[i];
			int x = i;
			for(int j = i; j <= arr.length-1; j++){
				if (arr[j]< min){
					x = j;
					min = arr[j];
				}
			}
			arr[x] = arr[i];
			arr[i] = min;
		}
		return arr;
	}
}
