package testJava;

public class test extends father{

	int var3;
	static int staticVar=0;
	test(int a) {
		//super.var0=a;
		super();//����Ĺ��췽��
		this.var3=a;
		super.var0=(char)(a-3);
	}
	
	public class innerClass{
		char innerVar0;
		innerClass(){
			innerVar0=(char)4;
			System.out.println("�ڲ���̬��ִ����");
		}
		public void funInnera(){
			System.out.println((int)innerVar0);
		}
	}
	/*�ڲ���̬���ǲ��������ⲿ��̬��Ա�ͱ�����*/
	public static class innerStaticClass{
		public static int innerStaticVar=6;
		public int changeStaticVar() {
			staticVar=5;//�ⲿ�ľ�̬��Ա�ǿ��Ա����õ�
			return staticVar;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test testObj0=new test(3);
		System.out.println("�����var0" + "=" + (int)testObj0.var0);
		System.out.println("��������������ں͸���һ���ĳ�Ա������������Ḳ�ǵ������Ԫ��");
		System.out.println((int)testObj0.var2);
		test.innerClass testInnerClass = new test(3).new innerClass();
		testInnerClass.funInnera();
		test.innerStaticClass testStaticClass=new test.innerStaticClass();//�ڲ���̬������ð취
		System.out.println(test.innerStaticClass.innerStaticVar);//���ڶ�̬���еľ�̬�࣬���Բ���ֱ�ӵķ���ȥ�������еľ�̬����
	}

}
