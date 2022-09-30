package rownanie;

public class LiczbyRownania {
    int pierwszaCyfra;
    int drugaLiczba;
    int trzeciaLiczba;
    int czwartaLiczba;
    int piataCyfra;

    boolean prawidłowaKombinacja;

    public LiczbyRownania() {
    }

    public LiczbyRownania(int pierwszaCyfra, int drugaLiczba, int trzeciaLiczba, int czwartaLiczba, int piataCygra, boolean prawidłowaKombinacja) {
        this.pierwszaCyfra = pierwszaCyfra;
        this.drugaLiczba = drugaLiczba;
        this.trzeciaLiczba = trzeciaLiczba;
        this.czwartaLiczba = czwartaLiczba;
        this.piataCyfra = piataCygra;
        this.prawidłowaKombinacja = prawidłowaKombinacja;
    }

    public int getPierwszaCyfra() {
        return pierwszaCyfra;
    }

    public void setPierwszaCyfra(String pierwszaCyfra) {
        this.pierwszaCyfra = Integer.parseInt(pierwszaCyfra);
    }

    public int getDrugaLiczba() {
        return drugaLiczba;
    }

    public void setDrugaLiczba(String drugaLiczba) {
        this.drugaLiczba = Integer.parseInt(drugaLiczba);
    }

    public int getTrzeciaLiczba() {
        return trzeciaLiczba;
    }

    public void setTrzeciaLiczba(String trzeciaLiczba) {
        this.trzeciaLiczba = Integer.parseInt(trzeciaLiczba);
    }

    public int getCzwartaLiczba() {
        return czwartaLiczba;
    }

    public void setCzwartaLiczba(String czwartaLiczba) {
        this.czwartaLiczba = Integer.parseInt(czwartaLiczba);
    }

    public int getPiataCyfra() {
        return piataCyfra;
    }

    public void setPiataCyfra(String piataCyfra) {
        this.piataCyfra = Integer.parseInt(piataCyfra);
    }

    public boolean isPrawidłowaKombinacja() {
        return prawidłowaKombinacja;
    }

    public void setPrawidłowaKombinacja(boolean prawidłowaKombinacja) {
        this.prawidłowaKombinacja = prawidłowaKombinacja;
    }
}

