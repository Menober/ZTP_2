public class Pies implements Cloneable{
    private String imie;
    private Integer wiek;

    public Pies(String imie, Integer wiek){
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public Pies clone() {
        return new Pies(imie, wiek);
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return imie + " " + wiek;
    }
}
