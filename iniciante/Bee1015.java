package iniciante;

import java.util.Scanner;

public class Bee1015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float x1 = input.nextFloat();
        float y1 = input.nextFloat();
        float x2 = input.nextFloat();
        float y2 = input.nextFloat();

        float diferencaX = x2 - x1;
        float diferancaY = y2 - y1;

        //double distancia = Math.sqrt(Math.pow(diferencaX, diferancaY) - Math.pow(diferancaY, diferancaY));
        double distancia = Math.sqrt(diferencaX*diferencaX - diferancaY*diferancaY);

        System.out.println(String.format("%.4f", distancia));

    }
}
