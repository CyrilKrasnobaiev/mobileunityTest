package signintestsuite;

import java.util.ArrayList;

public class DelimiterNumbers {

    public static void main(String[] args){
        delimiterList(40).stream().forEach(System.out :: println);
    }

    static ArrayList<Integer> delimiterList(int number) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
