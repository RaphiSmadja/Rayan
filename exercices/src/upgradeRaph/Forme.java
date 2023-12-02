package upgradeRaph;

public abstract class Forme {
    protected String nom;
    private double aire = 0.0;

    public Forme(String nom) {
        this.nom = nom;
    }

    public abstract double calculerAire();
}
