package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class firstArray {
    public static void main (String [] args) {
        ArrayList<String> animais = new ArrayList<>(Arrays.asList("cachorro", "gato"));
        animais.add("cavalo");
        System.out.println(Arrays.toString(animais.toArray()));
        animais.add("égua");
        System.out.println(Arrays.toString(animais.toArray()));

    } 
}
