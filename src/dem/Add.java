package dem;

public class Add 
{
int a,b,c;
	public static void main(String[] args) 
	{
	Add a1=new Add();
	a1.a=10;
	a1.b=20;
	a1.c=a1.a+a1.b;
	
	Add a2=new Add();
	a2.a=40;
	a2.b=60;
	a2.c=a2.a+a2.b;
	
	Add a3=new Add();
	a3.a=55;
	a3.b=15;
	a3.c=a3.a+a3.b;
	
	
	System.out.println("The Sum of A1 is" +a1.c);
	System.out.println("The Sum of A2 is" +a2.c);
	System.out.println("The Sum of A3 is" +a3.c);
	
	

	}

}
