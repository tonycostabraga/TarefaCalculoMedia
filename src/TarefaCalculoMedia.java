/**
 * 
 * @author Tony da Costa Braga
 *
 */
import java.util.*;

public class TarefaCalculoMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double nota1,nota2,nota3,nota4, media;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Por favor, digite a primeira nota");
	nota1 = ler.nextDouble();
	
	System.out.println("Por favor, digite a segunda nota");
	nota2 = ler.nextDouble();
	
	System.out.println("Por favor, digite a terceira nota");
	nota3 = ler.nextDouble();
	
	System.out.println("Por favor, digite a quarta nota");
	nota4 = ler.nextDouble();
	
	media = (nota1 + nota2 + nota3 + nota4) / 4;
	
	System.out.println("A média das notas é:" + media);
	}

}
