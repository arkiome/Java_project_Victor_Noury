package game.dominos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Domino implements Comparable<Domino>{
	
	private ArrayList<DominoPart> domino ;
	private int numero ;
////////////////////////
	public ArrayList<DominoPart> getDomino() {
		return domino;
	}
	public void setDomino(ArrayList<DominoPart> domino) {
		this.domino = domino;
	}
////////////////////////
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

//////////////////////////
    public int returnNumero() {
        return numero;
    }
        
	public Domino(ArrayList<DominoPart> domino, int numero) {
		super();
		this.domino = domino;
		this.numero = numero;
	}
		
	@Override
	public int compareTo(Domino domino) {
		// TODO Auto-generated method stub
		return (this.numero - domino.numero);
	}
	
	

}	
	/*
	public Boolean utiliser;
	public Integer placementX ;
	public Integer placementY ;
	*/


