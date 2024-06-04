
import java.util.List;

import lombok.Data;

@Data
public class Main {
    int v[];
    public int suma(List<Integer> lista) throws Exception {
        if( lista==null || lista.size()==0) {
            throw new Exception ("lista vacía");
        }
        int suma=0;
        for (int i = 0; i < lista.size(); i++) {
            suma+=lista.get(i);
        }
        return suma;
    }
    public int anadir(int posicion, int valor)  {
        if (posicion < 0 || posicion > v.length)
            return -1;
        else
            v[posicion]=valor;
        return 0;
    }
    int comunes( List<Integer> l) throws Exception {
        if (v==null || v.length == 0)
            throw new Exception ("array vacio");
        if (l==null || l.size()==0)
            return -1;
        int cont=0;
        for (int i = 0; i < v.length; i++)
            if (l.contains(v[i]))
                cont++;
        return cont;
    }
}



