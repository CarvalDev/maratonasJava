import java.util.Scanner;

public class evento {
    public static void main(String[] args) throws Exception {
        
            Scanner in = new Scanner(System.in);
            while(true){
                int colaboradores = in.nextInt();
                if(colaboradores==0){
                    break;
                }
                int filas=in.nextInt(), assentos=in.nextInt();
                int[][] mapa = new int[filas][assentos];
                
                //entrada da matriz de tras pra frente, ou seja começando da ultima linha, primeira coluna a ultima coluna
                for(int i=(mapa.length-1);i>=0;i--){
                    for(int j=0;j<mapa[i].length;j++){
                        mapa[i][j] = in.nextInt();
                    }
                }
                
                int livres = 0;
                int filaCerta=-1;
                for(int i=0;i<mapa.length;i++){
                    for(int j=0;j<mapa[i].length;j++){
                        if(mapa[i][j]!=1){
                            livres++;
                        }else{
                            livres =0;
                        }
                        if(filaCerta==-1){
                        if(livres==colaboradores){
                            filaCerta = i+1;
                        }
                        }
                    }
                    livres =0;
                }
                System.out.println(filaCerta);
            }
        
    }
}

