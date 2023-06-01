import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество дисков: ");
        int n = in.nextInt();
        DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
        Double moveCounter = Math.pow(2,n) - 1;
        Hanoi.towerOfHanoi(n, 'A', 'C', 'B');
        System.out.println("\nКоличество перестановок равняется = " + format.format(moveCounter));
    }
}

