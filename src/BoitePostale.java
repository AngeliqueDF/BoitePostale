import java.util.ArrayList;

public class BoitePostale {
    ArrayList<Courrier> courriers = new ArrayList<Courrier>();

    public static void main(String[] args) {
        Lettre let1 = new Lettre(2.1, "Adress 1", false);
        Lettre let2 = new Lettre(1.2, "Adress 2", true);
        Colis col1 = new Colis(3.1, 7.0, "Adress 3", true);

        BoitePostale bp = new BoitePostale();
        bp.enregistrer(let1);
        bp.enregistrer(let2);
        bp.enregistrer(col1);
        bp.afficherCourriers();
    }

    public void enregistrer(Courrier nvCourrier) {
        nvCourrier.affranchir();
        courriers.add(nvCourrier);
    }

    public void afficherCourriers() {
        for (int i = 0; i < courriers.size(); i++) {
            System.out.println(courriers.get(i));
        }
    }
}
