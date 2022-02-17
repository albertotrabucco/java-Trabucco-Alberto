import java.util.Scanner;
import java.util.Random;
public class esercizio1{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Quanti tenativi vuoi avere? ");
        int tentativi = Integer.parseInt(keyboard.nextLine());

        int n = 5;
        
        int randomarray[]= new int[n];
        for(int i = 0; i < n; i++){
            Random rand = new Random();
            int randnum = rand.nextInt(9);
            randomarray[i] = randnum;
        }
        for(int k=0; k < n; k++){
            System.out.print(randomarray[k] + " ");
        }
        System.out.println("\n");

        int tries = 0;
        while(tries < tentativi){
            System.out.println("Inserisci un numero di 5 cifre: ");
            int userarray[] = new int[n];
            for(int j=0; j < n; j++){
                System.out.println((j+1)+"° numero:");
                userarray[j] = Integer.parseInt(keyboard.nextLine());
            }
            System.out.println("\n");
            System.out.print("Questo è il numero che hai scritto: ");
            for(int k=0; k < n; k++){                
                System.out.print(userarray[k]);
            }
            System.out.println("\n");
            int ncifre = 0;
            int sumcifre = 0;
            for(int i = 0; i < n; i++){
                if(userarray[i] == randomarray[i]){
                ncifre++;
                sumcifre += userarray[i];
                }
            }
            if(ncifre == 5){
                System.out.println("Hai trovato il numero corretto!");
                break;
            }else{
            System.out.print("Le cifre nella posizione giusta sono: ");
            System.out.print(ncifre);
            System.out.println("\n");
            System.out.print("La somma delle cifre trovate è: ");
            System.out.print(sumcifre);
            }
            
            System.out.println("\n");
            System.out.println("-----------------------------------------------------------------");

            
        }
        


    }
}
