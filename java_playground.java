// Java Exact Change

// import java.util.Scanner; 

// public class LabProgram {
//    public static void main(String[] args) {
//       Scanner scnr = new Scanner(System.in);
//       // System.out.println("Enter an amount");
//       int cents = scnr.nextInt();
//        if (cents == 0) {
//            System.out.println("No change");
//            }

//     //   Checks and mutates cents to get the smallest amount of coins
//         int numDollars = (cents / 100);
//         cents = cents - (numDollars * 100);
//         int numQuarters = (cents / 25);
//         cents = cents - (numQuarters * 25);
//         int numDimes = (cents / 10);
//         cents = cents - (numDimes * 10);
//         int numNickles = (cents / 5);
//         cents = cents - (numNickles * 5);
//         int numPennies = cents;
           
//         if(numDollars > 1){
//            System.out.println(numDollars + " Dollars");
//         } else if (numDollars == 1){
//            System.out.println(numDollars + " Dollar");
//         }

//         if(numQuarters > 1){
//             System.out.println(numQuarters + " Quarters");
//          } else if (numQuarters == 1){
//             System.out.println(numQuarters + " Quarter");
//          }

//          if(numDimes > 1){
//             System.out.println(numDimes + " Dimes");
//          } else if (numDimes == 1){
//             System.out.println(numDimes + " Dime");
//          }

//          if(numNickles > 1){
//             System.out.println(numNickles + " Nickels");
//          } else if (numNickles == 1){
//             System.out.println(numNickles + " Nickel");
//          }

//          if(cents > 1){
//             System.out.println(cents + " Pennies");
//          } else if (cents == 1){
//             System.out.println(cents + " Penny");
//          }


//         // System.out.println(numDollars + " Dollars");
//         // System.out.println(numQuarters + " Quarters");
//         // System.out.println(numDimes + " Dimes");
//         // System.out.println(numNickles + " Nickles");
//         // System.out.println(cents + " Pennies");

//    }
// }

// // 3.15 LAB: Warm up: Text message abbreviation decoder
// import java.util.Scanner;

// public class TextMsgAbbreviation {
//    public static void main(String[] args) {
//       Scanner scnr = new Scanner(System.in);
//       String userInput;

//       System.out.println("Input an abbreviation:");
//       userInput = scnr.nextLine();

//       if (userInput.equals("LOL")){
//          System.out.println("laughing out loud");
//       } else if (userInput.equals("IDK")){
//          System.out.println("I don't know");
//       } else if (userInput.equals("BFF")){
//          System.out.println("best friends forever");
//       } else if (userInput.equals("IMHO")){
//          System.out.println("in my humble opinion");
//       } else if (userInput.equals("TMI")){
//          System.out.println("too much information");
//       } else {
//          System.out.println("Unknown");
//       }
//    }
// }

// // 3.17 LAB: Seasons
// import java.util.Scanner; 

// // Change this below to make it compile right
// public class LabProgram {
//    public static void main(String[] args) {
//       Scanner scnr = new Scanner(System.in); 
//       String inputMonth;
//       int inputDay;
      
//       inputMonth = scnr.next();
//       inputDay = scnr.nextInt();

//       // inputDay = Integer.parseInt(inputStringDay);
//       // System.out.println(inputMonth + " " + inputDay);

//       // Checks if valid
//       if ((inputMonth.equals("January") || inputMonth.equals("Feburary") || inputMonth.equals("March") || inputMonth.equals("April") || inputMonth.equals("May") || inputMonth.equals("June") || inputMonth.equals("July") || inputMonth.equals("August") || (inputMonth.equals("September") && (inputDay <= 30)) || inputMonth.equals("October") || inputMonth.equals("November") || inputMonth.equals("December")) && ((inputDay > 0) && (inputDay <= 31))){
         
//          if ((inputMonth.equals("March") && inputDay >= 20) || inputMonth.equals("April") || inputMonth.equals("May") || (inputMonth.equals("June") && inputDay <= 20)){
//             System.out.println("Spring");
//          } else if ((inputMonth.equals("June") && inputDay >= 21) || inputMonth.equals("July") || inputMonth.equals("August") || (inputMonth.equals("September") && inputDay <= 21)){
//             System.out.println("Summer");
//          } else if ((inputMonth.equals("September") && inputDay >= 22) || inputMonth.equals("October") || inputMonth.equals("November") || (inputMonth.equals("December") && inputDay <= 20)){
//             System.out.println("Autumn");
//          } else if ((inputMonth.equals("December") && inputDay >= 21) || inputMonth.equals("January") || inputMonth.equals("Feburary") || (inputMonth.equals("March") && inputDay <= 19)){
//             System.out.println("Winter");
//          }
//       } 
//       else {
//          System.out.println("Invalid");
//       }
//    }
// }

// 3.16 LAB: Smallest number
// import java.util.Scanner;

// public class LabProgram {
//    public static void main(String[] args) {
//       Scanner scnr = new Scanner(System.in);
//       int choice1;
//       int choice2;
//       int choice3;

//       choice1 = scnr.nextInt();
//       choice2 = scnr.nextInt();
//       choice3 = scnr.nextInt();

//       if ((choice1 < choice2) && (choice1 < choice2)){
//          System.out.println(choice1);
//       } else if ((choice2 < choice1) && (choice2 < choice3)){
//          System.out.println(choice2);
//       } else {
//          System.out.println(choice3);
//       }
//    } 
// }

import java.util.Scanner;

public class ConvertToGreek {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      char origLetter;

      origLetter = scnr.next().charAt(0);

       System.out.println(origLetter);
       switch (origLetter){
         case 'A':
         case 'a':
            System.out.println("Alpha");
            break;
         case 'B':
         case 'b':
            System.out.println("Beta");
            break;
         default:
         System.out.println("Unknown");
            break;
      }
   }
}