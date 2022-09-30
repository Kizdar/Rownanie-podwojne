package tablice;

import java.util.List;

public class ZadanieNaTablicach {

    public List<String> resetTablicy(List<String> lista){
        lista.removeAll(lista);
        for (int i = 1; i < 10; i++) {
            String cyfra = Integer.toString(i);
            lista.add(cyfra);

        }

        return lista;
    }
}
