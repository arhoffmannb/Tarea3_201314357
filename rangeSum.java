public class rangeSum {
    public static void main(String[] args) {

	int limin;
	limin = Integer.parseInt(args[0].toString());
	int limsu;
	limsu = Integer.parseInt(args[1].toString());
	int contador1;
	contador1 = limin + 1;


	do
	{
	   System.out.println(+contador1);
	   contador1++;
	}while(contador1 < limsu);
   }
} 