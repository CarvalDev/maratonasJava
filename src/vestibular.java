import java.util.Scanner;
public class vestibular {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        while(true){
            String gabarito = in.nextLine();
            if(gabarito.equals("0")){
                break;
            }
            String[] gab = gabarito.split(" ");
            String[] res = new String[gab.length];
            int certas =0;
            for(int i=0;i<res.length;i++){
                res[i] = in.next();
            }
            in.nextLine(); // consome o /n do in.next()
            for(int i=0;i<res.length;i++){
                if(gab[i].equals(res[i])){
                    certas++;
                }
            }
            System.out.printf("%s\n", certas);
            
        }
    }
}