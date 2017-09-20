package afvink3;

public class Student {
	private String naam;
	private int studentnummer;
	
	
	public Student(String string, int i) {
		setNaam(string);
		setStudentnummer(i);
		}
	
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public int getStudentnummer() {
		return studentnummer;
	}
	public void setStudentnummer(int studentnummer) {
		this.studentnummer = studentnummer;
	}
	
	public void getInfo() {
		System.out.println("naam: " +naam+ " studentnummer: "+studentnummer);
	}
	
	
	
	
/*
 Schrijf een class Student. De class Student heeft de private instance variabele
naam en studentnummer. Deze class heeft de mogelijkheid setNaam om een
naam te zetten in de instance variabele naam. Met de getNaam methode wordt
de naam opgehaald. Beide methodes zijn public. Pas dezelfde getter en setters
toe voor studentnummer.
2) Schrijf een niet grafische applicatie class die studenten kan initialiseren en 4
verschillende studenten kan maken.
3) Breid de Student class uit met een constructor die het mogelijk maakt bij
initialisatie al de het studentnummer en de studentennaam mee te geven.
4) Zorg voor overloading van de constructor zodat het mogelijk is om zowel met
alleen een studentnummer als met studentnummer en naam een student te
instantiëren. Sluit daarbij uit dat een lege student kan worden geïnstantieerd.
 */
}
