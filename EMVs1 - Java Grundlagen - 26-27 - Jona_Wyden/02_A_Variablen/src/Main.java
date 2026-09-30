public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // Naming

        //helo
        //it is working

        // Which are valid variable names and which are not?
        // Try to determine what is valid and what is not without uncommenting the code.
        // If something is not valid, write a comment explaining why it is not valid.

        // Example:
        // int myVariable; // Valid
        // int %myVariable; // Not Valid, starts with a special character.


        // int 1stNumber; //vailid

        // int firstNumber; //vailid

        // int tryThisNumber; //vailid

        // int _myNumber; //vailid

        // int int; //not vailid

        // int _number_; //vailid

        // int i; //vailid

        // int number1; //vilid

        // int .product; //not vailid

        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Naming convention

        // Which are recommended variable names and which are not?

        // Example:
        // int myVariable; // recommended
        // int _myVariable; // not recommended, starts with a special character
        // int g; // not recommended, depending on the context, it can make sense. E.g. in the context of gravitational acceleration

        int number1; //recommended
        int speed; //recommended
        int JustANUmber; //not recommended
        int justAnotherNumber; //not recommended
        int _weather; //not recommended
        int $Money; //not recommended
        int moneyinthebankaccount; //not recommended
        int aLotOfmoneyonbankAccount; //not recommended
        int circumstanceEarthInKM; //recommended
        int circumstanceEarth_KM; //recommended

        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Declaration and initialization of variables

        // Add the appropriate data type before the variable name, so, that it becomes a valid declaration and initialization.
        // (Variable names are in german to not reveal the result)

        float meineGleitkommaZahl = 23.5f;

        byte meineSehrKleineGanzzahl = 50;

        char meinUnicodeZeichen = '\u003D';

        short meineKleineGanzzahl = 200;

        char meinBuchstabe = 'B';

        System.out.println(meinBuchstabe);

        float meineNegativeGleitkommaZahl = -14.612f;

        double meineGrosseGleitkommaZahl = 50.1234567890123F;

        boolean meinWahrheitswert1 = false;

        int meineNormaleGanzzahl = 50_000;

        long meineGrosseGanzzahl = 123_456_789_012_345L;

        boolean meinWahrheitswert2 = true;


        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Keyword final

        // Based on the variable name/value, decide if the keyword "final" is suitable or not.
        // If it is suitable, apply the recommended naming convention for variables with the "final" keyword.
        // Write -why- you decided to either mark it as final or not.


        int moneyInBankAccount = 100_000;//beacaus it is a hight neautrel nummber

        short myBirthyear = 2001; //becaus its a year

        byte amountOfMonths = 12; //becous its an easy nummber

        float gravityForce = 9.81f; //becaus it is not an natural nummber

        byte amountOfMinutesPerHour = 60; //becaus it is a litel number

        short amountOfSecondsPerHour = 3600; //becous it is a hight nummber

        float pi = 3.14159f; //becaus it is a nummber with floating point nummbers

        short amountOfStudents = 167; //beacous it is an neutrel litel nummber

        System.out.println("Ende des Auftrags");

        //--------------------------------------------------------------------------------------------------------------
    }
}
