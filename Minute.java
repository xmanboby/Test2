package Test2;

public class Minute {

    public int firstRowOfMinutes(int multipleMinutes){

        while (multipleMinutes - 5 >= 0) {
            System.out.print("M");

            multipleMinutes -=5;
        }

        return multipleMinutes;

    }

}
