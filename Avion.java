package excercice2;

public class Avion extends Vehicule{
	private String compagnie;
	private int vitesseMax;
	
	public Avion(String nom,double prix,String compagnie,int vitesseMax) {
		super(nom,prix);
		this.compagnie=compagnie;
		this.vitesseMax=vitesseMax;
	}
	
	public String toString() {
		return super.afficherInformations()+" "+"Compagnie :"+compagnie+" "+"VitesseMax :"+vitesseMax;
	}
	
	public void emettreSon() {
		System.out.println("L'avion fait un bruit de moteur puissant.");
	}
	
}
