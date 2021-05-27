package src;
import java.util.Random;

public class MoedaViciada {
	
	String escolha, oposto; //cara - coroa
	
	public void escolheuCara() {
		escolha="cara";
		oposto="coroa";		
	}
	public void escolheuCoroa() {
		escolha="coroa";
		oposto="cara";
	}
	public String sorteia() {
		Random rdn=new Random();
		int num=rdn.nextInt(100);
		System.out.println("Numero sorteado: "+num);
		if(num<50) {
			return escolha; 
		}else {
			return oposto;
		}
	}

}
