/*
private��˽�У�Ȩ�����η��������������еĳ�Ա����Ա��������Ա������
˽��ֻ�ڱ�������Ч��

��age˽���Ժ������⼴ʹ�����˶���Ҳ����ֱ�ӷ��ʡ�
������Ӧ�������䣬����Ҫ��person�����ṩ��Ӧ����age�ķ�ʽ��
*/

class Person
{
   private int age;

   public void setAge(int a)//����
   {
	age = a;
   }
/*

 	public void getAge()//��ȡ
   	 {
		return age��
  	 }
*/
   void speak()
  {
	System.out.println("age="+age);
   }
}

class siyou
{
       public static void main(String[] args)
	{
		Person p =new Person();
		p.speak();
		p.setAge(20);
	}
}