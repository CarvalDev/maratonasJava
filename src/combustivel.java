import java.util.Scanner;
public class combustivel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //entradas, consumo km/l, distancia, combustivel no tanque
        //saida quaal o valor minimo a colocar para o carro chegar na cidade com o menor quantidade de combustivel
        while(true){
            int consumo = in.nextInt();
            if(consumo==0){
                break;
            }
            float res=0;
            int distancia=in.nextInt(), combustivelT=in.nextInt();
            float c=consumo,d=distancia,co=combustivelT; 
            int totalParachegar = consumo*distancia;
            double litrosAGastar = (d/c);
            double litrosRestantes=0;
            if(co>=litrosAGastar){litrosRestantes=0;}else{
                 litrosRestantes = litrosAGastar-co;
                }
                System.out.printf("%.4f", litrosRestantes);
          
            
        }
    }
}
