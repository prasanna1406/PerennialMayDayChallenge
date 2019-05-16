import java.util.*;
public class Dev1 {

	public static void main(String[] args) {

	Scanner in = new Scanner(System.in);		
	try{
		System.out.println("Enter test case count : ");
		int testCaseCount = in.nextInt();
		if(testCaseCount<0){
	   		System.out.println("invalid input for test case");
		}
		for(int i=0;i<testCaseCount;i++) {
	    		System.out.println("Enter size of array : ");
			int arraySize = in.nextInt();

			if(arraySize<0){
  	                      System.out.println("invalid input for size of array");
        	        }

			System.out.println("Enter expected sum of array : ");
                        int exptSum = in.nextInt();

			int[] arr = new int[arraySize];
			for(int j=0;j<arraySize;j++) {
				System.out.println("Enter element to array ");
                        	arr[j] = in.nextInt();
			}
			
			System.out.println("Elementes of array : "+ Arrays.toString(arr));

			findSum(arr, exptSum);
		}



	}catch(Exception e) {
		System.out.println("exception occured");
	}
	}

	public static void findSum(int[] arr, int exptSum) {
		int sum = 0;
		int firstIndex = 0;
		int lastIndex = 0;
		boolean isFound = false;
		for(int i=0;i<arr.length;i++){
			firstIndex = i+1;
			for(int j=i;j<arr.length;j++){
				sum += arr[j];
                        	if(sum == exptSum){
					lastIndex=j+1;
					isFound = true;
					break;
				}
			}
			if(isFound){
				break;
			}
		}
		if(!isFound){
			System.out.println("-1");
		} else {
			System.out.println("Start postion : "firstIndex + " End Position : " + lastIndex);
		}
	}

}
