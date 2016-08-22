import javax.swing.JOptionPane;

public class FahrenheitToCelsius {
  public static void main(String[] args){
    //double degreesFahrenheit;

    String input = JOptionPane.showInputDialog(null,"Fahrenheit Converter", "Enter a valid Fahrenheit temperature", JOptionPane.QUESTION_MESSAGE);

    double degreesFahrenheit = Double.parseDouble(input);
    double celsius = (5.0/9.0)*(degreesFahrenheit - 32.0);
    System.out.println( degreesFahrenheit + " Degrees Fahrenheit in Celsius is " + celsius);
  }
}
