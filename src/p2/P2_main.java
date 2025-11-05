package p2;

public class P2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 4;
		int c = 1;
		int d = -5;
		
		d = 0;
		
		if(a==b) { //E1
			d++;
		}
		
		if(a==b) {//E2
			d++;
		}
		else if(a==c) {
			d++;
		}
		
		if(a+b>=c) {//E3
			d++;
		}
		
		if(a+b+c>=100) {//E4
			d++;
		}

	}

}
