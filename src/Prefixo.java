import java.util.Scanner;

public class Prefixo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int tamPalavra = in.nextInt();
            if(tamPalavra==0){
                break;
            }
            String pal = in.next();
            int tamPalavra2 = in.nextInt(); 
            String pal2 =in.next();
            int control=0;
            
            int maior = 0;
            int menor =0;
            if(pal.length()>=pal2.length() ){
                maior = pal.length();
                menor = pal2.length();
            }
            else{
                maior = pal2.length();
                menor = pal.length();
            }
            int conta=0;               
                    for(int j=0;j<menor;j++){
                        if(pal.charAt(j)==pal2.charAt(j)){
                            conta++;
                        }else{
                            j = menor;
                        }
                    }
                
            
            System.out.println(conta);
        }

    }
}

