import java.util.Scanner;

public class Matriz{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] numeros = new int[3][3];
        int qtdPares =0;
        int qtdImpares=0;
        for(int i=0;i<numeros.length;i++){
            for(int j=0;j<numeros[i].length;j++){
                numeros[i][j] = in.nextInt();
                if(numeros[i][j]%2==0){
                    qtdPares++;
                }else{
                    qtdImpares++;
                }
            }
        }
        System.out.println(qtdPares + " " + qtdImpares);
    }
}