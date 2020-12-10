import Interface.Gera;
import Mercosul.PadraoAntigo;
import Mercosul.PadraoNovo;

public class Main {

	public static void main(String[] args) {
		
		Gera GRA = new PadraoAntigo();
		Gera GRN = new PadraoNovo();
		
		GRA.geraPlaca();
		GRN.geraPlaca();
	}

}
