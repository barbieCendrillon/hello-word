
public class BiblioTab extends Bibliotheque{
	private Ouvrage []tab=null;//structure ou in va stocker les ouvrage
	public static final int maxleng=100;//taille max du tableau
	public static int nbrouvrage=0;
	
	public BiblioTab(){
		tab=new Ouvrage[maxleng];
	}
	public Ouvrage[] getTAB(){return tab;}
	
	/*ajout d'un ouvrage dans un tableau*/
	public void ajouter(Ouvrage o)throws BiblioException{
		if(nbrouvrage> maxleng)throw new BiblioException("la taille maximale du tableau a été dépassé");
		
		tab[nbrouvrage]=o;
		nbrouvrage++;
		System.out.println("l'ouvrage ayant la cote :"+o.getCOTE()+"a été ajouté");
	}
	
	/*suppression des ouvrages*/
	
	public void decalage(int pos){
		for(int i=pos;i<nbrouvrage-1;i--){
			tab[i]=tab[i+1];
		}
		
	}
	
	public void supprimer(int cote){
		boolean found=false;
		for(int i=0;i<nbrouvrage;i++){
			if(tab[i].getCOTE()==cote){
				decalage(i);
				nbrouvrage--;
				found=true;
			}
		}
		if(!found){
			System.out.println("l'ouvrage du cote :"+cote+ "n'existe pas");
		}
		else
		{
			System.out.println(" l'ouvrage du cote :"+cote+ "a été supprimé");
		}
	}
	
	public int nbrOuvrage(){ return nbrouvrage;}
	
	public String toString(){
		 String msg="le nombre d'ouvrage dans la bibliotheque est :"+nbrouvrage;
		for(int i=0;i<nbrouvrage;i++){
			return tab[i].toString();
		}
		return msg;
	}
	
	public void affichage(){
		System.out.println(this);
	}
	

}
