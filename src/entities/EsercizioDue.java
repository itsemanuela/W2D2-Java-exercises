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



}
