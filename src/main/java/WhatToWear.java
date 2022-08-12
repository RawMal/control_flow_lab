import java.util.Scanner;

public class WhatToWear {
    public static void main(String[] args) {
// Prompt user to ask what to wear
        System.out.println("What is the weather outside? Enter the weather condition first then temperature and find out what you should wear!");
// Collect user input/ create scanner object
        Scanner reader = new Scanner(System.in);
        String weatherCondition = reader.nextLine();
        int tempReading = reader.nextInt();
// Create ranges and responses for weather conditions and temp
        //SUNNY
        if (weatherCondition.equalsIgnoreCase("sunny") && tempReading >= 17){
            System.out.println("Shorts and Shades, Suns out guns out!");

          //RAIN
        } else if (weatherCondition.equalsIgnoreCase("raining") && tempReading <= 14) {
            System.out.println("Raincoat and Wellie Boots, Don't forget your umbrella!");

          //SNOW
        } else if (weatherCondition.equalsIgnoreCase("snowing") && tempReading <= 5) {
            System.out.println("BRRRR, I suggest a Scarf, big puffer jacket, boots and gloves!");

          //CLOUDY
        } else if (weatherCondition.equalsIgnoreCase("cloudy") && tempReading <= 30) {
            System.out.println("This is the U.K, you should be used to it by now....");

         //WINDY
        } else if (weatherCondition.equalsIgnoreCase("windy") && tempReading <= 16) {
            System.out.println("Wind breaker and a cap will do you nice.");
        }


    }
}




