public class Film extends MediaBiblioteczne{
    private String rezyser;
    private int czasTrwania;

    Film(String rezyser, int czasTrwania, String tytul, int rokWydania) {
        super(tytul, rokWydania);
        this.rezyser = rezyser;
        this.czasTrwania = czasTrwania;
    }

    @Override
    public void wyswietlInformacje(){
        super.wyswietlInformacje();
        System.out.println("Rezyser: " + rezyser +" Czas Trwania: " + czasTrwania);
    }

    public void sprawdzCzasTrwania(){
        if(czasTrwania > 120){
            System.out.println("To dlugi film, czas trwania (min): " + czasTrwania);
        }else{
            System.out.println("To standardowy film, czas trwania (min): " + czasTrwania);
        }
    }
}
