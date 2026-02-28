import java.util.Timer;
import java.util.TimerTask;

public class Seatwork11Task05{
    public static void main(String[] args) {
        Timer timer = new Timer();

        // Create a TimerTask (what will run)
        TimerTask repeatedTask = new TimerTask() {
            int count = 0;

            @Override
            public void run() {
                System.out.println("Hello! The task has run " + (++count) + " time(s).");
                if (count >= 5) {
                    timer.cancel(); // Stop after 5 runs
                }
            }
        };

        long delay = 1000L; // 1 second before first run
        long interval = 2000L; // 2 seconds between runs

        timer.scheduleAtFixedRate(repeatedTask, delay, interval);
    }
}