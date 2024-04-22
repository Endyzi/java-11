import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String question = "What is the largest planet in our solar system?";
        String choiceOne = "earth";
        String choiceTwo = "jupiter";
        String choiceThree = "saturn";

        String correctAnswer = choiceTwo;
        //Write a print statement asking the question
        System.out.println(question);

        //Write  print statement giving the answer choices
        System.out.println("Choose one of the following: " + choiceOne + ", " + choiceTwo + ", or " + choiceThree + ".");

        //Have the user input an answer
        Scanner scanner = new Scanner(System.in);
        //Retrieve the user's input
        String input = scanner.next();

        //If the user's input matches the correctAnswer...
        //then the user is correct and we want to print out a congrats message to the user.
        //I added toLowerCase after the input, because i realized people could type the correct answer with a lowercase or uppercase and still get the error message, this way I will reformat Uppercases to lowercases.
        if (correctAnswer.equals(input.toLowerCase())) {
            System.out.println("Congrats! That's the correct answer");
        } else {
            System.out.println("You are incorrect. The correct answer is " + correctAnswer);
        }
        //If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect.

    }
}
