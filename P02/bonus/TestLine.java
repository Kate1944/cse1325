public class TestLine {
	public static void main (String[] args) {

		Line a = new Line(Color.FUSCHIA, 1, 2, 3, 4);
		Line b = new Line(Color.CERULEAN, 5.45, 8.12, 9.78, 2.63);
		//Color e = new Color((245*65536)+(30*256)+(223));
		//Color.Color((245*65536)+(30*256)+(223));
		
		Line c = new Line(Color.SAFFRON, 6, 6, 6, 6);
		Line d = new Line(Color.VERMILION, 4.456456, 58.49575, 5.123, 10.2);
		
		//System.out.print(e);
		//System.out.print(rgb);
		System.out.print(a);
		System.out.println(a.length());
		
		System.out.print(b);
		System.out.println(b.length());
		
		System.out.print(c);
		System.out.println(c.length());
		
		System.out.print(d);
		System.out.println(d.length());
	}
}
