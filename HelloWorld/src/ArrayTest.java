public class ArrayTest {


	public void testTheArray(int[] array) {
		 double[] myList = {1.9, 2.9, 3.4, 3.5};
		 
		 for(int i = 0; i<myList.length; i++) {
		 System.out.println(myList[i] + " ");	
		 }
		 double total = 0;
		 for (int i = 0; i < myList.length; i++) {
		    total += myList[i];
		 }
		 System.out.println("Total is " + total);

		 // Finding the largest element
		 double max = myList[0];
		 for (int i = 1; i < myList.length; i++) {
		    if (myList[i] > max) max = myList[i];
		 }
		 System.out.println("Max is " + max); 
		 
		 for(double element: myList) {
			 System.out.println(element);
		 }
		 System.out.print("\nTestTheArray1 -> ");
		 for (int i = 0; i < array.length; i++) {
		      System.out.print(array[i] + " ");
		   }
		 
	}
	public static void testTheArray2(int[] array) {
		System.out.print("\nTestTheArray2 -> ");
		for (int i = 0; i < array.length; i++) {
		      System.out.print(array[i] + " ");
		   }
	}
	
	public static int[] reverseTheArray(int[] array) {
		System.out.print("\nReversedTheArray");
		int[] result = new int[array.length];
		
		 for (int i = 0, j = result.length - 1; i < array.length; i++, j--) {
		      result[j] = array[i];
		   }
		  return result;
		
	}
}
