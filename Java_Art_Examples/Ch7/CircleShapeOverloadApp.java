//the driver class for CircleOverload

public class CircleShapeOverloadApp{

	public static void main(String[] args) {

		CircleOverload myCircle = new CircleOverload();

		myCircle.computeRadius(0, 0, 1, 1);	//call overloaded method
		myCircle.computeArea();
		System.out.println("My circle area: " + myCircle.getArea());
		
		SphereOverload mySphere = new SphereOverload();
		mySphere.computeArea(10);								//调用重载方法
		System.out.println("My sphere area: " + mySphere.getArea());

		mySphere = new SphereOverload(5.5);
		mySphere.computeArea();									//调用重载方法
		System.out.println("My sphere area: " + mySphere.getArea());

 	}

}