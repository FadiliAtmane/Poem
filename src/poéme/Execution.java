package po�me;

public class Execution {
	public static void main(String[] args)
	{
	Fleur f1 = new Fleur("Violette", "bleu");
	Fleur f2 = new Fleur(f1);
	System.out.print("dans un cristal ");
	f2.eclore();
	System.out.print("ne laissant plus ");
	System.out.println(f1);
	System.out.println(f2);
	System.out.println("waw j'ai cr�e ma premier branch");
	
	}

}
 