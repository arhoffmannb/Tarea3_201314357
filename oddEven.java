public class oddEven {
    public static void main(String[] args) {


	int num1;
	num1 = Integer.parseInt(args[0].toString());

	String msg1 = "El número " + num1 + " es par";
	String msg2 = "El número " + num1 + " es impar";

	

	if ( (num1 % 2) == 0 ) {
	   System.out.println( msg1);
	}else{
	   System.out.println( msg2);
	}   
	

     }
}