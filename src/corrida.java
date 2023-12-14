import java.util.Scanner;

public class corrida {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] infosCarro = new int[3];
        int[] infosCarro2 = new int[3];

        for(int i=0;i<infosCarro.length;i++){
            infosCarro[i] = in.nextInt();
        }
        for(int i=0;i<infosCarro.length;i++){
            infosCarro2[i] = in.nextInt();
        }
        double d1 =(infosCarro[1]);
        double d2 = infosCarro2[1];
        double v1 = infosCarro[2], v2 = infosCarro2[2];
        v1 = v1/3.6;  //converter km/h por m/s
        v2= v2/3.6;

        double segundos1 =0, segundos2=0;
        segundos1 = d1/v1;
        segundos2 =d2/v2;
        if(segundos1<segundos2){
            System.out.printf("%d\n", infosCarro[0]);
        }else{
            System.out.printf("%d\n",infosCarro2[0]);
        }
    }
}
