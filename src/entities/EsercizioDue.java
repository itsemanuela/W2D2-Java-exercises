package entities;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class EsercizioDue {

    public static List<Integer> randomNum(int numero){
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numero; i++) {
          int numeroRandom = random.nextInt(101);
          lista.add(numeroRandom);
        } return  lista;
    }

    public static List<Integer> secondaLista(List<Integer> lista){
        List<Integer> lista2 = new ArrayList<>(lista);
        for (int i =lista.size() -1; i>=0;  i--) {
            lista2.add(lista.get(i));
        } return lista2;

    }

    //verifico se gli indici sono pari o dispari dividendoli per due e li stampo nel main
public static void StampoIndici(List<Integer> lista, boolean Pari){
        for (int i= 0; i< lista.size(); i++){
if (Pari && i % 2 == 0){
    System.out.println("Indice pari" + " " + lista.get(i));
} else {
    System.out.println("Indice non pari" + " " + lista.get(i));
}
    }
}

}
