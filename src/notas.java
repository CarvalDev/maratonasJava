import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dinheiro = in.nextInt();
        int[] notas = {200, 100, 50, 20, 10};
        System.out.println(achaQtdNotas(dinheiro, notas)); 

    }
    public static String achaQtdNotas(int dinheiro, int[] notas){
        int resto = dinheiro;
        String res ="";
        int[] qtdNotas = new int[notas.length];
        for(int i=0;i<notas.length;i++){
            qtdNotas[i] = resto/notas[i];
            resto = resto%notas[i];
            if(i==0){
                res = res + qtdNotas[i];
            }
           else{
                res = res + "|" + qtdNotas[i];
            }
        }
    

        return res;
    }
}
