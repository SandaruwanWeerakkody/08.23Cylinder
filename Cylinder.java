public class Cylinder extends Circle{
	private double height;
	
	public Cylinder(){
		super();
		this.height =1.0;
	}
	public Cylinder(double height){
		super();
		this.height=height;
	}
	public Cylinder(double height,double radius){
		super(radius);
		this.height=height;
	}
	public Cylinder(double height,double radius,String colour){
		super(radius,colour);
		this.height=height;
	}
	public double getHeight(){
		return this.height;
	}
	@Override
	public double getVolume(){
		return super.getArea()*this.height;
	}
	
	@Override
	public double getArea(){
		return 2*3.14*getRadius()*height+2*super.getArea();
	}
	@Override
	public String toString(){
		return "This Cylinder has height : "+this.height+"  "+super.toString();
	}
}
