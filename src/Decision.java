
public class Decision {
	private String pays;
	private int v;
	private int c2;
	
	public Decision(String pays, int v, int c2) {
		this.pays = pays;
		this.v = v;
		this.c2 = c2;
	}
	
	/*
	 * Verifica se a string pays e igual a "pays"
	 * Outro cenario seria "gets"
	 */
	private boolean checkPays() {
		return pays.equals("pays");
	}

	public String getPays() {
		return pays;
	}

	public int getV() {
		return v;
	}

	public int getC2() {
		return c2;
	}
	
	
}
