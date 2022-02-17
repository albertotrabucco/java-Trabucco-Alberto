import java.util.Scanner;
import java.util.Arrays;

public class esercizio2 {
    public static String checkSort(int[] a){
        String risposta = "";
        int n = 3;
        int arrcheckAsc[] = new int[n];
        int arrcheckDesc[] = new int[n];
        for(int i = 0; i < a.length ;i++){
            arrcheckAsc[i] = a[i];
            arrcheckDesc[i] = -a[i];
        }
        Arrays.sort(arrcheckAsc);
        Arrays.sort(arrcheckDesc);

        for(int i = 0; i < a.length; i++){
            arrcheckDesc[i] = arrcheckDesc[i]*(-1);
        }
        if(arrcheckAsc != a && arrcheckDesc != a){
            risposta = "Non sono in ordine";
        }else{
            if(arrcheckAsc == a){
                risposta = "Sono in ordine decrescente!";
            }else{
                risposta = "Sono in ordine crescente!";
            }
         }
        return risposta;
    }
    
    
    public static void main(String[] args){
        int n = 3;
        Scanner keyboard = new Scanner(System.in);
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Inserisci il"+(i+1)+"° numero: ");
            arr[i] = Integer.parseInt(keyboard.nextLine());
        }

        System.out.println(checkSort(arr));
    }


}
