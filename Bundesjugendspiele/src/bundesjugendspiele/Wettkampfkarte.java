package bundesjugendspiele;

public class Wettkampfkarte {
	// Membervariablen
	private final String strName, strVorname, strKlasse;
    private final int iJahrgang;
	private int iLaufpunkte, iSprungpunkte, iWurfpunkte;
	
	// Konstruktor
	public Wettkampfkarte (String p_strName, String p_strVorname,
							String p_strKlasse, int p_iJahrgang){
		strName = p_strName;
		strVorname = p_strVorname;
		strKlasse = p_strKlasse;
		iJahrgang = p_iJahrgang;
		iLaufpunkte = 0;
		iSprungpunkte = 0;
		iWurfpunkte = 0;
	}
	
	// Methoden ("Void-Funktionen"^^)
	public void setzeLaufpunkte (int p_iPunkte){
		iLaufpunkte = p_iPunkte;
	}
	
	public void setzeSprungpunkte (int p_iPunkte){
		iSprungpunkte = p_iPunkte;
	}
	
	public void setzeWurfpunkte (int p_iPunkte){
		iWurfpunkte = p_iPunkte;
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
