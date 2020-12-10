package Mercosul;

import java.util.Random;

import Interface.Gera;

public class PadraoNovo implements Gera{
	
	public void geraPlaca() {
		
		StringBuilder strbl = new StringBuilder();
		Random ran   = new Random();
		Utils  util = new Utils();
		
		for(int i = util.INITIAL_NUMBER; i < util.LENGTH_PLACA; i++) {
			strbl.append((char) (ran.nextInt(util.INITIAL_NUMBER + util.CARACTERES_ALFABETO) + util.CARACTERES_ASCII));			
		}
		
		for(int i = 0; i < util.LENGTH_PLACA; i++) {
			if(strbl.length() == util.LENGTH_MERCOSUL) {
				strbl.append((char) (ran.nextInt(util.INITIAL_NUMBER + util.CARACTERES_ALFABETO) + util.CARACTERES_ASCII));
			}else {
				strbl.append(ran.nextInt(util.INITIAL_NUMBER + util.FINAL_NUMBER));
			}
		}
		System.out.println(strbl);
	}
}
