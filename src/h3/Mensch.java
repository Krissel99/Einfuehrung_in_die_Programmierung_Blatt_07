package h3;

public class Mensch {

    public String name;
    public int gebJahr;
    public int alter;

    public Mensch() {
    }

    public Mensch(String name, int gebJahr) {
        this.name    = name;
        this.gebJahr = gebJahr;
        this.alter   = 2025-gebJahr;
    }

    public Mensch(String name, int gebJahr, int alter) {
        this.name    = name;
        this.gebJahr = gebJahr;
        this.alter   = alter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGebJahr(int gebJahr) {
        this.gebJahr = gebJahr;
    }

    public void setAlter() {
        this.alter = 2025-gebJahr;
    }

    public String getName() {
        return this.name;
    }

    public int getGebJahr() {
        return this.gebJahr;
    }

    public int getAlter() {
        return this.alter;
    }
}