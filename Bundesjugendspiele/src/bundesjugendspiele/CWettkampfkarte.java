package bundesjugendspiele;

public class CWettkampfkarte {
	// Membervariablen
	private final String m_strName, m_strVorname, m_strKlasse;
    private final int m_iJahrgang;
	private int m_iLaufpunkte, m_iSprungpunkte, m_iWurfpunkte;
	
	// Konstruktor
	public CWettkampfkarte (String p_strName, String p_strVorname,
							String p_strKlasse, int p_iJahrgang){
		m_strName = p_strName;
		m_strVorname = p_strVorname;
		m_strKlasse = p_strKlasse;
		m_iJahrgang = p_iJahrgang;
		m_iLaufpunkte = 0;
		m_iSprungpunkte = 0;
		m_iWurfpunkte = 0;
	}
	
	// Methoden ("Void-Funktionen"^^)
	public void setzeLaufpunkte (int p_iPunkte){
		m_iLaufpunkte = p_iPunkte;
	}
	
	public void setzeSprungpunkte (int p_iPunkte){
		m_iSprungpunkte = p_iPunkte;
	}
	
	public void setzeWurfpunkte (int p_iPunkte){
		m_iWurfpunkte = p_iPunkte;
	}
	
	// Funktionen
	public String name (){
		return m_strName;
	}
	
	public String vorname (){
		return m_strVorname;
	}
	
	public String klasse (){
		return m_strKlasse;
	}
	
	public int jahrgang (){
		return m_iJahrgang;
	}
	
	public int laufpunkte (){
		return m_iLaufpunkte;
	}
	
	public int sprungpunkte (){
		return m_iSprungpunkte;
	}
	
	public int wurfpunkte (){
		return m_iWurfpunkte;
	}
	
}
