package signintestsuite;

public class LinearSearch {

    public static int linearSearch(int[] array, int searchElement){
        for (int i = 0; i < array.length; i++){
            if (searchElement == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void printIndex(int elementToSearch, int index){
        if(elementToSearch == -1){
            System.out.println(elementToSearch + " isn't found");
        }
        else {
            System.out.println(elementToSearch + " number index is - " + index);
        }
    }

    public static void main(String[] args){

        int[] array = {3, 3, 4, 1, 9, 5, 2, 1, 10, 0, 12, 33, 12};

        int index = linearSearch(array, 2);
        printIndex(2, index);
    }
}
