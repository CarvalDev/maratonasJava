import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int mercados = in.nextInt();
        
        
        ArrayList<Double> precos = new ArrayList<>();
        

        for(int i=0;i<mercados;i++){
            ArrayList<String> precoGrama = new ArrayList<>();
            ArrayList<Double> precoGramaNum = new ArrayList<>();
            precoGrama.add(in.next()); //preco
            precoGrama.add(in.next()); //grama
            precoGramaNum.add(Double.parseDouble(precoGrama.get(0)));
            precoGramaNum.add(Double.parseDouble(precoGrama.get(1)));
            double total = (precoGramaNum.get(0)*1000)/precoGramaNum.get(1);
            
            precos.add(total);

            
        }
        Collections.sort(precos);
        DecimalFormat df = new DecimalFormat("0.00");
        String res = df.format(precos.get(0));
        System.out.printf("%s\n",res.replaceAll(",", "."));
        in.close();
    
    }
}
