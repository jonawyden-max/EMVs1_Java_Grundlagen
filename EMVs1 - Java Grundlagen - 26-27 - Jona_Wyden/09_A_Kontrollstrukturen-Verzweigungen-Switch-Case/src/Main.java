import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        /*System.out.println("Exercise 01");
        // 01. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a number between 1 and 7.
        //     If the number is a 1, then print out Monday.  2 = Tuesday, 3 = Wednesday and so on until 7 = Sunday.
        //     Print "Not a weekday!" if it's not a number between 1-7.

        Scanner scannerExercise1_1 = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7");
        int numberWeek = scannerExercise1_1.nextInt();

        String Weekday = switch (numberWeek){
            case 1 ->"Mondey";
            case 2 ->"Tusday";
            case 3 ->"Wendsday";
            case 4 ->"Thursday";
            case 5 ->"Friday";
            case 6 ->"Saturday";
            case 7 ->"Sunday";
            default -> "Your nu0mber is not between 1 and 7!";
        };
        System.out.println(Weekday);

        String Weekday2;

        switch (numberWeek) {
            case 1:
                Weekday2 = "Monday";
                break;
            case 2:
                Weekday2 = "Tuesday";
                break;
            case 3:
                Weekday2 = "Wednesday";
                break;
            case 4:
                Weekday2 = "Thursday";
                break;
            case 5:
                Weekday2 = "Friday";
                break;
            case 6:
                Weekday2 = "Saturday";
                break;
            case 7:
                Weekday2 = "Sunday";
                break;
            default:
                Weekday2 = "Your number is not between 1 and 7!";
                break;
        }

        System.out.println(Weekday2);


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a Month (String). Based on the provided month, print out the corresponding season.
        //     Months: January, February, March, April, May, June, July, August, September, October, November, December
        //     Seasons: Winter, Spring, Summer, Autumn
        //     Example:  "January" -> "Winter"
        //     Example: "EMVs" -> "Not a month!";
        //     Write the old switch-statement so, that it only contains 4 breaks.

       Scanner scannerExercise2_1 = new Scanner(System.in);
        System.out.println("Enter a month as a number like 1 = Januar ore 12 = Dezember");
        int numberMonth = scannerExercise2_1.nextInt();

        String seasen = switch (numberMonth){
            case 1, 2, 12 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "This number is noch a Month";
        };
        System.out.println(seasen);


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Create a program that takes a month number (1-12) and prints the number of days in that month.
        //     Assume it's not a leap year.

        Scanner scannerExercise3_1 = new Scanner(System.in);
        System.out.println("Enter a month as a number like 1 = Januar ore 12 = Dezember");
        int numberMonth2 = scannerExercise3_1.nextInt();

        String MonthAndDay = switch (numberMonth2){
            case 1, 3, 5, 7, 8, 10, 12 -> "31 days";
            case 4, 6, 9, 11 -> "30 days";
            case 2 -> "28 days";
            default -> "You have to tipe a number";
        };

        System.out.println(MonthAndDay);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Create a basic role-playing game character class selector.
        //      Based on a number input, assign strength, agility, and intelligence values to a character.
        //      Example: "Select a class (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric): "
        //      User Input: 2
        //      Output: "Mage (Strength: 3, Agility: 4, Intelligence: 9)"

        System.out.println("Select a class:");
        System.out.println("1 - Warrior");
        System.out.println("2 - Mage");
        System.out.println("3 - Rogue");
        System.out.println("4 - Cleric");

        Scanner scannerExercise4_1 = new Scanner(System.in);
        System.out.println("Enter your choise hear:");
        int choice = scannerExercise4_1.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Warrior (Strength: 9, Agility: 5, Intelligence: 3)");
                break;
            case 2:
                System.out.println("Mage (Strength: 3, Agility: 4, Intelligence: 9)");
                break;
            case 3:
                System.out.println("Rogue (Strength: 5, Agility: 9, Intelligence: 4)");
                break;
            case 4:
                System.out.println("Cleric (Strength: 4, Agility: 5, Intelligence: 9)");
                break;
            default:
                System.out.println("Invalid choice! Please select a number from 1 to 4.");
                break;
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Solve this exercise with whatever switch you feel more comfortable (new or old).
        //      You can use all you know so far to solve this.
        //      Ask the user to translate a digit (0-9) (userInput 1)
        //      in another language (1-german, 2-english, 3-japanese) (user input 2).

        //      Example:
        //      "Which digit do you want to translate?" -> 7
        //      "In which language do you want to translate your digit?" -> 3
        //      Output: nana

        //      Help for japanese Numbers:
        //      0: zero
        //      1: ichi
        //      2: ni
        //      3: san
        //      4: shi
        //      5: go
        //      6: roku
        //      7: nana
        //      8: hachi
        //      9: kyuu
        //      default: Mukō na sūchi

        Scanner scannerExercise5_1 = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 9 you want to translate in another language:");
        int numberToTranslate = scannerExercise5_1.nextInt();

        Scanner scannerExercise5_2 = new Scanner(System.in);
        System.out.println("Cose the language you want to translate your number in 1 = german 2 = englisch 3 = japanes:");
        int language = scannerExercise5_2.nextInt();

        String numberInLanguage = "0";

        switch (language){
            case 1://german

                 numberInLanguage = switch (numberToTranslate){
                    case 0 -> "null";
                    case 1 -> "eins";
                    case 2 -> "zwei";
                    case 3 -> "drei";
                    case 4 -> "fier";
                    case 5 -> "fünf";
                    case 6 -> "sechs";
                    case 7 -> "sieben";
                    case 8 -> "acht";
                    case 9 -> "neun";
                    default -> "falsche dateneingabe";
                };

                break;
            case 2://englisch

                 numberInLanguage = switch (numberToTranslate){
                    case 0 -> "zero";
                    case 1 -> "one";
                    case 2 -> "two";
                    case 3 -> "three";
                    case 4 -> "four";
                    case 5 -> "five";
                    case 6 -> "six";
                    case 7 -> "seven";
                    case 8 -> "eight";
                    case 9 -> "nine";
                    default -> "Not corect data input";
                };

                break;
            case 3://japanes

                 numberInLanguage = switch (numberToTranslate){
                    case 0 -> "zero";
                    case 1 -> "ichi";
                    case 2 -> "ni";
                    case 3 -> "san";
                    case 4 -> "shi";
                    case 5 -> "go";
                    case 6 -> "roku";
                    case 7 -> "nana";
                    case 8 -> "hachi";
                    case 9 -> "kyuu";
                    default -> "Mukō na sūchi";
                };


                break;
            default:
                System.out.println("No Language for that number");
        }

        System.out.println(numberInLanguage);

     */   //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.   Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Write a small calculator. A user types in two numbers and an operation ('addition', 'subtraction', 'division', 'multiplication').
        //      Calculate the correct answer and print it out.
        //      Print a warning when the user tries to divide by 0 (Example: 2/0 -> number two must not be 0!

        Scanner scannerExercise6_1 = new Scanner(System.in);
        System.out.println("Enter a number you want to calculate with");
        int numberToCalculate1 = scannerExercise6_1.nextInt();

        Scanner scannerExercise6_2 = new Scanner(System.in);
        System.out.println("Enter a operation +, -, * or /:");
        String operation = scannerExercise6_2.next();

        Scanner scannerExercise6_3 = new Scanner(System.in);
        System.out.println("Enter a secend number you want to calculate with:");
        int numberToCalculate2 = scannerExercise6_3.nextInt();






        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Optional exercises");
        // 01.  Try to come up with a program on your own and the tools you
        //    know so far. Try to implement user input.

    }
}