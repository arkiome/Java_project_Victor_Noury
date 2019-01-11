package game.dominos;

public class DominoPart {
	
	private String terrainType ;
	//private TerrainType type;
	private int nbCouronne;

////////////////////////
	public String getTerrainType() {
		return terrainType;
	}
	public void setTerrainType(String terrainType) {
		this.terrainType = terrainType;
	}
/////////////////////////
	public int getNbCouronne() {
		return nbCouronne;
	}
	public void setNbCouronne(int nbCouronne) {
		this.nbCouronne = nbCouronne;
	}
/////////////////////////
	//public DominoPart(TerrainType type, int nbCouronne) 
	public DominoPart(String terrainType , int nbCouronne) {
		super();
		this.terrainType  = terrainType ;
		this.nbCouronne = nbCouronne;
	}
	
	
	
} 
