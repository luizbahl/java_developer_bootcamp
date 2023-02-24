package set;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        //Monta a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Cuiabá");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        //Retorna ultima capital no final da árvore
        System.out.println(treeCapitais.last());

        //Retorna primeira capital abaixo na árvore da capital parametizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        //Retorna primeira capital abaixo na árvore da capital parametizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        //Exibe todas capitais no console
        System.out.println(treeCapitais);

        //Retorna primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        //Retorna ultima capital no final da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        //Exibe todas capitais no console
        System.out.println(treeCapitais);



    }
}
