package sprawdzanie;

import java.util.List;

public class SprawdzanieWarunku {

    public boolean warunekLiczbowy(int a, int b, int c){

        if (a*b==c){
            return true;
        }

        return false;
    }

    public boolean warunekPowtarzania(List<String> cyfry, List<String> cyfraDoSprawdzenia){

//        System.out.println();
//        for (String a:cyfry) {
//            System.out.print(a);
//        }
//        System.out.print("  ");
//        for (String a:cyfraDoSprawdzenia) {
//            System.out.print(a);
//        }

        for (String pierwszaLista: cyfry ) {
            for (String doSprawdznia: cyfraDoSprawdzenia ) {

                if(pierwszaLista.equals(doSprawdznia)){
//                    System.out.println("sprawdzanie warunku");
                    return false;
                }
            }
        }

       return true;
    }



}
