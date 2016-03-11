import java.util.Scanner;

/**
 * Created by jsimao on 10-03-2016.
 */
public class OnlineSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;

        DynamicArray set = new DynamicArray();

        // Programa lê inteiros e termina com a introdução
        // do valor -1
        while ((value = input.nextInt()) != -1) {
            // inserção ordenada
            int idx = 0;
            while (idx < set.size() && value > set.getAt(idx))
                ++idx;
            set.putAt(idx, value);

            // print dos valores
            System.out.println("Current values are:");
            for (int i=0; i<set.size(); ++i) {
                System.out.print(set.getAt(i) + " ");
            }
            System.out.println();
        }
    }
}
