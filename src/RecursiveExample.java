public class RecursiveExample {

    public void teachMeRecursion(int howManyTimesDoIHaveToSayThis) {

        // This is code that runs BEFORE the recursive call
        // Pay attention to the number that gets output each time
        System.out.println("I'm telling you for the " + howManyTimesDoIHaveToSayThis + " time that exit conditions are important for recursion to work properly!");

        // Check to see if we met the exit condition yet
        if (howManyTimesDoIHaveToSayThis > 1) {
            // Make a recursive call to this same function but with 1 less value
            teachMeRecursion(howManyTimesDoIHaveToSayThis - 1);
        }
        else {
            // This will ONLY run when the exit condition is met.
            System.out.println();
            System.out.println("AHA! Eureka!  I finally get it! You can stop calling me over and over now!");
            System.out.println();
        }

        // This will run AFTER each recursive call
        // Pay attention to the number that gets output each time.
        System.out.println("Ok Dad!  I get it... You've told me the same thing " + howManyTimesDoIHaveToSayThis + " times!");
    }

    public static void main(String[] args) {

        RecursiveExample example = new RecursiveExample();

        example.teachMeRecursion(10);
    }
}