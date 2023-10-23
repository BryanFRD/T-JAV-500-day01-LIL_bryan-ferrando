package ex_05;

import java.util.ArrayList;
import java.util.Arrays;

class Ex05 {

    public static ArrayList<String> myGetArgs(String... var){
        return new ArrayList<String>(Arrays.asList(var));
    }

}
