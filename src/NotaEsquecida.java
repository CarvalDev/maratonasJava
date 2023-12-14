import java.text.DecimalFormat;
import java.util.Scanner;

public class NotaEsquecida {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double primeiraNota = in.nextDouble();
        double media = in.nextDouble();
        double mediaPrimeiraNota = primeiraNota/2;
        double segundaNota = (media - mediaPrimeiraNota)*2;
        DecimalFormat df = new DecimalFormat("0");
        System.out.printf("%s\n", df.format(segundaNota));
    }
}
