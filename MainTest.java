
public class MainTest {
	public static void main(String []args){
		/*test avec bibliotab*/
		
		System.out.println("**************************Test avec biblioTab********************");
		Bibliotheque t;
		t=new BiblioTab();
		//ajout
		try{
			Ouvrage o=new Livre("Java Guide","JMdoudoux","Spring");
			t.ajouter(o);
			Ouvrage c=new CD("Slow","yyyy");
			t.ajouter(c);
			Ouvrage p=new Periodique("Times",25,"Hebdomadaire");
			t.ajouter(p);
			t.affichage();
			
			//suppression
			t.supprimer(2);
			
			
			
		}catch(BiblioException e){
			System.out.println(e);
		}
		 
		 
		
		
		
		
		
		
	}
}