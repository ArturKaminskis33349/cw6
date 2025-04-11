public class MediaBiblioteczne {
    protected String tytul;
    protected int rokWydania;
    protected boolean dostepny;

    MediaBiblioteczne(String tytul, int rokWydania) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.dostepny = true;
    }

    public void wypozycz(){
        if(dostepny){
            dostepny = false;
            System.out.println("Medium zostało wypozyczone.\n");
        }else{
            System.out.println("Medium jest juz wypozyczone.\n");
        }
    }
    public void zwroc(){
        if(!dostepny){
            dostepny = true;
            System.out.println("Medium zostalo zwrocone.\n");
        }else{
            System.out.println("Medium nie bylo wypozyczone.\n");
        }
    }
    public void wyswietlInformacje(){
        System.out.println("Tytul: "+tytul+" rok wydania: "+rokWydania+ (dostepny ? " dostepne" : " Wypozyczone"));
    }
}
