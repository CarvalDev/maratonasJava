import java.util.Scanner;
public class despertador {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true){
        int[] horaC = new int[2];
       int horas=0;
        int minutos=0;    
            horaC[0] = in.nextInt();
            if(horaC[0]==0){
                break;
            }
            horaC[1] = in.nextInt();
            int[] horaF = {in.nextInt(), in.nextInt()};
            if(horaC[0]<=horaF[0]){
                horas = horaF[0]-horaC[0];
            } if(horaC[0]>horaF[0]){
                horas = (24-horaC[0])+horaF[0];
            }if(horaC[0]==horaF[0] && horaC[1]>horaF[1]){
                horas=23;
                minutos = (60-horaC[1]) +horaF[1];
            } if(horaC[1]<=horaF[1]){
                minutos = horaF[1]-horaC[1];
            } if(horaC[1]>horaF[1] && horaF[0]!=horaC[0]){
                minutos = (60-horaC[1]) +horaF[1];
                horas = horas-1;
                
            }
            minutos = minutos + (horas*60);
            System.out.println(minutos);
        }
         
    }
}