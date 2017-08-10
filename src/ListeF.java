
public class ListeF {
	private Comparable[] element; // Inhalte der Listenelemente
	private int lastIndex; // Index des letzten Elements

	public ListeF(int len) {
		element = new Comparable[len];
		lastIndex = -1; // leere Liste
	}

	public void sortedInsert(Comparable o) {
		// sortiert einf ̈ugen
		if(lastIndex >= element.length-1) {
			throw new RuntimeException("Liste Voll! Bitte keine weiteren Elemente mehr einfügen.");
		} else {
			
		}

	}

}
