package ro.enered.exemple;

public class Main {

		public static void main (String[] args){
			//pentru afisare pe ecran
			System.out.println("CEVA");
			//definirea variabilelor
			int a = 4;
			int b = 3;
			int c;
			c = adunare(a,b);
			//afisare c
			System.out.println(c);
			c= scadere(a,b);
			System.out.println(c);
			initializareStudent();
			initializareNota();
			initializareStoc();
			
		}
		private static int adunare(int a1, int b1){
			return a1+b1;
		}
		private static int scadere(int a1, int b1){
			return a1-b1;
		}
		private static void initializareStudent(){
		/*Student nou
		 * ii punem un nume, grup
		 * ii dam sa invete un curs pentru un numar de ore
		 */
		//instantiat
		Student s = new Student();	
		//stribuim un nume studentului
		s.nume = "Vlad";
		//atribuim o grupa studentului
		s.grup = 4;
		//apelam metoda invata
		System.out.println(s.invata("Java",4));
		
	
		
		}
		public static void initializareNota(){
			/*Atribuim studentului cu numele Ion din grupa 2 nota 8
			 * 
			 */
		Student s = new Student();
		s.nume="Ion";
		s.grup = 2;
		Nota n = new Nota();
		System.out.println(n.atribuie(s, 8));
				
}	
		public static void initializareStoc(){
		Stoc s = new Stoc();
		System.out.println(s.calcNr());
		
}		
		
}