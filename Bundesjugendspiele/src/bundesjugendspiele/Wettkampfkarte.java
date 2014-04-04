package bundesjugendspiele;

public class Wettkampfkarte {
	// Membervariablen
	private final String strName, strVorname, strKlasse;
    private final int iJahrgang;
	private int iLaufpunkte, iSprungpunkte, iWurfpunkte;
	
	// Konstruktor
	public Wettkampfkarte (String Name, String Vorname,
							String Klasse, int Jahrgang){
		strName = Name;
		strVorname = Vorname;
		strKlasse = Klasse;
		iJahrgang = Jahrgang;
		iLaufpunkte = 0;
		iSprungpunkte = 0;
		iWurfpunkte = 0;
	}
	
	// Methoden ("Void-Funktionen"^^)
	public void setzeLaufpunkte (int Punkte){
		iLaufpunkte = Punkte;
	}
	
	public void setzeSprungpunkte (int Punkte){
		iSprungpunkte = Punkte;
	}
	
	public void setzeWurfpunkte (int Punkte){
		iWurfpunkte = Punkte;
	}
	
	// Funktionen
	public String name (){
		return strName;
	}
	
	public String vorname (){
		return strVorname;
	}
	
	public String klasse (){
		return strKlasse;
	}
	
	public int jahrgang (){
		return iJahrgang;
	}
	
	public int laufpunkte (){
		return iLaufpunkte;
	}
	
	public int sprungpunkte (){
		return iSprungpunkte;
	}
	
	public int wurfpunkte (){
		return iWurfpunkte;
	}
	
}
