package it.polito.tdp.Lab01.model;

import java.util.LinkedList;
import java.util.List;

public class Parole {
	
	List<String> elenco;
	
	public Parole() {
		//TODO
		elenco = new LinkedList<String>();
	}
	
	public void addParola(String p) {
		elenco.add(p);
		//TODO
	}
	
	public List<String> getElenco() {
		//TODO
		return elenco;
	}
	
	public void reset() {
		// TODO
		elenco.removeAll(elenco);
	}

}