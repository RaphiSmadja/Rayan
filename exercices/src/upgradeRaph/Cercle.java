package upgradeRaph;

public class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon, String nom){
        super(nom);
        this.rayon = rayon;
    }


    @Override
    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }
}
