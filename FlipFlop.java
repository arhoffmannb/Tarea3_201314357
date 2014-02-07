public class FlipFlop {
    public static void main(String[] args) {

	int entrada1;
	entrada1 = Integer.parseInt(args[0].toString());
	int evaluador;
	evaluador = 0;


	for(int contador1 = 0; contador1 <= entrada1; contador1++) {


	   if( (contador1%3 == 0) && (contador1%5 != 0) ){
	      evaluador = 0;
	   }else if( (contador1%5 ==0) && (contador1%3 != 0) ){
	      evaluador = 1;
	   }else if( (contador1%5 == 0)&&(contador1%3 == 0) ){
	      evaluador = 2;
	   }else{
	      evaluador = 3;
	   }

    
	switch (evaluador) {
	   case 0:
	      System.out.print("Flip, ");
	      break;
	   case 1:
	      System.out.print("Flop, ");
	      break;
	   case 2:
	      System.out.print("FlipFlop, ");
	      break;
	   case 3:
	      System.out.print("" + contador1 + " ,");
	      break;
	   case 4:
	      System.out.print("FlipFlop, ");
	      break;
	}
	}
  
   }
}