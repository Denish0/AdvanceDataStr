public class RoomDimension {
	private Double length;
	private Double width;
	
	public RoomDimension(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getLenth() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
		
	public double getArea() {
		return length*width;
	}
	
	public String toString() {
		return "Room dimension: Length = " + length + ", "
				+ "Width = " + width;
	}
}
