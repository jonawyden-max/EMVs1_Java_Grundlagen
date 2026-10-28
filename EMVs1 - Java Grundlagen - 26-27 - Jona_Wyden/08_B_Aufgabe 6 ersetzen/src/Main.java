import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Aufgabe bis jetzt
        //
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


        //Was ich machen würde

        //06. You want to develop a game on with you can play multiplayer and singelplayer.
        //    now creat you have to fix a bug so that you can only play multiplayer or singelplayer but not at the same time.

        //    important you can only youse xor

        //if both are true print out an error and a massig
        //else print a messig

        System.out.println("Exercise 06");

        //Your code right hear





        //Lösung

        boolean playSingelplayer;
        boolean palyMultiplayer;

        Scanner scannerExercise1 = new Scanner(System.in);
        System.out.println("Do you want to play Singelplayer? (true or false)");
        goToBeach = scannerExercise1.nextBoolean();

        Scanner scannerExercise2 = new Scanner(System.in);
        System.out.println("Do you want to play Multiplayer? (true or false)");
        goToMountains = scannerExercise2.nextBoolean();

        if (palyMultiplayer ^ playSingelplayer){
            if (palyMultiplayer){
                System.out.println("Have fun with your Friends!");
            }else{
                System.out.println("Have fun!");
            }
        }else{
            if (playSingelplayer){
                System.out.println("Error \n You can not play with your Friends and alone.");
            }else{
                System.out.println("Dont you wanne play?");
            }
        }

    }
}