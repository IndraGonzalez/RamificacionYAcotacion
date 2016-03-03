
package ramificacionyacotacion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Arbol {
    List<Nodo> estructura;
    
    public Arbol(Nodo inicio) {
        this.estructura = new LinkedList();
        estructura.add(inicio);
    }
    
    public void insertaNodo(Nodo nodo){
        estructura.add(nodo);
    }
    
    public void printArbol(){
        System.out.println("El árbol tiene los siguientes nodos: ");
        for (int i = 0; i < estructura.size(); i++) {
            Nodo nodo = estructura.get(i);
            System.out.println("Nodo " + nodo.vertice.id + " con etapas: [" + 
                    nodo.vertice.etapas[0] + "," + nodo.vertice.etapas[1] + 
                    "] ");
            HashMap<Nodo, Float> map = nodo.pesoHijos;
            Iterator it = map.entrySet().iterator();
            System.out.print("Hijos: [");
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                Nodo nodoHijo = (Nodo) pair.getKey();
                System.out.print(nodoHijo.vertice.id + " ");
                it.remove();
            }
            System.out.print("]");
            System.out.println("");
        }
    }
}
