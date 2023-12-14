import java.util.Scanner;

public class DiaCompromisso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] diasHoras = new String[30][24];

        boolean menu = true;
        int opcao=0;
        while(menu){
            System.out.println("Adicionar 1");
            System.out.println("Consultar todos os compromissos 2");
            System.out.println("Sair 3");
            opcao = in.nextInt();
            if(opcao==1){
                
                System.out.println("Informe o dia");
                int dia = in.nextInt();
                System.out.println("Informe a hora");
                int hora = in.nextInt();
                System.out.println("Digite seu compromisso");
                String compromisso = in.next();
                for(int i=0;i<diasHoras.length;i++){
                    for(int j=0;j<diasHoras[i].length;j++){
                        if(i+1==dia && j+1==hora){
                            diasHoras[i][j] = compromisso;
                            System.out.println();
                        }
                    }
                }
            }else if(opcao==2){
                for(int i=0;i<diasHoras.length;i++){
                    for(int j=0;j<diasHoras[i].length;j++){
                        if(diasHoras[i][j]!=null){
                            System.out.println(diasHoras[i][j]);
                            System.out.println("Dia " + (i+1));
                            System.out.println("Hora " + (j+1));
                            System.out.println();
                        }
                    }
                }

            }else if(opcao==3){
                menu = false;
            }
        }
    }
}
