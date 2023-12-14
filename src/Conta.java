import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while(true){
            int vt = in.nextInt();
            int pagas = 0;
            if(vt==0){
                break;
            }
            int[] contas = new int[3];
            for(int i=0;i<contas.length;i++){
                contas[i] = in.nextInt();
            }

            for(int k=0;k<3;k++){
            int menor=0;
            int indice =0;
            for(int i=0;i<contas.length;i++){
                if(i==0){
                    menor = contas[i];
                    indice = i;
                }
                if(contas[i]<menor){
                    menor =contas[i];
                    indice = i;
                }

            }
            if(vt>=menor){
            vt = vt-menor;
            pagas++;
            }
            contas = menor(contas, indice);
            }
            System.out.println(pagas);
        }
    }

    

    public static int[] menor(int[] contas, int indice){
        for(int i =0;i<contas.length;i++){
            if(i==indice){
                contas[i] = Integer.MAX_VALUE;
            }
        }
        return contas;
    }
}
