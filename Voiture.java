package excercice2;

public class Voiture extends Vehicule{
	private String model;
	private String annee;
	
	public Voiture(String nom,double prix,String model,String annee) {
		super(nom,prix);
		this.model=model;
		this.annee=annee;
	}
	
	public String toString() {
		return super.afficherInformations()+" "+"Model :"+model+" "+"Annee :"+annee;
	}
	
	public void emettreSon() {
		System.out.println("La voiture vrombit.");
	}
	
}
