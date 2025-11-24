package excercice2;

public class Moto extends Vehicule{
	private String marque;
	private String puissance;
	
	public Moto(String nom,double prix,String marque, String puissance) {
		super(nom,prix);
		this.marque=marque;
		this.puissance=puissance;		
	}
	public String toString() {
		return super.afficherInformations()+" "+"Marque :"+marque+" "+"Puissance :"+puissance;
	}
	
	public void emettreSon() {
		System.out.println("La moto rugit.");
	}
}
