import java.util.Scanner;

public class fatoriais {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int n1 = in.nextInt(); //tentar resolver com nextLine
            int n2 = in.nextInt();
            if(n1==0 ){
                if(n2==0){

                }else{
                    break;
                }
            }
            
            long fat1 = fatorial(n1);
            long fat2 = fatorial(n2);
            long soma = fat1+fat2;
            System.out.println(soma);

        }
    }

    public static long fatorial(int n1){
        long fat =n1;
        if(n1==0){
            fat=1;
        }else{
        for(int i=n1-1;i>0;i--){
            fat = fat  * i;
        }
        }

        return fat;
    }
}
