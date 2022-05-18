import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			String[] line0 = in.readLine().split(" ");
			//number of challenges
			int c =  Integer.parseInt(line0[0]);
			//Number of decisions available
			int d =  Integer.parseInt(line0[1]);
			//o jogo que vamos usar
			AWG awg = new AWG(c,d);
			
			//encher o grafo de decisoes
			for(int i = 0; i < d; i++) {
				String[] current = in.readLine().split(" ");
				int c1 = Integer.parseInt(current[0]);
				String pays = current[1];
				int v = Integer.parseInt(current[2]);
				int c2 = Integer.parseInt(current[3]);
				
			}
			
			String[] eline = in.readLine().split(" ");
			//desafio inicial
			int initial =  Integer.parseInt(eline[0]);
			//desafio do magico
			int end =  Integer.parseInt(eline[1]);
			//energia inicial
			int energy =  Integer.parseInt(eline[2]);
			awg.endLine(initial, end, energy);
			

		}catch(IOException e ){
			e.printStackTrace();
		}
		finally{
			
		}
	}
}


