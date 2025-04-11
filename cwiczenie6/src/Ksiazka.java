public class Ksiazka extends MediaBiblioteczne{
    private String autor;
    private int liczbaStron;

    Ksiazka(String tytul, int rokWydania, String autor, int liczbaStron) {
        super(tytul, rokWydania);
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }
    @Override
    public void wyswietlInformacje(){
        super.wyswietlInformacje();
        System.out.println("Autor: " + autor+" Liczba Stron: " + liczbaStron);
    }
    public void sprawdzLiczbeStron(){
        if(liczbaStron > 500){
            System.out.println("To dluga ksiazka, liczba Stron: " + liczbaStron);
        }else{
            System.out.println("To standardowa ksiazka, liczba Stron: " + liczbaStron);
        }
    }
}
