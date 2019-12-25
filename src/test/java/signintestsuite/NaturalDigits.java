package signintestsuite;

import java.util.ArrayList;

public class NaturalDigits {

    public static void main(String[] args){

        naturalList(1024).stream().forEach(System.out::println);
    }

    public static ArrayList<Integer> naturalList(int n){

        ArrayList<Integer> list = new ArrayList<>(n);

        for (int i = 1; i < n; i++) {
            if(i*i <= n) {
                list.add(i);
            }
        }
        return list;
    }
}
