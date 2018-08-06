
public class CD  extends Ouvrage {
	private String titre;
	private String auteur;
	private static int nbrcd=0;
	
	
	public CD(){
		super();
		titre="";
		auteur="";
		nbrcd++;
	}
public CD(String titre,String auteur){
	super();
	this.titre=titre;
	this.auteur=auteur;
	nbrcd++;
}

public void setAUTEUR(String auteur){ this.auteur=auteur;}
public String getAUTEUR(){ return auteur;}
public void setTITRE(String titre){ this.titre=titre;}
public String getTITRE(){ return titre;}


public static int nbrCD(){ return nbrcd;}

public String toString(){
	return super.toString()+ "est le cd qui a le titre : "+titre+ "l'auteur :"+ auteur;
}

}
