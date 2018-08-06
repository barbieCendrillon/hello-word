
public abstract class Bibliotheque {
	public abstract void ajouter(Ouvrage o)throws BiblioException;
	public abstract void supprimer(int cote);
	public  abstract  int nbrOuvrage();
	public abstract String toString();
	public abstract void affichage();
	

}
