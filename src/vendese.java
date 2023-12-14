
import java.util.Arrays;
import java.util.Scanner;

public class vendese {
    
    /**
     * 
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String entrada1 = in.nextLine();
        String[] qtdPrediosaVender = entrada1.split(" ");
        int qtdPredios = Integer.parseInt(qtdPrediosaVender[0]);
        int aVender = Integer.parseInt(qtdPrediosaVender[1]);
        int resto = qtdPredios-aVender;
        String dist = in.nextLine();
        String[] distanciasString =  dist.split(" ");
        int[] distancias = Arrays.stream(distanciasString).mapToInt(Integer::parseInt).toArray();
        int[] distanciasComp = new int[distancias.length]; 
        
        
        
        int tam = distancias.length;
        // for(int i=0;i<distancias.length;i++){
        //     distancias[i] = in.nextInt();
        //     distanciasComp[i] = distancias[i];
        // }
        int[] distanciasInial = distancias;
        int diferenca=0;
        int menorDistancia=0;
        for(int i=0;i<distancias.length;i++){
            // for(int incremento=0;incremento<distancias.length;incremento++){
            //     distanciasComp[incremento] = distancias[incremento];
            // }
            distanciasComp = Arrays.stream(distanciasString).mapToInt(Integer::parseInt).toArray();
            for(int j=0;j<distancias.length;j++){
                
                distanciasComp= modifica(distanciasComp, j);
                
                if(distanciasComp[j]<distancias[i] && distanciasComp[j]>-1){
                    
                    int dif = distancias[i] - distanciasComp[j];
                    int achou=0;
                    
                        for(int k=0;k<distancias.length;k++){
                            if(distancias[k]<distancias[i] && distancias[k]<distanciasComp[j]){
                                achou ++;
                            }
                            if(distancias[k]==distancias[i] || distancias[k]==distanciasComp[j]){
                                achou ++;
                            }
                        
                    }
                    if(achou==resto){
                        diferenca = dif;
                            
                            if(menorDistancia==0){
                                menorDistancia=diferenca;
                            }
                            if(diferenca<menorDistancia){
                                menorDistancia = diferenca;
                            }
                    }
                }
            }
            
        }
        System.out.printf("%d", menorDistancia);
    }
    public static int[] modifica(int[] vetor, int i){
        if(i==0){
            return vetor;
        }
        int removedItem=i-1;
        vetor[removedItem] = -1;
    
        
        return vetor;
    }
    
} 