package signintestsuite;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {2, 4, 6, 8, 1, 2, 8, 2, 4, 8, 9, 1, 21, 33, 14};

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1; j++){
                if(array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
    }
}
