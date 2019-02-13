package packageOne;

import java.util.Random;

public class Timing {
	
	public void TimingLogic(int count){
		long startTime;
		long stopTime;
		
		for(int k = 2; k <= 6; k++){			//Loop to run all array inputs 3 times
		System.out.println("10^" + k);
			
			Random rand = new Random();
			
			long arr[] = new long[(int) Math.pow(10, k)];		//starts the array with the same of 10^k
			
			startTime = System.currentTimeMillis();				//Start cpu count time in milliseconds
			
			for(int i = 0; i <= arr.length-1; i++){		// a loop to full the array with 10^3 random numbers
				long  n = rand.nextInt(1000) + 1;
				arr[i] = n;
			}
			sort(count, arr);							//Sort Numbers
			
			stopTime = System.currentTimeMillis();		// End cpu count time in milliseconds
			System.out.println("Elapsed time for 1 - 10^3 = "+(stopTime-startTime)+" msecs.");
			
//		-----------------------------------------------------------------------------------
			
			startTime = System.currentTimeMillis();		//Start cpu count time in milliseconds
			
			for(int i = 0; i <= arr.length-1; i++){		// a loop to full the array with 10^6 random numbers
				long  n = rand.nextInt(1000000) + 1;
				arr[i] = n;
			}
			sort(count, arr);							//Sort Numbers
			
			
			
			stopTime = System.currentTimeMillis();		// End cpu count time in milliseconds
			System.out.println("Elapsed time for 1 - 10^6  = "+(stopTime-startTime)+" msecs.");
			
			
			
//			-----------------------------------------------------------------------------------
			
				startTime = System.currentTimeMillis();			//Start cpu count time in milliseconds
				
				for(int i = 0; i <= arr.length-1; i++){			// a loop to full the array with 10^9 random numbers
					long  n = rand.nextInt(1000000000) + 1;
					arr[i] = n;
				}
				sort(count, arr);								//Sort Numbers
				
				stopTime = System.currentTimeMillis();			// End cpu count time in milliseconds
				System.out.println("Elapsed time for 1 - 10^9  = "+(stopTime-startTime)+" msecs.");

				System.out.println(" ");

		}
		System.out.println("-------------------------------------------------------------------");
	}
	public static void sort(int count, long[] arr){ //Takes the input from the other classes
													//to see which algorithm is called
		BubbleSort 	  BS 	= new BubbleSort();
		InsertionSort IS 	= new InsertionSort();
		SelectionSort SS 	= new SelectionSort();
		MergeSort	  MS	= new MergeSort();	
		QuickSort     QS	= new QuickSort();
		
		switch(count){
		case 1: BS.sort(arr); 
				break;
		case 2: IS.sort(arr);
			break;
		case 3: SS.sort(arr);
			break;
		case 4: MS.sort(arr);
			break;
		case 5: QS.sort(arr);
			break;
		default: 
			break;
		}
	}

}
