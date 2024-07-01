package fr.afpa.pooanimals.javapoo;



public class AnimalsMain {

	public static void main(String[] args) {
		Bird bird1 = new Bird("peroqquet", "jungle",20 );
		Fish fish1 = new Fish("Requin", "eau", "froide");
		Mammal mammal1 = new Mammal("Lion", "Jungle", "Brun");
		bird1.toString();
		fish1.toString();
		mammal1.toString();

		System.out.println(bird1);
		bird1.displayLocomotionType();
		System.out.println(fish1);
		fish1.displayLocomotionType();
		System.out.println(mammal1);
		mammal1.displayLocomotionType();
		
		


	}

	
}
