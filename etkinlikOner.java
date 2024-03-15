import java.util.*;


public class etkinlikOner {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        double heat;

        System.out.println("Hava kac derece?");

        heat=input.nextDouble();

        if(heat<=5){
            System.out.println("Kayak yapabilirsiniz!");
        }
        else if(heat<=15){
            System.out.println("Sinemaya gidebilirsiniz!");

        }
        else if(heat<=25){
            System.out.println("Piknik yapabilirsiniz");
        }
        else{
            System.out.println("Yuzebilirsiniz!");
        }
    }

}
