
//abstract class Shape

public abstract class Shape implements Cloneable{
	protected double x1, y1, x2, y2;
	public Shape() {
		x1 = y1 = x2 = y2 = 0.0;
	}
	public Shape(double x1, double y1, double x2, double y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}

	public String toString() {
		String message = "(" + x1 + "," + y1 + "), ("
		 		+ x2 + "," + y2 + ")\n";
		 return message;
		 }
	protected Object clone() throws CloneNotSupportedException {
	  	return super.clone();
  	}

	public abstract void computeArea();		//定义抽象方法
	public abstract void computeVolume();
	public abstract double getArea();
	public abstract double getVolume();
}
