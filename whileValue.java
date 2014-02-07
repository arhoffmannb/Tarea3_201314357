public class whileValue {
   public static void main(String[] args) {

	int valor1;
	valor1 = Integer.parseInt(args[0].toString());
	int contador1;
	contador1 = 0;

	do
	{
	   System.out.println("El valor actual es: " + contador1);
	   contador1++;
	}while (contador1 < valor1);
   }
}

	
