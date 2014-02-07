public class productToNumber {
   public static void main(String[] args) {

	int num1;
	num1 = Integer.parseInt(args[0].toString());
	int contador1;
	contador1 = 0;


	String msg1 = "" + num1 + "! = ";
	System.out.print(msg1);


	while( contador1 != num1)
	{   
	   msg1 = "" + contador1 + "x";
	   System.out.print(msg1);
	   contador1++;
	}

	msg1 = "" + contador1 +".";
	System.out.print(msg1);
   }
}


	
