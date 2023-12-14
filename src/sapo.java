import java.util.Scanner;

public class sapo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int linhas = in.nextInt();
            if(linhas==0){
                break;
            }
            int col = in.nextInt();
            String[][] mapa = new String[linhas][col];
            int[][] vitalidades = new int[linhas][col];
             char ch = 'A';
             int num = 1;
             String posicao = "";
             String proximoMovimento = in.next();
             String movimentosAnteriores = in.next();
             String[] movimentoAnt = movimentosAnteriores.split(";");

            for(int i=0;i<mapa.length;i++){
                num = 1;
                for(int j =0;j<mapa[i].length;j++){
                    vitalidades[i][j] = 100;
                    posicao = ch + String.valueOf(num);
                    mapa[i][j] = posicao;
                    num ++;
                }
                ch++;
            }
            for(int k =0;k<movimentoAnt.length;k++){
            for(int i=0;i<mapa.length;i++){
                for(int j =0;j<mapa[i].length;j++){
                    vitalidades[i][j] = vitalidades[i][j] -1;
                    if(mapa[i][j].equals(movimentoAnt[k])  ){
                        vitalidades[i][j] = vitalidades[i][j] - 10;
                    }
                }
                
            }
            }
            for(int i=0;i<mapa.length;i++){
                for(int j=0;j<mapa[i].length;j++){
                    if(mapa[i][j].equals(proximoMovimento)){
                        if(vitalidades[i][j]>=10){
                            System.out.println("eh possivel");
                        }else{
                            System.out.println("nao eh possivel");
                        }
                    }
                }
            }
        }        
    }
}
