package h1;

public class H1_main {

	public static void main(String[] args) {
		double guthaben = 2.34;
		double monEingang = 113.09;
		int rating = 14;
		boolean warnhinweis = false;
		boolean negativ = true;

		if (guthaben < 0) {
			negativ = true;
		} else {
			negativ = false;
		}
		if (guthaben > 0) {
			rating += 3;
		}
		if (guthaben == 0) {
			rating += 2;
		}
		if (guthaben < 0) {
			if (-guthaben - monEingang >= 0) {
				rating += 1;
			} else {
				rating -= 1;
			}
		}
		
		warnhinweis = false;

		if (guthaben < 0) {
			if (-guthaben - monEingang < 0) {
				if (rating < 0) {
					warnhinweis = true;
				}

			}
		}
		
		// TODO Auto-generated method stub

	} // Sie dürfen davon ausgehen, dass monEingang stets mindestens den Wert 0 hat.
		// Musste das am Ende stehen

}
