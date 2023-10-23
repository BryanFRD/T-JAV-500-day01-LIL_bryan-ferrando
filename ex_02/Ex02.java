package ex_02;

public class Ex02 {

    public static String getAngryDog(int nbr){
        String dog = "";
        for(int i = 0; i < nbr; i++){
            dog += "woof";
        }
        dog += "\n";
        return dog;
    }

}
