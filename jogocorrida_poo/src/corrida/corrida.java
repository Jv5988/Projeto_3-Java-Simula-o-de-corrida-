package corrida;

public class corrida {
	public static void main(String[] args) {
		int l_chegada = 100;
		carro c1 = new carro("Pimba");
		carro c2 = new carro("Tabril");
		
		inicio();
		while (c1.getPosicao() < l_chegada && c2.getPosicao() < l_chegada) {
			c1.acelerarCarro();
			c2.acelerarCarro();
			exibirCorrida(c1, c2);
			
              try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();	
		}
              }
		
		System.out.println("Pontuação: ");
		c1.pontuacao();
		c2.pontuacao();
        vencedor(c1, c2, l_chegada);	 
	    
	}
	
		
	public static void vencedor(carro c1, carro c2, int l_chegada) {
		if (c1.getPosicao() == l_chegada && c2.getPosicao() == l_chegada) {
            System.out.println(c1.getNomeCarro() + " e " + c2.getNomeCarro() + " empataram a corrida!");
        } else if(c1.getPosicao() == c2.getPosicao()) {
        	System.out.println(c1.getNomeCarro() + " e " + c2.getNomeCarro() + " empataram a corrida!");
        } else if (c1.getPosicao() >= l_chegada && c1.getPosicao() > c2.getPosicao()) {
            System.out.println(c1.getNomeCarro() + " venceu a corrida!");
        } else {
            System.out.println(c2.getNomeCarro() + " venceu a corrida!");
        }
		
	}

	public static void inicio() {
		System.out.println("#");
		System.out.println("#");
		System.out.println("----------------------------------------------------------------------------------------------------------");
	}
	public static void exibirCorrida(carro c1, carro c2) {
		
		for(int i=0; i<c1.getPosicao(); i++) {
			
			System.out.print(" ");
											//" "" "" "" "" "#
		}
		System.out.println("#");
		for(int i=0; i<c2.getPosicao(); i++) {
			System.out.print(" ");
		}
		System.out.println("#");
		
		System.out.println("----------------------------------------------------------------------------------------------------------");
	}
	
	}
	
