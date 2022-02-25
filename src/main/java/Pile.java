public class Pile {

	private int sommet;
	private int[] lesElements;

	public Pile(int i) {
		// TODO Auto-generated constructor stub
		this.sommet = -1;
		this.lesElements = new int[i];
	}

	public static Pile CreerPile(int i) {
		// TODO Auto-generated method stub
		return new Pile(i);
	}

	public boolean est_vide() {
		// TODO Auto-generated method stub
		return this.sommet == -1;
	}

	public void empiler(int valeur) {
		// TODO Auto-generated method stub
		this.sommet++;
		this.lesElements[this.sommet] = valeur;
		
	}

	public int depiler() {
		// TODO Auto-generated method stub
		this.sommet--;
		return this.lesElements[this.sommet+1];
	}

	public int sommet() {
		// TODO Auto-generated method stub
		return this.lesElements[this.sommet];
	}

	public void vider() {
		// TODO Auto-generated method stub
		this.sommet = -1;
	}

}
