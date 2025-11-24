package excercice2;

public class Vehicule {
    private String nom;
    private double prix;

    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }
    
    public String afficherInformations() {
        return "Nom : " + nom +" "+ " Prix : " + prix;
    }
    
    
    public void emettreSon() {
        System.out.println("Le véhicule émet un son inconnu.");
    }
    


}
