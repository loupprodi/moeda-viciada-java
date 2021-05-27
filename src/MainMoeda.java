package src;
import java.util.*;

public class MainMoeda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Escolha 0-Cara 1-Coroa:");
		int escolha=scan.nextInt();
		
		MoedaViciada moeda=new MoedaViciada();
		if(escolha==0) {
			moeda.escolheuCara();
		}else {
			if(escolha==1) {
				moeda.escolheuCoroa();	
			}else {
				System.out.println("Escolha invalida! Tchau!");
				return;
			}
		}
		System.out.println("Moeda sorteada: " + moeda.sorteia());

	}

}
