public class EsOrdinamento {
    // fare un metodo che ritorna la posizione del numero massimo in un array
    public static int posMax(int[] a){
        int posizmax = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > a[posizmax]){
                posizmax = i;
            }
        }
        return posizmax;
    }


    //metodo swap che dato un array e due posizioni scambi i valori all'interno
    public static void swap(int[] array, int pos1, int pos2){
        int temp = 0;
        temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
    }


    public static void main(String[] args) {
        int[] a = {1,6,9,-12};
        System.out.println(posMax(a));
        // deve stampare 2

    }
}