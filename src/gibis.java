import java.util.Scanner;

public class gibis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int v1 = in.nextInt();
            if(v1==0){                      //MDC
                                            // 4, 8 / 2, NUMERO PRIMO, so divide por 1 e por ele mesmo
                break;
            }
            int v2 = in.nextInt();
            int divisor = 2;
            int res = 1;
            int ver=0;
            while(ver!=1){
                int primoSim=0;
                for(int i=1;i<=divisor;i++){
                    
                    if(divisor%i==0){
                        primoSim++;
                    }
                    
                }
                if(primoSim==2){
                    
                    if(v1%divisor==0 && v2%divisor==0){
                        res = res* divisor; 
                        v1 = v1/divisor;
                        v2 = v2/divisor;
                        
                        divisor = 2;
                    }
                    else if(v1<divisor || v2<divisor){
                        ver = 1;
                    }else{
                        divisor++;
                    }
                }else{
                    
                    divisor++;
                }
            }
            System.out.println(res);
            
        }
        
    }
}
