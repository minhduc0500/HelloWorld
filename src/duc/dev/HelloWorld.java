package duc.dev;

public class HelloWorld 
{

	public static void main(String[] args) 
 {
	      double a=2;
	      double b=5;
	      double c=1;
	      double delta;
	      double x1,x2;
	      delta = (b*b)-(4*a*c);
     if (delta <0)
	{   
    	 System.out.println("phuong trinh vo nghiem");
		
	}
    if (delta >0)
    { 
    	  x1=(-b+Math.sqrt(delta)/(2*a));
          x2=(-b-Math.sqrt(delta)/(2*a));
        System.out.println("x1= " +x1);
        System.out.println(" x2 =" + x2);
    
    }
    if (delta ==0)
    {
    	  x1 =-b/(2*a);
        System.out.println("phuong trinh co nghiem kep x = " +x1 );
    }
  }
}