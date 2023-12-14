import java.util.Scanner;

public class estradas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nCidades = in.nextInt();
        int[] pontoA = new int[nCidades], pontoB = new int[nCidades];
        for(int i=0;i<pontoA.length;i++){
            pontoA[i] = in.nextInt();
            pontoB[i] = in.nextInt();
        }
        
        
        
        //verificar se tem como chegar no A pelos proprios pontos as
        //testa se ha como chegar no pontoA o mesmo numero de cidades
        //se chegar no primero ponto A em nCidades voltas - S
        //se chegar no primeiro pontoA em <nCidades voltas - N
        // se nao tiver como chegar no ponto A - N
        int primeiroPonto =pontoA[0];
        int chega=0;
        boolean pA = repetem(pontoA), pB = repetem(pontoB);
        if(pA==true || pB==true){
        }else{
        boolean daAcesso = chegaNoPonto(pontoA, pontoB, primeiroPonto);
        if(daAcesso==true){
            System.out.printf("S\n");
        }else{
            System.out.printf("N\n");
        }
    }




    }
    public static boolean chegaNoPonto(int[] pontoA,int[] pontoB ,int primeiroPonto){
        int chega=0;
        int repetiuPrimeiroNumero=-1;
        int i=0;
        int iAnterior=-1;
        while(chega!=pontoA.length){
            for(int j=0;j<pontoB.length;j++){
                if(pontoA[i]==primeiroPonto && i!=iAnterior){
                    repetiuPrimeiroNumero++;
                    
                }
                if(pontoA[i]==pontoB[j]){
                    chega++;
                    
                    iAnterior = i;
                    i = j;
                }else{
                iAnterior =i;
                }
                if(chega==pontoA.length){
                    if(repetiuPrimeiroNumero==0){
                        return true;
                    }else if(repetiuPrimeiroNumero>0){
                        return false;
                    }
                }
            }
            
            
        }
        
            
            return false;
        
    }

    public static boolean repetem(int[] ponto){
        int repetida =-1;
        for(int j=1;j<=ponto.length;j++){
            repetida = -1;
        for(int i=0;i<ponto.length;i++){
            if(ponto[i]==j){
                repetida++;
            }
        }
        }
        if(repetida>0){
            return true;
        }else{
            return false;
        }
    }
    }

