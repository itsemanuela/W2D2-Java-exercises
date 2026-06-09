package entities;
import java.util.List;

public class MainDue {
    //primo metodo
    public static void main(String[] args){
        List<Integer> lista = EsercizioDue.randomNum(5);
        System.out.println("Prima lista" + " " +  lista);
        //*****************************SECONDA PARTE********************//
        List<Integer> lista2 = EsercizioDue.secondaLista(lista);
        System.out.println("Seconda lista" + " " +  lista2);

        //******************TERZA PARTE*************//
        //metodo per stampare gli indici pari e dispari
        System.out.println("Stampo indici pari");
        EsercizioDue.StampoIndici(lista, true);
        System.out.println("Stampo indici dispari");
        EsercizioDue.StampoIndici(lista, false);
    }











}
