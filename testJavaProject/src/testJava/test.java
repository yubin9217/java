package testJava;

public class test extends father{

	int var3;
	static int staticVar=0;
	test(int a) {
		//super.var0=a;
		super();//父类的构造方法
		this.var3=a;
		super.var0=(char)(a-3);
	}
	
	public class innerClass{
		char innerVar0;
		innerClass(){
			innerVar0=(char)4;
			System.out.println("内部动态类执行了");
		}
		public void funInnera(){
			System.out.println((int)innerVar0);
		}
	}
	/*内部静态类是不能引用外部动态成员和变量的*/
	public static class innerStaticClass{
		public static int innerStaticVar=6;
		public int changeStaticVar() {
			staticVar=5;//外部的静态成员是可以被引用的
			return staticVar;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test testObj0=new test(3);
		System.out.println("父类的var0" + "=" + (int)testObj0.var0);
		System.out.println("在子类中如果存在和父类一样的成员变量，则子类会覆盖掉父类的元素");
		System.out.println((int)testObj0.var2);
		test.innerClass testInnerClass = new test(3).new innerClass();
		testInnerClass.funInnera();
		test.innerStaticClass testStaticClass=new test.innerStaticClass();//内部静态类的引用办法
		System.out.println(test.innerStaticClass.innerStaticVar);//对于动态类中的静态类，可以采用直接的方法去访问其中的静态变量
	}

}
