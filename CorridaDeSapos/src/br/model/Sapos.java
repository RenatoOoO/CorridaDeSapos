package br.model;

public class Sapos extends Thread{
	
	private String nome;					
	private int distanciaCorrida = 0;		
	private int distanciaTotal;	
	private int pulo = 0;				
	private int qtdePulos = 0;					
	static int colocacao = 0;		
	final static int PULO_MAXIMO = 50;

	public Sapos() {
		
	}
	public Sapos(String nome, int distanciaTotal) {
		this.nome = nome;
		this.setDistanciaTotal(distanciaTotal);
	}

	public void sapoImprimeSituacao () {
		System.out.println("O " + nome +  " pulou " + pulo + "cm \t e já percorreu " +
							distanciaCorrida + "cm");
	}

	@Override
	public void run() {
		
			while (distanciaCorrida < distanciaTotal) {
				sapoPulando();
				sapoImprimeSituacao();
				sapoDescansando();
			}
			colocacaoSapo();
		
	}


	public void sapoPulando() {
		qtdePulos++;
		pulo = (int) (Math.random() * PULO_MAXIMO);
		distanciaCorrida += pulo;
		if (distanciaCorrida > distanciaTotal) {
			distanciaCorrida = distanciaTotal;
		}
	}

	public void sapoDescansando () {
		yield();
	}

	public void colocacaoSapo () {
		colocacao++;
		System.out.println(nome + " foi o " + colocacao + 
							"º colocado com " + qtdePulos + " pulos");
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void pular() {
		
	}
	public int getDistanciaTotal() {
		return distanciaTotal;
	}
	public void setDistanciaTotal(int distanciaTotal) {
		this.distanciaTotal = distanciaTotal;
	}	
	
}
