import java.util.Scanner;
public class esercizio1{
    public static void main(String[] args){
        int tentativi = 10;
        Scanner keyboard = new Scanner(System.in);


        for(int i = 0; i < tentativi; i++){
            
            System.out.println("Inserisci un numero di 5 cifre: ");
            int n = 5;
            int array[] = new int[n];
            for(int j=0; j < n; j++){
                System.out.println("Inserisci il "+(j+1)+"° numero:");
                array[i] = Integer.parseInt(keyboard.nextLine());
            }
            

            //compara con un array randomico generato in una funzione fuori dal main


            
        }
        


    }
}
