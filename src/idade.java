import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        //entre tres numeros quer o do meio

        Scanner in = new Scanner(System.in);
        while(true){
            int[] numeros =new int[3];
            numeros[0] = in.nextInt();
            if(numeros[0]==0){
                break;
            }
            numeros[1] = in.nextInt();
            numeros[2] = in.nextInt();
            int maior=0, menor=0, meio=0;
            if(numeros[0]!=numeros[1] &&numeros[1]!=numeros[2] && numeros[2]!=numeros[0]){

            
            for(int i=0; i<3;i++){
                if(i==0){
                    maior = numeros[i];
                    menor = numeros[i];
                }
                if(numeros[i]>maior){
                    maior = numeros[i];
                }else if(numeros[i]<menor){
                    menor = numeros[i];
                }

            }
            
            int conta=0;
            for(int i=0;i<3;i++){
                if(numeros[i]<maior && numeros[i]>menor){
                    meio= numeros[i];
                }else if(numeros[i]==maior || numeros[i]==menor){
                    conta++;
                }
            }
        }else{
            if(numeros[0]==numeros[1]){
                meio = numeros[0];
            }else if(numeros[1]==numeros[2]){
                meio = numeros[1];
            }else{
                meio = numeros[2];
            }
        }
            System.out.printf("%d\n", meio);
        }
    }
}
