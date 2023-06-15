package DataStructures;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] alphabet = {"a","b","c","d","e","f", "g"};
		
		System.out.println("Using reguluar indexed for loop:");
		for(int i=0; i < alphabet.length; i++) {
			System.out.print(alphabet[i]+ " ");
		}
		
		System.out.println("\n\nUsing For-Each method");
		// Enhanced for loop
		for(String letter : alphabet) {
			System.out.print(letter + " ");
		}
		
		System.out.println("\n\nDouble Arrays");

		String[][] users = {
				{"Jhon", "Williams", "jw@testemail.com","7897454656"},
				{"Sarah", "Jackson", "sj@testemail.com","6543217898"},
				{"Rachel", "Wallace","rc@testemail.com","9731234586"}		
		};
		
		// Get the size of the array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("Number of users: " + numOfUsers);
		System.out.println("Number of fields: " + numOfFields);
		
		System.out.println("\n\nTraversing the double array with old fashion for loop\n");
		// Traverse the double arrays -Old fashion
				for(int i = 0; i < numOfUsers; i++) {
					for(int j= 0; j < users[i].length; j++) {
						System.out.print(users[i][j] + " ");
					}
					System.out.println();
				}
		
		System.out.println("\n\nTraversing the double array with old fashion- With shortcut for equally lengthed rows\n");
		// Traverse the double arrays -Old fashion
		for(int i = 0; i < numOfUsers; i++) {
			String firstName = users[i][0];
			String lastName = users[i][1];
			String email = users[i][2];
			String phone = users[i][3];
			System.out.println(firstName + " " + lastName + " " + email + " " + phone);
		}
		
		System.out.println("\n\nTraversing the double array with enhanced for loops\n");
		// Traverse the double array Using For-Each
		for(String[] user : users) {
			for(String field: user) {
				System.out.print(field + " ");
			}
			System.out.println();
		}
	}

	

}
