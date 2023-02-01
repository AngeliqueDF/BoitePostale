public interface Courrier {
    double poids = 0.0;
    String dest = "";
    boolean envoiExpress = false;
    double coutAffr = 0.0;

    double getPoids();

    void setPoids(double nvPoids);

    String getDest();

    void setDest(String nvDest);

    int getEnvoiExpress();

    void setEnvoiExpress(boolean envoiExpress);

    double getCoutAffr();

    void setCoutAffr(double nvCout);

    double affranchir();

    String toString();
}
