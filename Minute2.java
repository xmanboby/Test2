package Test2;

public class Minute2 {
    public int secondRowOfMinutes(int multipleMinutes){

        for (int i = 1; i <= multipleMinutes %5; i++) {
            System.out.print("m");
        }
        return multipleMinutes;
    }
}