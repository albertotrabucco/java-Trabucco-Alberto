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

    public static void main(String[] args) {
        int[] a = {1,6,9,-12};
        System.out.println(posMax(a));
        // deve stampare 2

    }
}