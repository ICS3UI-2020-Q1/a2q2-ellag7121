import java.util.Scanner;
/**
 * get 2 integers from the user, tells user which one is bigger
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner to get user input
    Scanner input = new Scanner(System.in);

    //initialize variables
    int integerA; //the first integer given by the user
    int integerB; //the second integer given by the user

    //ask user for first integer
    System.out.println("Please enter an integer:");
    //store the user's first integer in a variable
    integerA = input.nextInt();

    //ask user for second integer
    System.out.println("Please enter another integer:");
    //store the user's second integer in a variable
    integerB = input.nextInt();

    //check if first integer is bigger
    if (integerA > integerB){
      //tell user first integer is bigger
      System.out.println("The biggest number is " + integerA + ".");
    }else if(integerA < integerB){ //if first integer is not bigger, check if second integer is bigger
      //tell user second integer is bigger
      System.out.println("The biggest number is " + integerB + ".");
    }else{ //if neither integer is bigger
      //tell user neither integer is bigger
      System.out.println("There is no biggest number.");
    }
  }
}
