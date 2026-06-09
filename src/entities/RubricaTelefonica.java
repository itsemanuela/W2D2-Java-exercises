package entities;
import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    public static Map<String, Double> RubricaTelefonica = new HashMap<>();

    public static void inserisciContatto(String nome, String telefono)
    {
        RubricaTelefonica.put(nome, Double.valueOf(telefono));
        System.out.println("Contatto inserito in rubrica" + " " + nome + " " + telefono);

    }
public static void StampoRubrica(){
    System.out.println("Visualizza nome in rubrica" + " " +  RubricaTelefonica.keySet());
}
}

