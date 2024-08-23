public class Circle {

    private double radius;
    private String colour;

    public Circle(){
        radius = 5.4;
        colour = "Red";
    }
    public Circle(double r){
        radius = r;
        colour ="Red";
    }
    public Circle(double r,String c){
        radius = r;
        colour = c;
    }
    public double getRadius(){
        return radius;
    }
    public String getColour(){
        return colour;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
	public String toString(){
		return("This Circle has a radius of :"+this.radius+" and colour of :"+this.colour);
	}
	
	
}
