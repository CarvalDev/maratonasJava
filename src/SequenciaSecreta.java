import java.util.Scanner;

public class SequenciaSecreta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] sequencia = new int[in.nextInt()];
        int numMax = 0;
        int achado = 0;
        for(int i=0;i<sequencia.length;i++){
            sequencia[i] = in.nextInt();
            if(i==0){
                achado = sequencia[i];
                numMax++;
            }
            if(sequencia[i]!=achado){
                achado = sequencia[i];
                numMax++;
            }
            
        }
        System.out.printf("%d\n", numMax);
        
    }
}
