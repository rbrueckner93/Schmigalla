public class Station {
	public static final int anzahlStationen = 5;
	public int[] stationen = new int[anzahlStationen];
	public int[][] beziehungen = new int[anzahlStationen][anzahlStationen];
	public Station(int[] stationen, int[][] beziehungen) {
		super();
		this.stationen = stationen;
		this.beziehungen = beziehungen;
	}
	public int[] getStationen() {
		return stationen;
	}
	public void setStationen(int[] stationen) {
		this.stationen = stationen;
	}
	public int[][] getBeziehungen() {
		return beziehungen;
	}
	public void setBeziehungen(int[][] beziehungen) {
		this.beziehungen = beziehungen;
	}
	public static int getAnzahlstationen() {
		return anzahlStationen;
	}

}
