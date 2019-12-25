package signintestsuite;

public class CountAndSumInCycle {

    public static void main(String[] args) {
        int[] array = new int[100];
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }

        System.out.println(sum(array));
        System.out.println(count(array));
    }

        static int sum(int[] array){
        int sum = 0;
            for(int i = 0; i < array.length; i++){
                if(i % 2 == 0){
                    sum += i;
                    System.out.print(" ");
                }
            }
            return sum;
        }

    static int count(int[] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(i % 2 == 0){
                count += 1;
            }
        }
        return count;
    }


}
