package maps;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        // Adiciona campeões mundiais fifa no mapa
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Italia", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println(campeoesMundialFifa);

        //Atualiza valor para chave Brasil
        campeoesMundialFifa.put("Brasil", 6);
        System.out.println(campeoesMundialFifa);

        //Retorna Argentina
        System.out.println("A Argentina foi " + campeoesMundialFifa.get("Argentina") + " campeã.");

        //Retorna se existe ou não um campeão França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        //Remove o campeão França
        campeoesMundialFifa.remove("França");

        //Retorna se existe ou não uma seleção hexacampeã
        System.out.println(campeoesMundialFifa.containsValue(6));

        //Retorna o tamanho do mapa
        System.out.println(campeoesMundialFifa.size());

        System.out.println(campeoesMundialFifa);

        //Navega os registros no mapa
        for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()){
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        System.out.println("-------------------------------------------------");

        //Navega os registros no mapa
        for (String key : campeoesMundialFifa.keySet()) {
            System.out.println(key + " -- " + campeoesMundialFifa.get(key));
        }

        System.out.println(campeoesMundialFifa);

        //Retorna se existe ou não um campeão Estados Unidos
        System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));

        //Verifica se no mapa existe o valor 5
        System.out.println(campeoesMundialFifa.containsValue(5));

        //Verifica o tamanho ante e depois de limpar o mapa
        System.out.println("No mapa existem " + campeoesMundialFifa.size() + " times.");

        campeoesMundialFifa.clear();

        System.out.println("No mapa existem " + campeoesMundialFifa.size() + " times.");


    }
}
