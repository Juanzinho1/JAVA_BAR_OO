package entities;

public class Bill {

		public char gender;
		public int beer;
		public static final int BEER = 5;
		public int barbecue;
		public static final int BARBECUE = 7;
		public int softDrink;
		public static final int SOFTDRINK = 3;
	
	
		public double cover () {
			if (feeding() <= 30) {
				return 4;
			} else {
				return 0;
			}
		}
	
		public double feeding () {
			return (beer * BEER) + (softDrink * SOFTDRINK) + (barbecue * BARBECUE);
		}
	
		public double ticket () {
			if (gender == 'F') {
				return 8;
			} else {
				return 10;
			}
		}
	
		public double total () {
			return cover() + feeding() + ticket();
		}
}
