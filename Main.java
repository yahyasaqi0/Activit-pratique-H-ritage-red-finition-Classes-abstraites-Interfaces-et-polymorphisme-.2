package excercice2;

public class Main {

	public static void main(String[] args) {
		System.out.println("--Les info de voiture--");
		Voiture v=new Voiture("BMW", 300000, "ANCIEN", "1997-02-20");
		v.emettreSon();
		System.out.println(v);	
		System.out.println("--Les info de Moto--");
		Moto m=new Moto("MT-09", 120000, "YAMAHA", "119");
		m.emettreSon();
		System.out.println(m);	
		System.out.println("--Les info de Avion--");
		Avion a=new Avion("Air France", 2000000000, "FTR France", 300);
		a.emettreSon();
		System.out.println(a);	

	}

}
