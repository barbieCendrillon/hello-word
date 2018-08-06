import java.sql.Date;

public class Ouvrage {
	private Date dateEmprunt;
	private int cote;
	private static int nbouvrage=0;
	
	public Ouvrage(){
		dateEmprunt=null;
		cote=nbouvrage++;
		}
	
	public void setCOTE(int cote){ this.cote=cote;}
	public int getCOTE(){ return cote;}
	public void setDATEEMPRUNT(Date d){dateEmprunt=d;}
	public Date getDATEMPRUNT(){ return dateEmprunt;}
	public static int nbOuvrage(){ return nbouvrage;}
	
	public String toString(){
		
		if(dateEmprunt!=null){
		return "l'ouvrage qui a la cote :"+cote+"est  emprunté à la date  :" +dateEmprunt;
	}
		else
			return "l'ouvrage qui a la cote :"+cote+" est disponible";
	}

}
