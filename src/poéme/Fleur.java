package poéme;

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
			System.out.println( "Fragile corolle taillée");
		}

		public void eclore() {
			System.out.print( "veiné de " + couleur + " ");
		}
			
		public String toString() {
			return "qu'un simple souffle";
		}
		
}
