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

// 3.15 LAB: Warm up: Text message abbreviation decoder
import java.util.Scanner;

public class TextMsgAbbreviation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userInput;

      System.out.println("Input an abbreviation:");
      userInput = scnr.nextLine();

      if (userInput.equals("LOL")){
         System.out.println("laughing out loud");
      } else if (userInput.equals("IDK")){
         System.out.println("I don't know");
      } else if (userInput.equals("BFF")){
         System.out.println("best friends forever");
      } else if (userInput.equals("IMHO")){
         System.out.println("in my humble opinion");
      } else if (userInput.equals("TMI")){
         System.out.println("too much information");
      } else {
         System.out.println("Unknown");
      }
   }
}