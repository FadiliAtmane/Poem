package po�me;

public class Fleur {	
		private String espece;
		private String couleur;
		
		public  Fleur(String espece, String coleur ) // constructeur pour initialiser les variable de cette classe 
		{  
			this.espece  = espece  ;
			this.couleur = coleur;
			System.out.println( espece + "fraichement cueillie ");

		}		
		
		public Fleur(Fleur autre) {
			couleur = autre.couleur;
			System.out.println( "Fragile corolle taill�e");
		}

		public void eclore() {
			System.out.print( "vein� de " + couleur + " ");
		}
			
		public String toString() {
			return "qu'un simple souffle";
		}
		
}
