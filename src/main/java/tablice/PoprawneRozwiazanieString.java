package tablice;

import java.util.List;

public class PoprawneRozwiazanieString {

    public String zamianaListNaString(List<String> lista){
        String slowo="";

        for (String a:lista ) {
            slowo=slowo+a;
        }

        return slowo;
    }

}
