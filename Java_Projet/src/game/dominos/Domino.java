package game.dominos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Domino implements Comparable<Domino>{
	private ArrayList<DominoPart> domino ;
	private int numero ;
	
    public int returnNumero() {
        return numero;
    }
        
	public Domino(ArrayList<DominoPart> domino, int numero) {
		super();
		this.domino = domino;
		this.numero = numero;
	}
	
	public void compare(ArrayList<Domino> piocheDomino) {
		  Collections.sort(piocheDomino);
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


