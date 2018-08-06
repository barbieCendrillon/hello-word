
public class Livre extends Ouvrage {
	private String auteur;
	private String titre;
	private String editeur;
	private static int nbrlivre=0;
	public Livre(){
		super();
		auteur="";
		titre="";
		editeur="";
		nbrlivre++;
	}
	public Livre(String auteur, String titre,String editeur){
		this.auteur=auteur;
		this.titre=titre;
		this.editeur=editeur;
		nbrlivre++;
	}
	public void setAUTEUR(String auteur){ this.auteur=auteur;}
	public String getAUTEUR(){ return auteur;}
	public void setTITRE(String titre){ this.titre=titre;}
	public String getTITRE(){ return titre;}
	public void setEDITEUR(String editeur){ this.editeur=editeur;}
	public String getEDITEUR(){ return editeur;}
	
	
	public static int nbrLivre(){ return nbrlivre;}
	
	public String toString(){
		return super.toString()+"est le livre qui a le titre :" + titre+ "et l'auteur :  "+ auteur+ "l'editeur :"+ editeur;
	}

}
