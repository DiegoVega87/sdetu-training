package DataStructures;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LinkedHashSet - Keeps the order in which items are added.
		// HashSet - Items are added in a random order.
		// TreeSet - rearranges to natural order.
		// 1. Define the collection
		Set<String> animals = new HashSet<String>(); // HashSets do not maintain the order in which items are added.
		//Set<String> animals = new LinkedHashSet<String>() // LinkedHashSets do maintain the order in which items are added.
		//Set<String> animals = new TreeSet<String>(); // TreeSets add items alphabetically ordered.
		
		// 2. Adding elements
		animals.add("Dog");
		animals.add("Pig");
		animals.add("Hog");
		animals.add("Cat");
		animals.add("Snake");
		
		System.out.println(animals.size() +" "+ animals); // Since there is not specific ordering, the printing order occurs in a random manner. 
		//OUTPUT: [Snake, Cat, Dog, Pig, Hawk]
		
		animals.add("Cat");
		animals.add("Snake");
		animals.add("Goose");
		
		System.out.println(animals.size() +" "+ animals); // Sets do not accept duplicates. For instance, the output does not contain Cat or Snake twice.
	
		
		// Create a new set that we can use for comparison
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("Chicken");
		farmAnimals.add("Cow");
		farmAnimals.add("Pig");
		farmAnimals.add("Horse");
		farmAnimals.add("Dog");
		System.out.println("farmAnimals: "+farmAnimals);
		
		// What is the INTERSECTION between animals and farm animals (only animals and farm animals "AND")
		// 1. Copy existing set into a new set
		Set<String> intersectionSet = new HashSet<String>(animals);
		System.out.println(intersectionSet);
		// 2. Retain ONLY the elements that are also in the farmAnimals set
		intersectionSet.retainAll(farmAnimals);
		System.out.println("The intersection is: "+intersectionSet); // OUTPUT: The intersection is: [Dog, Pig]
		
		// 3. What is the UNION (are both animals and farm animals "OR")
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The union set is: " + unionSet); // OUTPUT: The union set is: [Snake, Goose, Horse, Cat, Chicken, Cow, Dog, Pig, Hawk]
		
		// 4. What is the DIFFERENCE (animals but NOT farm animals - in 1 and NOT the other)
		Set<String> differenceSet = new HashSet<String>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("The difference set is: " + differenceSet);
		

	}

}
