package rownanie;

import java.util.ArrayList;
import java.util.List;

public class ZamianaLiczbyNaString {
    public List<String> liczbaToString(int liczba){
        List<String> listaStringZLiczby = new ArrayList<>();
        String liczbaWSlowie;
        liczbaWSlowie=String.valueOf(liczba);
        listaStringZLiczby.add(liczbaWSlowie.substring(0,1));
        listaStringZLiczby.add(liczbaWSlowie.substring(1,2));
//        for (String a: listaStringZLiczby   ) {
//            System.out.println(a);
//        }
        return listaStringZLiczby;
    }
}
