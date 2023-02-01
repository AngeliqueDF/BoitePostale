public class Lettre implements Courrier {
    double poids;

    String dest;

    boolean envoiExpress;

    double coutAffr;

    public Lettre(double poids, String dest, boolean envoiExpress) {
        if (poids > 30.0)
            throw new RuntimeException("Erreur : le poids du colis ne doit pas dépasser 30g");
        this.poids = poids;
        this.dest = dest;
        this.envoiExpress = envoiExpress;
    }

    @Override
    public double getPoids() {
        return poids;
    }

    @Override
    public void setPoids(double nvPoids) {
        poids = nvPoids;
    }

    @Override
    public String getDest() {
        return dest;
    }

    @Override
    public void setDest(String nvDest) {
        dest = nvDest;
    }

    @Override
    public int getEnvoiExpress() {
        return 0;
    }

    @Override
    public void setEnvoiExpress(boolean envoiExpress) {
        this.envoiExpress = envoiExpress;
    }

    @Override
    public double getCoutAffr() {
        return 0;
    }

    @Override
    public void setCoutAffr(double nvCoutAffr) {
        coutAffr = nvCoutAffr;
    }

    @Override
    public double affranchir() {
        double res = 2.5 + (0.01 * poids);
        if (envoiExpress) res = 2 * res;
        setCoutAffr(res);
        return res;
    }

    @Override
    public String toString() {
        String res = "Type de courrier : lettre.\n";
        res += "Poids : " + getPoids() + "g.\n";
        res += "Destination : " + getDest() + ".\n";
        if (envoiExpress) {
            res += "Type d'envoi : express" + ".\n";
        } else {
            res += "Type d'envoi : normal" + ".\n";
        }
        res += "Coût d'affranchissement " + affranchir() + "€\n";
        return res;
    }
}
