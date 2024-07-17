package corrida;
import java.util.*;
public class carro {
	private int posicao;
	private String nomeCarro;
	
	public carro(String nomeCarro) {
		this.nomeCarro = nomeCarro;
		this.posicao = 0;
	}
	
	public void acelerarCarro() {
		Random rd = new Random();
		int acelerador = rd.nextInt(3)+1;
		this.posicao += acelerador;
	}

	public String getNomeCarro() {
		return nomeCarro;
	}
	
	public void pontuacao() {
		System.out.println(this.getNomeCarro() + ": " + this.getPosicao());
	}
	public void setNomeCarro(String nomeCarro) {
		this.nomeCarro = nomeCarro;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
	
}
