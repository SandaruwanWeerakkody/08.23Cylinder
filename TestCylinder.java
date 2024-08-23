public class TestCylinder{
	public static void main (String args[]){
		Cylinder cy1 = new Cylinder();
		Cylinder cy2 = new Cylinder(4);
		Cylinder cy3 = new Cylinder(4,5);
		Cylinder cy4 = new Cylinder(4,6,"Black");
		
		System.out.println(cy3.getVolume());
		System.out.println(cy3.getRadius());
		System.out.println(cy3.getColour());
		System.out.println(cy3.getArea());
		System.out.println(cy3.super.getArea());
		System.out.println(cy3.toString());
		
	}
}
