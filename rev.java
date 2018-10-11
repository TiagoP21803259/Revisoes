import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;

public class rev {

    public static HashMap<String,Integer> returnador ( Automovel[] lista1){

    }
    public static void main(String[] args) {
        ArrayList<Automovel> lista = new ArrayList<>();
        Automovel[] lista1 = new Automovel[3];

        Automovel auto1 = new Automovel("BMW", "Z3", "11-AA-11", 2000);
        Automovel auto2 = new Automovel("BMW", "Z4", "11-BB-11", 2500);
        Automovel auto3 = new Automovel("Fiat", "Punto", "11-CC-11", 10000);

        lista.add(auto1);
        lista.add(auto2);
        lista.add(auto3);

        lista1[0]=auto1;
        lista1[1]=auto2;
        lista1[2]=auto3;

        for(int i =0; i < lista1.length; i++){
            System.out.println(lista1[i]);
        }

        System.out.println("\n");

        for(int i =0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        HashMap<String,Integer> contador = new HashMap<>();

        for(int i = 0; i < lista1.length; i++){
            String marca = lista1[i].marca;
            if(contador.containsKey(marca)){
                //a chave ja existe
                int count = contador.get(marca);
                contador.put(marca, count+1);

            }else{
                //a chave nao existe
                contador.put(marca, 1);
            }
        }

        System.out.println("\n");

        for ( String key : contador.keySet() ) {
            System.out.println( "Marca: " + key + "/ Contador: " + contador.get(key));
        }

    }
}
