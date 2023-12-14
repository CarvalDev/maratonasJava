import java.text.DecimalFormat;
import java.util.Scanner;

public class Parcela {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        double valor = in.nextInt(), parcelas = in.nextInt();
        if(valor%parcelas==0){
        for(int i=1;i<=parcelas;i++){
            System.out.printf("%s\n", df.format(valor/parcelas));
        }
        }else{
            double resto = valor%parcelas;
            double parcelas1 = Math.ceil(valor/parcelas);
            double parcelas2 = Math.floor(valor/parcelas);

            for(int i=1;i<=resto;i++){
                System.out.printf("%s\n", df.format(parcelas1));
            }
            double restante = parcelas - resto;
            for(int i=1;i<=restante;i++){
                System.out.printf("%s\n", df.format(parcelas2));
            }

        }
    }
}
