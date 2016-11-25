import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Sample1
{

	public Sample1()
	{
		System.out.println("here in constructor");
		
	}
	
    public static void method1(int[] arr) {
        
        // first create int array...
        int[] arrayChecker = new int[10];
        // first initialize....
        for (int i = 0; i < 10; i++) {
            arrayChecker[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            int index = arr[i]-1;
            //System.out.print( " before " + arrayChecker[index]);
            arrayChecker[index] = arrayChecker[index]+1;
            //System.out.print( " after " + arrayChecker[index]);
        }
        

        // now print...
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arrayChecker[i] + " ");
        }       
        
        return;
    }
    
	public static int[] fibodigitarray = new int[1000];
    
   /*
    *         int t = 1;
        // One by one run for all input test cases
        while (t > 0)
        {
            int n = 468;
            // Compute and print result
            fibonaccidigits(n);
            t--;
        }
		
    */
   public static void fibonaccidigits(int n) {
	   
        if (n < 0) return;
        if (n == 0) return;

         double d = (n * Math.log10(1.6180339887498948)) -
                ((Math.log10(5)) / 2);

        System.out.println("d is "+ (int)Math.ceil(d));
           
        return;
    }
	

	public static void main(String [] args)
	{

		StringInterviewQuestions siq = new StringInterviewQuestions();
		
		// 1.1 Implement an algorithm to determine if a string has all unique characters 
		//What if you can not use additional data structures?
		//String testString = "abca";
		//boolean result = siq.checkString(testString);
		//System.out.println("result is :" +  result);

		//String inputString1 = "abbcccbbddd";
		//char[] inputString = inputString1.toCharArray();
		
		//siq.removeDuplicates(inputString);
		
		/*int arr[] = {10, 7, 8, 9, 1, 5};
		int n = arr.length;

		//QuickSort ob = new QuickSort();
		//ob.sort(arr, 0, n-1);
        selectionSort(arr);
		
		System.out.println("sorted array");
		printArray(arr);
		*/
        System.out.println(binarySearch(25));
		
		
		System.out.println("finished");
	}
	
	public static int binarySearch(int value) {
		
		int arr[] = {1, 5, 10, 25, 35, 55, 90};
		
		Arrays.sort(arr);
		
		int low = 0;
		int high = arr.length-1;
		
		while (low <= high) {
			
			int mid = (low+high)/2;
			
			if (value > arr[mid]) {
				low = mid+1;
			}
			else if (value < arr[mid]) {
				high = mid -1;
			}
			else if (value == arr[mid]) {
				return arr[mid];
			}
		}
		
		return -1;
	}
	
	
	public static int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}

	public static int[] twoSum1(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	
	void sort(int arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
	
	   static void selectionSort(int arr[]) {
		   
		   for (int i = 0; i < arr.length-1; i++) {
			   
			   int min_idx = i;
			   
			   for (int j = i+1; j < arr.length; j++) {
				   
				   if (arr[min_idx] > arr[j]) {
					   System.out.println("min/-idx "+ min_idx+ " ,i " + i + ", j "+ j);
					   min_idx = j;
				   }
			   }
			   
	            // Swap the found minimum element with the first
	            // element
	            int temp = arr[min_idx];
	            arr[min_idx] = arr[i];
	            arr[i] = temp;
			   
		   }
		   
		   
	   }

		/* A utility function to print array of size n */
		static void printArray(int arr[])
		{
			int n = arr.length;
			for (int i=0; i<n; ++i)
				System.out.print(arr[i]+" ");
			System.out.println();
		}

	
	/*
	 * use the following code for geeksforgeeks website...
	 * 
	   public static void main (String[] args)
	    {
	        // Note that size of arr[] is considered 100 according to
	        // the constraints mentioned in problem statement.
	        int[] arr = new int[100];
	 
	        // Input the number of test cases you want to run
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	 
	        LinearSearch lse = new LinearSearch();
	        
	        // One by one run for all input test cases
	        while (t > 0)
	        {
	            // Input the size of the array
	            int n = sc.nextInt();
	 
	            // Input the array
	            for (int i = 0; i < n; i++)
	                arr[i] = sc.nextInt();
	 
	            // Input the element to be searched
	            int x = sc.nextInt();
	 
	            // Compute and print result
	            
	            System.out.println(lse.search(arr, n, x));
	 
	            t--;
	        }
	    }
	    
	    */
}