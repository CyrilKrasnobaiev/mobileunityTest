package signintestsuite;

public class SimpleNumber {

    public static void main(String[] args){
        System.out.println(isSimpleNumber(10));
    }

    public static boolean isSimpleNumber(int simpleNumber){
        if(simpleNumber % simpleNumber == 0 && simpleNumber % 1 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
