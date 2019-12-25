package signintestsuite;

public class Fibonachi {

    public static void main( String[] args) {
        int[] fibonachiArray = new int[10];
        fibonachiArray[0] = 0;
        fibonachiArray[1] = 1;

        for(int i = 2; i < fibonachiArray.length; i++) {
            fibonachiArray[i] =  fibonachiArray[i - 2] + fibonachiArray[i - 1];
        }

        for (int i = 0; i < fibonachiArray.length; i++) {
            System.out.print(fibonachiArray[i] + " ");
        }

    }
}
