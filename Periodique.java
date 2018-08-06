
public class Periodique  extends Ouvrage{
	private String nom;
	private int numero;
	private String periodicite;
	private static int nbrpeiodicite=0;
	
	public Periodique(){
		super();
		nom="";
		numero=0;
		periodicite="";
		nbrpeiodicite++;
	}
	
	public Periodique(String nom,int num,String p){
		super();
		this.nom=nom;
		numero=num;
		periodicite=p;
		nbrpeiodicite++;
	}
	
	
	public void setNOM(String nom){ this.nom=nom;}
	public String getNOM(){return nom;}
	public void setNUMERO(int numero){ this.numero=numero;}
	public int getNUMERO(){ return numero;}
	public void setPERIODICITE(String p){periodicite=p;}
	public String getPERIODICITE(){return periodicite;}
	
	
	public static int nbPeriodicite(){ return nbrpeiodicite;}
	
	public String toString(){
		return super.toString()+"est la periodicite :"+ nom+ "du numero "+numero+ "et a la periodicite :"+ periodicite;
	}
	

}
