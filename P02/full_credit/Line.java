public class Line {
	private double x1; //these are fields
	private double x2;
	private double y1;
	private double y2;
	private Color color;
	
	public Line (Color color, double x1, double x2, double y1, double y2) {
		this.x1 = x1; //this assigns parameter x1 to field x1
		this.x2 = x2; //this is a constructor
		this.y1 = y1;
		this.y2 = y2;
		this.color = color;
	}
	
	public double length() {
		double l = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		return l; //this is a method
	}
	
	@Override
	public String toString() {
		return color + " (" + x1 + ", " + x2 + ")-(" + y1 + ", " + y2 + ") has length ";
	}
}
