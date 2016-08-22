import javax.swing.JOptionPane;

public class ShowCurrentTime {
  public static void main(String[] args){
    // Obtain the total milliseconds since Millis Unix Epoch

    long totalMilliseconds = System.currentTimeMillis();

    // Compute the total seconds since 1970 Jan 1 midnight
    long totalSeconds = (totalMilliseconds / 1000);

    // Compute the current seconds by finding the remainder
    // Type cast to integer
    int currentSecond = (int)(totalSeconds % 60);

    // Compute current minute using remainder
    long totalMinutes = (totalSeconds / 60);

    // Compute currnt minute using modulus
    // Type cast to integer
    int currentMinute = (int)(totalMinutes % 60);

    // Compute total hours since 1 Jan 1970
    long totalHours = (totalMinutes / 60);

    // Compute current hour
    // Type cast to int
    int currentHour = (int)(totalHours % 24);

    // Print values in need Format
    String output = "Current time is" + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT.";
    JOptionPane.showMessageDialog(null, output);
  }
}
