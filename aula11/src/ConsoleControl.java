import java.util.Scanner;

/**
 * Created by jsimao on 12-04-2016.
 */
public class ConsoleControl {
    public void run(IView view) {
        int input;
        Model m = new Model();
        m.setView(view);
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            input = scan.nextInt();
            if (input == 1) {
                m.reset();
            } else if(input == 2) {
                m.incValue();
            } else if (input == 3) {
                m.decValue();
            }
        }
    }
}
