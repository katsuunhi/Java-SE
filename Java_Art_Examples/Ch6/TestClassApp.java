//Demo: test this as return type

class TestClass{
	private String message;
	public TestClass( String message) {this.message = message; }
	public TestClass method () {return this;}
	public String toString() { return message; }
}

public class TestClassApp {
    public static void main(String[] args) {
        TestClass myObj = new TestClass("Java");
		TestClass yourObj = new TestClass("OOP");
        System.out.println(myObj.method());
        System.out.println(yourObj.method().toString() );
    }
}
