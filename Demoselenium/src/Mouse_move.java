import java.awt.Robot;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Mouse_move {
    
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;

    public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        Random random = new Random();
        while (true) {
            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
            TimeUnit.MINUTES.sleep(2);
        }
    }
}