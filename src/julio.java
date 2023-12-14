import java.util.Scanner;

public class julio {
    public static void main(String[] args) { //A - 65 Z - 90
        Scanner in = new Scanner(System.in);
        while(true){
            String codigo = in.next();
            if(codigo.equals("0")){
                break;
            }
            int letrasADireita = in.nextInt();
            String res ="";
            for(int i=0;i<codigo.length();i++){
                int subtracao=0;
                int diferencaDoA=0;
                int novaLetra =0;
                char ch = codigo.charAt(i);
                if(ch-letrasADireita<65){
                    subtracao = ch-letrasADireita; //guardando em inteiro o resultado, suponhamos que seja 63 
                    diferencaDoA = 64-subtracao; // guardando quanto a menos de 64, já que um movimento ja conta do A para o Z neste exemplo foram 2
                    novaLetra = 90 - diferencaDoA; // tirando esses 2, da ultima letra do alfabeto
                    ch = (char)novaLetra;
                }else{
                    subtracao = ch-letrasADireita;
                    ch = (char)subtracao;
                }
                res = res + ch;
            }
            System.out.println(res);
            
        }
    }
}
