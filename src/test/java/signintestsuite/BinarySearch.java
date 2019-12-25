package signintestsuite;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] array, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while(firstIndex <= lastIndex) {
            int midIndex = (firstIndex + lastIndex)/2;
            if (elementToSearch == array[midIndex]) {
                return midIndex;
            }
            else if(elementToSearch > array[midIndex]) {
                firstIndex = midIndex + 1;
            }
            else if(elementToSearch <  array[midIndex]) {
                lastIndex = midIndex - 1;
            }
        }
        return  -1;
    }

    public static void printIndex(int elementToSearch, int index){
        if(index == -1){
            System.out.println(elementToSearch + " isn't found");
        }
        else {
            System.out.println(elementToSearch + " number index is - " + index);
        }
    }

    public static void main(String[] args) {
        int[] array = {88, 2, 66, 7, 10, 44, 12, 3, 55, 89};
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int index = binarySearch(array, 3);
        printIndex(3 , index);
    }
}
