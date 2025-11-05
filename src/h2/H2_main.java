package h2;

public class H2_main {

	public static void main(String[] args) {
		int jahr = 1345; boolean schalt = true;
		
		if (jahr % 400 == 0) {
			schalt = true;
		}
		else if (jahr % 100 == 0) {
			schalt = false;
		}
		else if (jahr % 4 == 0) {
			schalt = true;
		}
		else {
			schalt = false;
		}
		// TODO Auto-generated method stub
		

	}

}
