package h3;

public class H3_main {
    public static void main(String[] args) {
        Mensch Elsa = new Mensch();
        Elsa.setName("Elsa");
        Elsa.setGebJahr(2012);
        Elsa.setAlter();

        Mensch Anna = new Mensch("Anna", 2010, 15);


        System.out.println("Name: "+Elsa.getName()+", Geburtsjahr: "+Elsa.getGebJahr()+", Alter: "+Elsa.getAlter());
    }
}