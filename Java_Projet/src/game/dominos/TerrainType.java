package game.dominos;
import java.awt.Color;
import java.util.ArrayList;


public class TerrainType {
	private String type;
	private Color color;
	
	
	public TerrainType(String type, Color color) {
		super();
		this.type = type;
		this.color = color;
		
	}
	
	
	//importation d'image possible
	
	public void creeTerrainType(ArrayList<TerrainType> allTerrain) {
		/*
		allTerrain.add(new TerrainType("Foret", Color.green) );
		allTerrain.add(new TerrainType("Champs", Color.orange) );
		allTerrain.add(new TerrainType("Mer", Color.blue) );
		allTerrain.add(new TerrainType("Mine", Color.darkGray) );
		allTerrain.add(new TerrainType("Montagne", Color.lightGray) );
		allTerrain.add(new TerrainType("Prairie", Color.orange) );
		allTerrain.add(new TerrainType("1", Color.white) );
		*/
		
		allTerrain.add(new TerrainType("chateau", Color.black) );//vide + plassable
		allTerrain.add(new TerrainType("0", Color.white) );//vide + implassable

	}
	
}
