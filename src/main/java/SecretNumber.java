import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {

//  Prompt user to guess the secret number
        System.out.println("Can you guess the last number in the lock combination Sherlock?,It's from 1-20 type it in below!");

//  Collect user input/Create scanner object
        Scanner reader = new Scanner(System.in);
        int secret_Number = Integer.parseInt(reader.nextLine());

//  Create response for when secret number is found
        if (secret_Number==(13)){
            System.out.println("ELEMENTARY WATSON, YOU FOUND IT!!!");
//  Create ranges and response for wrong number
        } else if (secret_Number < 13){
            System.out.println("Not quite old boy, you fell too short!");
        } else if (secret_Number > 13){
            System.out.println("Oh dear, you're shooting far too high!");
        }if (reader.nextInt() == 13){
            main(null);
        }



    }
}
