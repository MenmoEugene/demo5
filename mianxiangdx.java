/*
��Ա�����;ֲ��������÷�Χ��

��Ա�����������������С��ֲ����������ں�����������С�

���ڴ��е�λ�ã�
��Ա�������ڶ��ڴ��У���Ϊ����Ĵ��ڣ������ڴ��д��ڡ�
�ֲ�����������ջ�ڴ��С�
*/
//ʵ�ֹ���
	class Car
	{
	    String color="red",name="Barry ";
	    int num = 1;
	    void run()
		{
		   System.out.println("run!"+name+color+"; hero:"+num);
		}
	}
//���������ö���
class mianxiangdx
{
      public static void main(String[] args)
	{
		Car c = new Car();
		
		c.color = "blue";
		c.num = 3;
		c.run();

		Car c1 = new Car();
		c1.run();		
	}
      
}

/*
new Car().cun();

��������ʹ�÷���һ�����Զ���ķ���ֻ����һ��ʱ������ʹ�ã������Ƚϼ򻯡�

�����һ��������ж����Ա���ã��������������������֡�

��������ʹ�÷����������Խ�����������Ϊʵ�ʲ������д��ݡ�

*/