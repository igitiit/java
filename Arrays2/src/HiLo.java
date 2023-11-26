
public class HiLo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,7,22,6,0,3,4};
		int hi_val = arr[0];
		int low_val = arr[0];
		double average = 0;
		double sum = 0;
		
		//check for highest value
		for(int i = 1; i<arr.length;i++)
			if(arr[i] > hi_val)
				hi_val = arr[i]; //reset hi_val
		
		System.out.print("High value in array -> ");
		System.out.println(hi_val);
		
		//check for lowest value
		for(int i = 1; i<arr.length;i++)
			if(arr[i] < low_val)
				low_val = arr[i]; //reset low_val
		
		System.out.print("Lowest value in array -> ");
		System.out.println(low_val);
		
		//average the array
		//sum += arr[0];  //alternative summation (not recommended with array)
		//sum += arr[1]; 
		
		for(int i = 0; i<arr.length;i++)
			sum+=arr[i];
		//display average
		average = sum/arr.length;
		System.out.printf("Average of array -> %.2f" , average);
		
		
		
	}

}