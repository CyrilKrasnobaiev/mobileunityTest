package signintestsuite;

public class MisplaceElementsInArray {

    public  static void main(String[] args) {
        String[] array = {"first", "second", "third", "fourth", "fifth"};
        String temp;
        for (int i = 0; i < array.length/2; i++) {
                temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
