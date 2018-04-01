package br.model;

public class PrincipalSapos {

	final static int NUM_SAPOS = 4;	
	final static int DISTANCIA = 500; 
	
	public static void main(String[] args) throws InterruptedException {

		for (int i = 1; i <= NUM_SAPOS; i++) {
			new Sapos("SAPO " + i, DISTANCIA).start();			
			}
		}
		
		

	}
	
		


