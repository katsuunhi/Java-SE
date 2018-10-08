
//	polymorephism test

	public class PolymorphismTest3 {
	   public static void main( String[] args )
	   {
		   SubClass3 b3 = new SubClass3();
		      SubClass4 b4 = new SubClass4();
		      SubSubClass bb = new SubSubClass();

		      SuperClass3 supper = b3;  				//向上转型并引用
		      System.out.println(supper.method());

		      supper = b4;
		      System.out.println(supper.method());

		      supper = bb;
		      System.out.println(supper.method());

		      supper.otherMethod();					//调用没有被覆盖的超类方法
	   }
	}
	
	
