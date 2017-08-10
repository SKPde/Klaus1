
public class ListeF {
	private Comparable[] element; // Inhalte der Listenelemente
	private int lastIndex; // Index des letzten Elements

	public ListeF(int len) {
		element = new Comparable[len];
		lastIndex = -1; // leere Liste
	}

	public void sortedInsert(Comparable o) {

		//Comparable[] temp = new Comparable[element.length];

		if (lastIndex >= element.length - 1) {
			throw new RuntimeException("Liste Voll! Bitte keine weiteren Elemente mehr einfügen.");
		} else {
			lastIndex++;
		}
		element[lastIndex] = o;

		int anzahl = 0;
		for(int x = 0; x < element.length; x++) {
			if(element[x] != null) {
				anzahl++;
			}
		}
		if(anzahl > 1) {
			for(int x = 0; x < anzahl-1; x++) {
				if(element[x+1].compareTo(element[x]) < 0) {
					Comparable temp1 = element[x];
					Comparable temp2 = element[x+1];
					element[x] = temp2;
					element[x+1] = temp1;
				}
			}
		}

	}

	public String toString() {
		String ausgabe = "";

		for (int x = 0; x < element.length; x++) {
			if (element[x] != null) {
				ausgabe = ausgabe + " " + element[x].toString();
			}
		}

		return ausgabe;
	}
}
