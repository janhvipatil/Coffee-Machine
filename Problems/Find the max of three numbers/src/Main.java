import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        int max = max(max(a,b), c);
        int position = 0;
        if (max == a) {
            position = 1;
        } else if (max == b) {
            position =  2;
        } else if (max == c) {
            position = 3;
        }
        return position;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}