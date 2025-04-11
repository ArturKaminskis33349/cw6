public class TestBiblioteki {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Wiedzmin", 1990, "Andrzej Sapkowski", 320);
        Ksiazka ksiazka2 = new Ksiazka("fajna ksiazka", 123123, "Wieslaw Paleta", 122);

        Film film1 = new Film("Jan Matejko", 200, "Fajny film", 19000);
        Film film2 = new Film("Marek Maslanka", 100, "Elo many", 1231222);

        MediaBiblioteczne[] mediaArr = new MediaBiblioteczne[4];
        mediaArr[0] = ksiazka1;
        mediaArr[1] = ksiazka2;
        mediaArr[2] = film1;
        mediaArr[3] = film2;

        for(MediaBiblioteczne m : mediaArr){
            m.wyswietlInformacje();
            System.out.println("===============#=#=#==============");
        }
        ksiazka1.wypozycz();
        System.out.println("===============#=#=#==============");
        ksiazka1.wypozycz();
        System.out.println("===============#=#=#==============");
        ksiazka1.zwroc();
        System.out.println("===============#=#=#==============");
        ksiazka1.sprawdzLiczbeStron();
        System.out.println("===============#=#=#==============");
        film1.sprawdzCzasTrwania();
        System.out.println("===============#=#=#==============");

        for(MediaBiblioteczne m : mediaArr){
            if(m instanceof Ksiazka){
                Ksiazka k =  (Ksiazka)m;
                k.sprawdzLiczbeStron();
                System.out.println("===============#=#=#==============");
            }else if(m instanceof Film){
                ((Film) m).sprawdzCzasTrwania();
                System.out.println("===============#=#=#==============");
            }
        }
    }
}
