package iniciante;

import java.util.Scanner;

public class Bee1007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        int diferenca = ((A*B) - (C*D));

        System.out.println("DIFERENCA = "+diferenca);
    }
}
