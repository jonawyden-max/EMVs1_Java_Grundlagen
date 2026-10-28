import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
       /*System.out.println("Exercise 01");
        // 01. Check if the two Strings below are the same with the "=="-operator.
        //     Print either true or false, depending on if they are the same or not.

        String s1 = "Hello";
        String s2 = "Hello";

        // Compare the strings here with  "=="
        if (s1 == s2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        //----
        // Read a user input and save it to another string called s3. The user should type in "Hello" (just like s1/s2).
        // Now compare s3 with s1. Is it still true?

        // Compare the strings here with  "=="
        Scanner userInput1 = new Scanner(System.in);
        System.out.println("Enter Hello:");
        String s3 = userInput1.nextLine();

        if(s2 == userInput1) {
            System.out.println("Yes, true1");
        }else{
            System.out.println("No1");
        }

        //----
        // Now instead of using the == operator, use "equals" and compare the
        // Strings again. What is the result now?

        if (s1 .equals(s2)){
            System.out.println("Yes3");
        }else{
            System.out.println("No3");
        }

        if (s1 .equals(s3)){
            System.out.println("Yes4");
        }else{
            System.out.println("No4");
        }

        // Compare the strings here with "equals"
        System.out.println();


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02. No coding needed. Check the program below. What do you have to type in the console when you are prompted
        //     by the scanner below so, that the output will be: "You clearly read the instructions carefully!"

        Scanner scannerExercise11 = new Scanner(System.in);
        System.out.println("Enter a string!");
        String inputExercise11 = scannerExercise11.nextLine();

        if(inputExercise11.equals("a string!")) {
            System.out.println("You clearly read the instructions carefully!");
        } else {
            System.out.println("Missed the chance!");
        }

        // Your answer here:
        //I dont know


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Ask a user for a number.
        Scanner scannerExercise2 = new Scanner(System.in);
        System.out.println("Type a Number:");
        String inputExercise2 = scannerExercise2.nextLine();
        int number = Integer.parseInt(inputExercise2);

        //       Check if the number is greater than 50 and smaller than 100 by using the &&-operator.
        if (number > 50 && number < 100){
            System.out.println("Your Nummber is between 50 and 100.");
        }else{
            System.out.println("Your Nummber is not between 50 and 100.");
        }
        //      If so, print "Number is between 50 and 100".
        //      If not, print "Number is not between 50 and 100".
        //      Test your program with reasonable values like 25, 75, 150


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Ask a user for a number.
        Scanner scannerExercise3 = new Scanner(System.in);
        System.out.println("Type a Number:");
        String inputExercise3 = scannerExercise2.nextLine();
        int number1 = Integer.parseInt(inputExercise2);
        //      Check, if the number is smaller than 50 or (inclusive or) greater than 100 by using the ||-operator.
        if (number1 > 50 || number1 < 100){
            System.out.println("Your Nummber is  not between 50 and 100.");
        }else{
            System.out.println("Your Nummber is between 50 and 100.");
        }
        //      If true, print that the number is out of the 50-100 bound.
        //      If false, print, that the number is in the 50-100 bound.
        //      Test your program with reasonable values like 25, 75, 150


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Use the variable to check if the variable is true or not in an if-statement using the "!"-operator.
        //      If the condition is true, print "Movie time!", else "Not watching a movie with lights on...");

        boolean lightsTurnedOff = true;
        if (lightsTurnedOff == !true){//false
            System.out.println("Not watching a movie with lights on.");
        }else{
            System.out.println("Movie time!");
        }


        // After implementing the solution above, use the shortform of if-else to reproduce the same output

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.  You're planning a weekend activity. You can either go to the beach or the mountains,
        //      but not both due to time constraints. You also can't stay home doing nothing.
        //      Create two booleans, "goToBeach" and "goToMountains".
        //      Ask the user the following two questions:
        //      "Do you want to go to the beach? (true or false)"
        //      "Do you want to go to the mountains? (true or false)"
        //      Assign the variables "goToBeach" and "goToMountains" the answers of the user input.

        //      Use an if-statement to check if you're going to exactly one destination, but not both or neither.
        //      If you're going to the beach, print "Packing sunscreen for the beach!"
        //      If you're going to the mountains, print "Bringing hiking boots for the mountains!"
        //      If you're either going to both places or nowhere, print "Invalid plans!"
        //          Check if the user wanted to go to both places or none.

        //          If the user wanted to go to the beach and the mountains,
        //          then print: "You can't go to both due to time constrains"

        //          If the user wanted to go neither to the beach nor the mountains
        //          then print: "Don't be lazy, let's go somewhere!"

        //      Solve this task with only an XOR, but not an OR or an AND.

        boolean goToBeach;
        boolean goToMountains;

        Scanner scannerExercise4 = new Scanner(System.in);
        System.out.println("Do you want to go to the beach? (true or false)");
        goToBeach = scannerExercise4.nextBoolean();

        Scanner scannerExercise5 = new Scanner(System.in);
        System.out.println("Do you want to go to the mountains? (true or false)");
        goToMountains = scannerExercise5.nextBoolean();


        //1. Variante mit XOR
        if (goToBeach ^ goToMountains){
            if (goToBeach){
                System.out.println("Packing sunscreen for the beach!");
            }else{
                System.out.println("Bringing hiking boots for the mountains");
            }
       }else{
            if (goToBeach){
                System.out.println("You can't go to both due to time constrains");
            }else{
                System.out.println("Don't be lazy, let's go somewhere!");
            }
       }

        //2. Variante mit and

        if (goToBeach == true && goToMountains == false){
            System.out.println("Packing sunscreen for the beach!");
        } else if (goToMountains == true && goToBeach == false) {
            System.out.println("Bringing hiking boots for the mountains!");
        } else if (goToBeach == true && goToMountains == true) {
            System.out.println("You can't go to both due to time constrains");
        }else{
            System.out.println("Don't be lazy, let's go somewhere!");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 07");

        // 07.  We are organizing a school field trip. Students can only attend if they meet specific criteria:
        //      - They must be in either the EMV's 1 or 2
        //      - They must have paid the trip fee and must not be sick recently
        //
        //      Ask the user to input the following information:
        //      - If the student is in EMV's 1, 2, 3 or 4 (as a number)
        //      - Whether the student have paid the trip fee (true or false)
        //      - Whether the student was sick recently (true or false)
        //
        //      Use the && operator and the || operator to check if the student meets all the criteria.
        //      If the student does, print "The student can attend the field trip!"
        //      If the student doesn't, print "The student cannot attend the field trip."
        //
        //      Hint: You might want to use brackets"()" to prioritize logic, but it is not necessary to do so.
        //
        //      Test your program with different combinations of inputs to ensure it works correctly.

        Scanner scannerExercise6 = new Scanner(System.in);
                System.out.print("In which EMV is the student (1, 2, 3 or 4)? ");
                int emvs = scannerExercise6.nextInt();

        Scanner scannerExercise7 = new Scanner(System.in);
                System.out.print("Has the student paid the trip (true/false)? ");
                boolean paidTrip = scannerExercise7.nextBoolean();

        Scanner scannerExercise8 = new Scanner(System.in);
                System.out.print("Was the student sick recently (true/false)? ");
                boolean isSick = scannerExercise8.nextBoolean();

                if (emvs == 1 || emvs == 2){
                    if (paidTrip == true){
                        if (isSick == false){
                            System.out.println("The student can attend the field trip!");
                        }else{
                            System.out.println("The student cannot attend the field trip.");
                        }
                    }else{
                        System.out.println("The student cannot attend the field trip.");
                    }
                }else{
                    System.out.println("The student cannot attend the field trip.");
                }

        *///Variante 2 mit abbrechen
        Scanner scannerExercise0 = new Scanner(System.in);
        System.out.print("In which EMV is the student (1, 2, 3 or 4)? ");
        int emvs1 = scannerExercise0.nextInt();

        if (emvs1 == 1 || emvs1 == 2){

            Scanner scannerExercise9 = new Scanner(System.in);
            System.out.print("Has the student paid the trip (true/false)? ");
            boolean paidTrip2 = scannerExercise9.nextBoolean();

            if (paidTrip2 == true){

                Scanner scannerExercise11 = new Scanner(System.in);
                System.out.print("Was the student sick recently (true/false)? ");
                boolean isSick1 = scannerExercise11.nextBoolean();

                if (isSick1 == false){
                    System.out.println("The student can attend the field trip.");
                }else{
                    System.out.println("The student cannot attend the field trip.");
                }

            }else{
                System.out.println("The student cannot attend the field trip.");
            }

        }else{
            System.out.println("The student cannot attend the field trip.");
        }




    }
}