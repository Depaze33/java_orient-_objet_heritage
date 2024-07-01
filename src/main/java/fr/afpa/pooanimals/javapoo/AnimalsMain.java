package fr.afpa.pooanimals.javapoo;

import java.util.ArrayList;

public class AnimalsMain {
public static ArrayList<Animal> animales = new ArrayList<>();
	public static void main(String[] args) {
		
		Bird bird1 = new Bird("peroqquet", "jungle",20 );
		Fish fish1 = new Fish("Requin", "eau", "froide");
		Mammal mammal1 = new Mammal("Lion", "Jungle", "Brun");
		bird1.toString();
		fish1.toString();
		mammal1.toString();

		// System.out.println(bird1);
		// bird1.displayLocomotionType();
		// System.out.println(fish1);
		// fish1.displayLocomotionType();
		// System.out.println(mammal1);
		// mammal1.displayLocomotionType();
		
		System.out.println("Liste des animaux: "); 
// employee.forEach((n) -> print(n)); 
for (Animal animal : animales) {
	
}
		animales.add(bird1);
 		animales.add(fish1);
 		animales.add(mammal1);
		
 System.out.println("Les animaux sont " + (animales)); 


	}

	
}
