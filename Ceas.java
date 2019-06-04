package Test2;

public class Ceas {

    public static void main(String[] args) {

        Ora firstHour = new Ora();
        Ora2 secondHour = new Ora2();
        Minute firstMinute = new Minute();
        Minute2 secondMinute = new Minute2();
        Secunde secunde = new Secunde();

        secunde.setSeconds(13);
        firstHour.firsRowOfHours(4);
        secondHour.secondRowOfHours(4);
        firstMinute.firstRowOfMinutes(6);
        System.out.println();
        secondMinute.secondRowOfMinutes(6);


        System.out.println();
    }
}