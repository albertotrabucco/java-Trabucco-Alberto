import java.util.Scanner;

public class Bisestile {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Scrivi un anno: ");
        int anno = keyboard.nextInt();
        if(anno % 4 == 0){
            System.out.println(anno+" E' Bisestile!");
        }else{
            System.out.println(anno+" Non e' Bisestile!");
        }
    }        
}
