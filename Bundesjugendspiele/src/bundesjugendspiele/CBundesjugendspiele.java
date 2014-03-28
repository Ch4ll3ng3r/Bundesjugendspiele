package bundesjugendspiele;

public class CBundesjugendspiele {

	public static void main(String[] args) {
		
		CWettkampfkarte TestSpieler = new CWettkampfkarte("Krenzler", "Simon", "Q1", 1996);
		System.out.println(TestSpieler.name() + "\n"
				+ TestSpieler.vorname() + "\n"
				+ TestSpieler.klasse() + "\n"
				+ TestSpieler.jahrgang());

		//Window folgt
	}

}
