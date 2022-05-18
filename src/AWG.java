import java.util.LinkedList;
import java.util.List;

public class AWG {
	private int nChallenges;
	private int decisions;
	private int initial;
	private int end;
	private int energy;
	
	private List<Decision>[] edges;
	
	@SuppressWarnings("unchecked")
	public AWG(int c, int d) {
		this.nChallenges = c;
		this.decisions = d;
		edges = new List[c];
		
		for(int i = 0; i < c; i++) {
			edges[i] = new LinkedList<Decision>(); 
		}
		
	}
	
	public void endLine(int initial, int end, int energy) {
		this.initial = initial;
		this.end = end;
		this.energy = energy;
		
	}
	
	public void addPath(int c1, String pays, int v, int c2) {
			Decision dec = new Decision(pays, v, c2);
			this.edges[c1].add(dec);
	}
}
