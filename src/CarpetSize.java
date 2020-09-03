public class CarpetSize {
	protected RoomDimension roomDim;
	protected double CarpetCost;
	
	public CarpetSize(RoomDimension roomDim, double CarpetCost) {
		this.roomDim = roomDim;
		this.CarpetCost = CarpetCost;
	}
	
	public double getTotalCharge() {
		return roomDim.getArea()*CarpetCost;
	}
	
	public RoomDimension getSize() {
		return roomDim;
	}
	
	public double getCarpetCost() {
		return CarpetCost;
	}
	
	public String toString() {
		return "Cost per square feet = $" + CarpetCost + ","
				+ " Your Total Charge = $" + getTotalCharge() + "";
	}
	
}
