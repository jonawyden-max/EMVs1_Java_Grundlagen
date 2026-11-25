import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hallo");
        System.out.println("Du musst gleich einen Code eingeben, dann kommt die rückmeldung");
        System.out.println("Zuerst kommt dein code, darunter kommen die zahlen 0, 1 oder 2");
        System.out.println("0 = Nicht im Code, 1 = Vorhanden aber falsche stelle und 0 = richtige zahl richtige stelle");

        Random randomGenerator = new Random();
        int randomNumber1 = randomGenerator.nextInt(1,10);
        int randomNumber2 = randomGenerator.nextInt(1,10);
        int randomNumber3 = randomGenerator.nextInt(1,10);
        int randomNumber4 = randomGenerator.nextInt(1,10);


        int anzahlVersuche = 1;

        String case1 = "a";
        String case2 = "a";
        String case3 = "a";
        String case4 = "a";

        int guessedNumber1 = 0;
        int guessedNumber2 = 0;
        int guessedNumber3 = 0;
        int guessedNumber4 = 0;

        boolean richtigerCode = false;

        while (anzahlVersuche <= 10 && !richtigerCode) {

            Scanner userInput1 = new Scanner(System.in);

            System.out.println("");

            System.out.print("Enter your 1.Number: ");
            guessedNumber1 = userInput1.nextInt();

            System.out.print("Enter your 2.Number: ");
            guessedNumber2 = userInput1.nextInt();

            System.out.print("Enter your 3.Number: ");
            guessedNumber3 = userInput1.nextInt();

            System.out.print("Enter your 4.Number: ");
            guessedNumber4 = userInput1.nextInt();


            System.out.print(anzahlVersuche + "\t");
            System.out.print(guessedNumber1);
            System.out.print(guessedNumber2);
            System.out.print(guessedNumber3);
            System.out.print(guessedNumber4);

            if (guessedNumber1 == randomNumber1){
                case1 = "✔";
            } else if (guessedNumber1 == randomNumber2 || guessedNumber1 == randomNumber3 || guessedNumber1 == randomNumber4) {
                case1 = "❌";
            } else{
                case1 = "";
            }

            if (guessedNumber2 == randomNumber2){
                case2 = "✔";
            } else if (guessedNumber2 == randomNumber1 || guessedNumber2 == randomNumber3 || guessedNumber2 == randomNumber4) {
                case2 = "❌";
            } else{
                case2 = 0;
            }

            if (guessedNumber3 == randomNumber3){
                case3 = "✔";
            } else if (guessedNumber3 == randomNumber1 || guessedNumber3 == randomNumber2 || guessedNumber3 == randomNumber4) {
                case3 = "❌";
            } else{
                case3 = 0;
            }

            if (guessedNumber4 == randomNumber4){
                case4 = "✔";
            } else if (guessedNumber4 == randomNumber1 || guessedNumber4 == randomNumber2 || guessedNumber4 == randomNumber3) {
                case4 = "❌";
            } else{
                case4 = 0;
            }

            System.out.print("\n \t");
            System.out.print(case1);
            System.out.print(case2);
            System.out.print(case3);
            System.out.print(case4);

            anzahlVersuche += 1;

            if (randomNumber1 == guessedNumber1 && randomNumber2 == guessedNumber2 &&
                    randomNumber3 == guessedNumber3 && randomNumber4 == guessedNumber4){
                richtigerCode = true;
            }

        }

        if (richtigerCode == true) {

            System.out.println("You cracked the Code.");
            System.out.println("You tried it " + anzahlVersuche + " times.");

        } else if (anzahlVersuche > 10) {

            System.out.println("");
            System.out.println("To many tries!");
            System.out.println("The Police got you!");
            System.out.print("The corect Code would be: ");
            System.out.print(randomNumber1);
            System.out.print(randomNumber2);
            System.out.print(randomNumber3);
            System.out.print(randomNumber4);

        }else{
            System.out.println("Something went wrong");
        }



    }
}