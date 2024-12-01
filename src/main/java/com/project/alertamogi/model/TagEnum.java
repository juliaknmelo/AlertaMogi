package com.project.alertamogi.model;

public enum TagEnum {
	
	INUNDACAO(0), 
	ALAGAMENTO(1),
	QUEIMADA(2);

	private final int valor;
	TagEnum(int valorOpcao){
		valor = valorOpcao;
	}
	
	public int getValor() {
		return valor;
	}
}


