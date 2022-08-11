import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {

// Prompt user to guess the secret number
        System.out.println("Can you guess the secret number from 1 to 20?, type it in below!");

// Collect user input/Create scanner object
        Scanner reader = new Scanner(System.in);
        int Secret_Number = Integer.parseInt(reader.nextLine());

// Create response for when secret number is found
        if (Secret_Number==(13)){
            System.out.println("ELEMENTARY WATSON, YOU FOUND IT!!!");
// Create ranges and response for wrong number
        } else if (Secret_Number < 13){
            System.out.println("Not quite old boy, you fell too short!");
        }


// LOOP


    }
}
