package h1;

//Überladen von Methoden kommt immer in der Klausur dran
public class H1_main {
    public static void main(String[] args) {
        Zahl meineZahl = new Zahl();
        meineZahl.num = 160;

//        Zahl neueZahl = new Zahl(42);

        System.out.println("Nummer: "+meineZahl.num);
        System.out.println("Gerade: "+meineZahl.even);
        System.out.println("Klein: "+meineZahl.small);
        System.out.println("Positiv: "+meineZahl.positive);

    }
}