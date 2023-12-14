import java.util.Scanner;
public class par{
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            String entrada = in.nextLine();
            if(entrada.equals("0")){
                break;
            }
            String[] parD1D2 = entrada.split(" ");

            int par = Integer.parseInt(parD1D2[0]);

            int soma = Integer.parseInt(parD1D2[1]) + Integer.parseInt(parD1D2[2]);

            if(soma%2==0){
                System.out.println(par);
            }else{
                if(par==0){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }
            
        }
    }
}

