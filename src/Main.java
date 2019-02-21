public class Main {

    public static void main(String[] args) {
        Samochod samochod = new Sedan();
        if (samochod instanceof Wywrotka) {
            Wywrotka wywrotka = (Wywrotka) samochod;
        } else {
            System.out.println("to nie jest wywrotka");
        }
        Samochod samochodnowy = new SamochodCiezarowy();
        Samochod sam2 = new SamochodOsobowy();
        wyswietlTypSamochodu(samochodnowy);
        wyswietlTypSamochodu(sam2);
        wyswietlTypSamochodu(new Mercedes());
        wyswietlTypSamochodu(new Scania());
    }
    public static void wyswietlTypSamochodu (Samochod samochodnowy){
        System.out.println(samochodnowy.getClass().getCanonicalName());
    }
}
