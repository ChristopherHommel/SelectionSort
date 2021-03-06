/**
 * An implementation of a selection sort alogrithm
 * @author Christopher
 *
 */
public class SelectionSort {

	public static void main(String[] args) {

		}
	
	/**
	 * Find the minimum values in the array and place them inorder
	 * @param array an array to be sorted
	 */
	public void sort(int[] array) {
		if(array == null) {
			return;
		}
		int arrayLength = array.length;
		
		//Move through the array one element at a time
		for (int i = 0; i <= arrayLength - 1; i++) {
			//Get the minimum element in the array
			int minimumElement = i;
			for(int j = i+1; j<=arrayLength-1;j++) {
				//Find the minimum index to insert this element
				if(array[j] < array[minimumElement]) {
					minimumElement = j;
				}
				
				//Swap the elements with the correct position in the array
				int tempPoint = array[minimumElement];
				array[minimumElement] = array[i];
				array[i] = tempPoint;
			}
		}
	}

}
