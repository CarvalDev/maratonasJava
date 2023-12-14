import java.util.Scanner;

public class premios {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String linha = in.nextLine();
            if(linha.equals("0")){
                break;
            }
            int[] numeros = new int[5];
            String[] numerosString = new String[5];
            numerosString = linha.split(";");
            for(int i=0;i<5;i++){
                numeros[i] = Integer.parseInt(numerosString[i]);
            }
            int maior= achaMaior(numeros);
            
            int placas=0;
            int trofeus = verificaMaiorRepetido(numeros, maior);
            if(trofeus==5){
                placas =0;
            }else{
                numeros = removeMaior(numeros, maior);
                maior = achaMaior(numeros);
                placas = verificaMaiorRepetido(numeros, maior);
            }
            String resp = trofeus+";"+placas;
            System.out.println(resp);

        }
    }

    public static int verificaMaiorRepetido(int[] array, int maior){
        int conta=0;
        for(int i=0;i<5;i++){
                if(array[i]==maior){
                    conta++;
                }
            }
            return conta;
    }
    public static int[] removeMaior(int[] array, int maior){
        for(int i=0;i<5;i++){
                if(array[i]==maior){
                    array[i] = -1;
                }
            }
            return array;
    }
    public static int achaMaior(int[] array){
        int maior=0;
        for(int i=0;i<5;i++){
                if(i==0){
                    maior = array[i];
                }
                if(array[i]>maior){
                    maior = array[i];
                }
            }
            return maior;
    }
}
