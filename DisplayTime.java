import javax.swing.JOptionPane;

public class DisplayTime {
  public static void main(String[] args) {
    int seconds = 500;
    final int secondsInMinute = 60;
    int totalMinutes = seconds / secondsInMinute;
    int remainingSeconds = seconds % secondsInMinute;
    System.out.println("Total Minutes " + totalMinutes + " Total Seconds" + "Remaining " + remainingSeconds);

  }
}
