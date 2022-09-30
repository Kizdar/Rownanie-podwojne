/*
Założenie mamy 9 cyfr od 1 do 9,

mamy tak dobrać cyfry aby było spełnione następujące podwójne równanie:





_ x _ _ = _ _ _ = _ _ x _



gdzie za podkreślenie "_" wpisujemy cyfry z zakresu od 1 do 9.



- każdą cyfrę można użyć tylko raz



Przykład uzupełnienia liczb,  który nie spełnia warunku:



1 x 23 = 456 = 78 x 9



Każda cyfra powinna być użyta tylko raz, i nie może być tak, że jakiejś brakuje
 */

import rownanie.LiczbyRownania;
import rownanie.ZamianaLiczbyNaString;
import sprawdzanie.SprawdzanieWarunku;
import tablice.PoprawneRozwiazanieString;
import tablice.ZadanieNaTablicach;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ZadanieNaTablicach operacjeNaTablicach = new ZadanieNaTablicach();
        ZamianaLiczbyNaString zamianaLiczbyNaString = new ZamianaLiczbyNaString();
        SprawdzanieWarunku sprawdzanieWarunku = new SprawdzanieWarunku();
        PoprawneRozwiazanieString poprawneRozwiazanieString= new PoprawneRozwiazanieString();

        List<String> listaCyfr = new ArrayList<String>();
        List<String> cyfryDoSprawdzenia = new ArrayList<String>();
        List<String> cyfryZLiczby = new ArrayList<>();
        List<String> rozwiazania = new ArrayList<>();
        listaCyfr = operacjeNaTablicach.resetTablicy(listaCyfr);
        LiczbyRownania liczbyRownania = new LiczbyRownania();



        int liczbaDzielników = 0;
        String wynik = "";

        for (String i : listaCyfr) {
            for (String j : listaCyfr) {
                if (j.equals(i)) {
                    continue;
                }
                for (String k : listaCyfr) {
                    if (k.equals(i) || k.equals(j)) {
                        continue;
                    }

                    wynik = wynik + i + j + k;
                    liczbyRownania.setTrzeciaLiczba(wynik);

                    for (int l = 1; l < 10; l++) {
                        if (Integer.parseInt(i) == l || Integer.parseInt(j) == l || Integer.parseInt(k) == l) {
                            continue;
                        }




                        if (liczbyRownania.getTrzeciaLiczba() % l == 0) {
                            int dzielna;
                            dzielna = liczbyRownania.getTrzeciaLiczba() / l;
                            liczbaDzielników = liczbaDzielników + 1;
                            if (dzielna >= 100) {
                                continue;
                            }
                            if(cyfryDoSprawdzenia.size()<1) {
                                cyfryDoSprawdzenia.add(i);
                                cyfryDoSprawdzenia.add(j);
                                cyfryDoSprawdzenia.add(k);
                            }

                            cyfryDoSprawdzenia.add(Integer.toString(l));

                            cyfryZLiczby = zamianaLiczbyNaString.liczbaToString(dzielna);

                            if (sprawdzanieWarunku.warunekPowtarzania(cyfryDoSprawdzenia, cyfryZLiczby)) {

                                cyfryDoSprawdzenia.add(cyfryZLiczby.get(0));
                                cyfryDoSprawdzenia.add(cyfryZLiczby.get(1));

                                if (cyfryDoSprawdzenia.size()==9) {
                                rozwiazania.add(poprawneRozwiazanieString.zamianaListNaString(cyfryDoSprawdzenia));
                                }



                            } else if(cyfryDoSprawdzenia.size()>1){
                                cyfryDoSprawdzenia.remove(cyfryDoSprawdzenia.size()-1);


                            }


                        }



                    }
                    cyfryDoSprawdzenia.removeAll(cyfryDoSprawdzenia);



                    if (liczbaDzielników == 2) {


                    }
                    liczbaDzielników = 0;


                    wynik = "";
                }

            }


        }
        System.out.println(rozwiazania.size());

        for (String a:rozwiazania) {
//            liczbyRownania.setPierwszaCyfra(a.substring(4));
//            liczbyRownania.setDrugaLiczba(a.substring(5,6));
//            liczbyRownania.setTrzeciaLiczba(a.substring(0,3));
//            liczbyRownania.setCzwartaLiczba(a.substring(8,9));
//            liczbyRownania.setPiataCyfra(a.substring(7));
            System.out.println("Poprawne działanie: "+a.substring(3,4)+"*"+a.substring(4,6)+"="+a.substring(0,3)+"="+a.substring(7,9)+"*"+a.substring(6,7));

        }

    }
}
