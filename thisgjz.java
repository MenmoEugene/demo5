/*
this��䣺���ڹ��캯��֮����л�����á�

this���ֻ�ܶ����ڹ��캯���ĵ�һ�У���Ϊ��ʼ����Ҫ��ִ�С�
*/

class Person
{
	private String name;
	private int age;
	
	Person()
	{

	}	

	Person( String name)
	{
	       this.name =name;
	}
	Person(String name,int age)
	{
	        this(name);
	        this.age= age;
	         System.out.print(name+age);
	}
}
class  thisgjz
{
	public static void main(String[] args)
	{
		Person p = new Person("menmo",23);
	}
}