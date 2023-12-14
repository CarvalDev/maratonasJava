import java.util.Scanner;

public class palindromos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            String entrada = in.nextLine();
            if(entrada.equals("0")){
                break;
            }
            String[] palavras = entrada.split(" ");
            String palavrasInvertida = "";
            int contador=0;
            int qtdPalavras=0;
            int pares=0;
            for(int i=0;i<palavras.length;i++){
                int nLetras = palavras[i].length();
                for(int j=0;j<nLetras;j++){
                    palavrasInvertida = invertePalavra(palavras[i]);
                    String palavraUc = palavras[i].toUpperCase();
                    String palavraInvertidaUc = palavrasInvertida.toUpperCase();
                    if(palavraUc.charAt(j)==palavraInvertidaUc.charAt(j)){
                        contador++;
                    }
                }
                if(contador==nLetras && nLetras>1){
                    qtdPalavras++;
                }
                contador=0;
            } 
            pares = qtdPalavras/2;
            System.out.println(pares);
        }
    }
    public static String invertePalavra(String palavra){
        int j=0;
        String palavraNova = "";
        for(int i= palavra.length()-1;i>=0;i--){
            char ch = palavra.charAt(i);
            palavraNova = palavraNova + ch;
        }
        return palavraNova;
    }
}
