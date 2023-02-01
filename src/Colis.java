public class Colis implements Courrier {
    double poids;

    String dest;

    boolean envoiExpress;

    double coutAffr;
    double volume;

    Colis(double poids, double volume, String dest, boolean envoiExpress) {
        if (volume > 50)
            throw new RuntimeException("Erreur : le volum du colis ne doit pas dépasser 50 litres.");
        this.poids = poids;
        this.volume = volume;
        this.dest = dest;
        this.envoiExpress = envoiExpress;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
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
        double res = (0.25 * volume) + (0.01 * poids);
        if (envoiExpress) res = 2 * res;
        return res;
    }

    @Override
    public String toString() {
        String res = "Type de courrier : colis.\n";
        res += "Poids : " + getPoids() + "g.\n";
        res += "Volume : " + getVolume() + " litres.\n";
        res += "Destination : " + getDest() + ".\n";
        if (envoiExpress) {
            res += "Type d'envoi : express" + ".\n";
        } else {
            res += "Type d'envoi : normal" + ".\n";
        }
        res += "Coût d'affranchissement " + affranchir() + "\n";
        return res;
    }
}
