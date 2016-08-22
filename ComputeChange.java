import javax.swing.JOptionPane;

public class ComputeChange {
  public static void main(String[] args){
    String amountString = JOptionPane.showInputDialog("Enter an amount in double, for example 11.56");

    // Convert string to double
    double amount = Double.parseDouble(amountString);

    // Convers input into cents
    int remainingAmount = (int)(amount * 100);

    // Find the number of one dollars
    int numberOfOneDollars = remainingAmount / 100;
    // Modify the value of the remainingAmount after modulus operation
    remainingAmount = remainingAmount % 100;

    int numberOfQuarters = remainingAmount / 25;
    // Modify remainingAmount agains
    remainingAmount = remainingAmount % 25;

    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    int numberOfNickels = remainingAmount / 5;

    // Final amount is your pennies
    int numberOfPennies = remainingAmount % 5;

    String output = "Your amount " + amount + " consists of \n" +
      numberOfOneDollars + " Dollars\n" +
      numberOfQuarters + " Quarters\n" +
      numberOfDimes + " Dimes\n" +
      numberOfNickels + " Nickels\n" +
      numberOfPennies + " Pennies";
    JOptionPane.showMessageDialog(null, output);
  }
}
