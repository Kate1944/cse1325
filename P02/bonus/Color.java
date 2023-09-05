public enum Color {FUSCHIA((245*65536)+(30*256)+(223)), SAFFRON((247*65536)+(208*256)+(12)), VERMILION((193*65536)+(9*256)+(9)), CERULEAN((63*65536)+(193*256)+(240));

	private final int rgb;
	
	private Color (int rgb) {
	this.rgb = rgb;
	}
	
	@Override
	public String toString() {
	return this.name() + " (" + rgb + ")";
	} 
}
