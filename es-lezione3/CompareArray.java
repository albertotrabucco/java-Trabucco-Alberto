import java.util.Scanner;

public class CompareArray {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Inserisci due stringhe:");
        String firstStr = keyboard.nextLine();
        String secondStr = keyboard.nextLine();

        char[] firstStrtocharArray = firstStr.toCharArray();
        char[] secondStrtocharArray = secondStr.toCharArray();


        System.out.print("Le lettere in comune sono: ");
        for(int i = 0; i < firstStrtocharArray.length; i++){
            for(int j = 0; j < secondStrtocharArray.length; j++){
                if(firstStrtocharArray[i] == secondStrtocharArray[j]){
                    System.out.print(firstStrtocharArray[i]+" ");
                }
            }  
        }

    }
}
