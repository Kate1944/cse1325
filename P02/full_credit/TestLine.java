public class TestLine {
	public static void main (String[] args) {

		Line a = new Line(Color.FUSCHIA, 1, 2, 3, 4);
		a.length();
		Line b = new Line(Color.CERULEAN, 5.45, 8.12, 9.78, 2.63);
		Line c = new Line(Color.SAFFRON, 6, 6, 6, 6);
		System.out.println(a);
		System.out.println(a.length());
		//System.out.println(b + l);
		//System.out.println(c + l);
	}
}
