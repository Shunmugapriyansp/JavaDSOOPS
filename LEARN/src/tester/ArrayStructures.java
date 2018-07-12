package tester;

import java.util.Arrays;

public class ArrayStructures {
	private int[] theArray = new int[10];
	private int arraySize;

	public ArrayStructures(int arraySize) {
		this.arraySize = arraySize;
	}

	public void generateArray() {
		for (int i = 0; i < theArray.length; i++) {
			theArray[i] = (int) (Math.random() * 10 + 10);
			// System.out.println(theArray.toString());
		}

	}

	public void printArray() {
		System.out.println("----------");
		for (int i = 0; i < arraySize; i++) {
			System.out.println("| " + i + " | " + theArray[i] + " |");
			System.out.println("----------");
		}
	}

	public int getValueAtIndex(int arrayIndex) {
		if (arrayIndex < arraySize) {
			System.out.println("-----Printing getValueAtIndex-----");
			System.out.println("| " + arrayIndex + " | " + theArray[arrayIndex]
					+ " |");
			System.out.println("----------");
			return theArray[arrayIndex];
		} else {
			return 0;
		}
	}

	public Boolean isElementPresentInArray(int theArrayValue) {
		for (int i = 0; i < arraySize; i++) {
			if (theArray[i] == theArrayValue) {
				System.out.println("-----Printing getValueAtIndex-----");
				System.out.println("The Element " + theArrayValue
						+ " is Present in the array at index " + i);
				System.out.println("----------");
				return true;
			}
		}
		System.out.println("-----Printing getValueAtIndex-----");
		System.out.println("The Element " + theArrayValue
				+ " is NOT Present in the array");
		System.out.println("----------");
		return false;
	}

	public void deleteValueAtIndex(int arrayIndex) {
		if (arrayIndex < arraySize) {
			for (int i = arrayIndex; i < arraySize; i++) {
				theArray[i] = theArray[i + 1];
			}
			arraySize = arraySize - 1;
		}
	}

	public static void main(String[] args) {
		// int[] newarr1;
		ArrayStructures newArray = new ArrayStructures(10);
		// ArrayStructures newArray1= new ArrayStructures(10, newarr1[10]);

		newArray.generateArray();
		newArray.printArray();
		newArray.getValueAtIndex(3);
		newArray.isElementPresentInArray(11);
		// newArray.deleteValueAtIndex(0);
		newArray.printArray();
		/**
		 * SortDefault Methods //Arrays.sort(newArray.theArray);
		 * //newArray.printHorizontalArray(0,9); // newArray.BubbleSort();
		 * newArray.selectionSort();
		 */
		newArray.insertionSort();
		System.out.println(Arrays.hashCode(newArray.theArray));

		// newArray.binarySearch(20);
		// TODO Auto-generated method stub

	}

	public void BubbleSort() {
		for (int i = arraySize - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (theArray[j] > theArray[j + 1]) {
					// if (theArray[j]<theArray[j+1]){ //for Descending
					swap(j, j + 1);
					printHorizontalArray(i, j);
				}
				printHorizontalArray(i, j);
			}
		}
	}

	public void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp;
		temp = theArray[i];
		theArray[i] = theArray[j];
		theArray[j] = temp;
	}

	public void binarySearch(int value) {
		int lowindex = 0;
		int highindex = arraySize - 1;
		while (lowindex <= highindex) {
			int middleIndex = (lowindex + highindex) / 2;
			// 0+1=1; 0+2= 1
			if (theArray[middleIndex] < value) {
				if (theArray[highindex] > value) {
					lowindex = middleIndex + 1;
				} else {
					System.out.println("\n No Match Found");
					break;
				}

			} else if (theArray[middleIndex] > value) {
				if (theArray[lowindex] < value) {
					highindex = middleIndex - 1;
				} else {
					System.out.println("\n No Match Found");
					break;
				}

			} else {
				System.out.println("\n Match Found " + value + " at index "
						+ middleIndex);
				// To exit loop
				lowindex = highindex + 1;
			}
			printHorizontalArray(middleIndex, -1);
		}

	}

	public void printHorizontalArray(int i, int j) {
		String arrIndexes = "| ";
		String arrvalues = "| ";
		String dashes = "--";
		System.out.print("\n  ");
		for (int k = 0; k < arraySize; k++) {
			if ((k == i) || (k == j)) {
				System.out.print("  " + k + "  ");
			} else {
				System.out.print("    ");
			}
			arrIndexes = arrIndexes + " " + k + " | ";
			arrvalues = arrvalues + theArray[k] + " | ";
			dashes = dashes + "-----";
		}
		System.out.println("\n" + dashes);
		System.out.println(arrIndexes);
		System.out.println(dashes);
		System.out.println(arrvalues);
		System.out.println("Print Arrays " + Arrays.toString(theArray));

	}

	public void selectionSort() {

		System.out
				.println("-------------- Starting Selection Sort---------------");
		for (int x = 0; x < arraySize; x++) {
			if (x == 0) {
				System.out.println("---- Printing Default Array---------");
				printHorizontalArray(x, -1);
			}
			int min = x;
			for (int y = x; y < arraySize; y++) {
				if (theArray[y] < theArray[min])
					min = y;
			}
			swap(x, min);
			printHorizontalArray(x, -1);
		}
		System.out
				.println("-------------- Ending Selection Sort---------------");
	}

	public void insertionSort() {
System.out.println(Arrays.toString(theArray));
		for (int i = 1; i < arraySize; i++) {
			int j = i;
			int toInsert = theArray[i];
			while ((j > 0) && (theArray[j - 1] > toInsert)) {
				theArray[j] = theArray[j - 1];
				j--;
				printHorizontalArray(i, j);
			}
			theArray[j] = toInsert;
			printHorizontalArray(i, j);
			System.out.println(theArray[i] + " , " + theArray[j] + " , "
					+ toInsert);
		}

	}

}
