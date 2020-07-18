package triplet;
import java.util.*;


public class triplet  {
	static void abc(int arr[], int n ) {
		Arrays.sort(arr);
	for( int i=n-1;i>=0;i++) {
		int j =0;
		int k =i-1;
		while(j<k){
		if(arr[i]==arr[j]+arr[k]) {
			System.out.println(arr[i] + "is found by adding"+ arr[j]+" " + arr[k]);
			return; } 
		else if(arr[i]>arr[j]+arr[k])
			j++;
		else
			k--;
	}
	}

	System.out.println("No triplet found");
	}
	public static void main(String[] args) {
	int arr[]= {2,3,4,4,87,12,34,2,3,5};
	int n=arr.length;
	abc(arr, n);
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}















}
