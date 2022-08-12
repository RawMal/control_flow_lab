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
        } else if (weatherCondition.equalsIgnoreCase("Sunny") && tempReading <= 16) {
            System.out.println("Wear a nice Jumper or a thin jacket if it's not summer!");

            //RAIN
    } else if (weatherCondition.equalsIgnoreCase("raining") && tempReading >= 14) {
            System.out.println("Just an Umbrella it is too warm for a coat!");
        } else if (weatherCondition.equalsIgnoreCase("raining") && tempReading <= 14) {
            System.out.println("Raincoat and Wellie Boots, Don't forget your umbrella!");

            //SNOW
            

    }
}

  //if (weatherAdvice.equals("sunny")){
   //       System.out.println("Shorts and Shades, Suns out guns out!");
   //       } else if (weatherAdvice.equals("raining")){
    //      System.out.println("Raincoat and Wellie Boots, Don't forget your umbrella!");
  //        } else if (weatherAdvice.equals("snowing")) {
   //       System.out.println("I suggest a Scarf, big puffer jacket, boots and gloves!");
   //      }
