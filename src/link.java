import java.util.Scanner;

public class link {
    //segunda linha * 2, primeiraEntrada vezes
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int iLink = in.nextInt();
            if(iLink==0){
                break;
            }
            int nclicks = in.nextInt();
            int res = calculaClicks(nclicks, iLink);
            System.out.println(res);
        }
        
    }
    public static int calculaClicks(int clicks, int vezes){
        int res =clicks;
        for(int i =1; i<vezes; i++){
            res = res *2;
            
        }
        return res;
    } 

}
