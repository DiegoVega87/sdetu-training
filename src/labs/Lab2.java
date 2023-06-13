package labs;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a student
		Student st1 = new Student("Diego Vega ", "147294578");
		st1.enroll("");
		st1.showCourses();
		st1.enroll("CS111");
		st1.showCourses();
		st1.enroll("CS111");
		st1.showCourses();
		st1.enroll("CS112");
		st1.enroll("CS113");
		st1.enroll("CS114");
		st1.enroll("CS115");
		st1.setCity(null);
		st1.setPhone(null);
		st1.setState(null);
		System.out.println(st1.toString());
		st1.setCity("Dover");
		st1.setPhone("1324123456");
		st1.setState("New Jersey");
		System.out.println(st1.toString());
		st1.showCourses();
		
		

		

	}

}

class Student{
	
	// Properties
	private String name;
	private String SSN;
	private String email;
	private static int iD = 1000;
	private String studentID;
	private String[] courses;
	private int index;
	private double balance;
	private static final double COURSE_RATE = 1500;
	private String phone;
	private String city;
	private String state;
	
	public Student(String name, String SSN) {
		iD++;
		this.name = name.trim();
		this.SSN = SSN;
		email = name.replace(" ", "").toLowerCase()+"."+ iD +"@my.studentmail.com";
		studentID = iD + "" +(1000+(int)(Math.random()*8000)) + "" + SSN.substring(5);
		System.out.println(studentID);
		courses = new String[4];
	}
	
	public void enroll(String course) {
		if(index < courses.length) {
			
			if(course == null || course.equals("")) {
				System.out.println("No course has been entered");
			}else {
				
				for(int i = 0; i < index; i++) {
					if(course.equalsIgnoreCase(courses[i])) {
						System.out.println("Course already registered. Please enter a different one.");
						return;
					}
				}
				courses[index++] = course.toUpperCase();
				System.out.println(name + " is now enrolled in " + course);
				balance -= COURSE_RATE;
			}
			
		}else {
			System.out.println(name + " has reached the maximun numbers of courses allowed per term/student.");
		}
		checkBalance();
		
	}
	
	public void pay(double amount) {
		if((amount < 1) || (amount > COURSE_RATE * 4)) {
			System.out.println("Please enter an amount between $1 and " + "$"+COURSE_RATE * 4);
		}else {
			balance += amount;
		}
		
		checkBalance();
	}
	
	private void checkBalance() {
		if(balance < 0) {
			System.out.println("Your balance due is: $" + balance);
		}else if(balance == 0) {
			System.out.println("Your balance due is: $" + balance);
		}else {
			System.out.println("You have a positive balance of: $" + balance);
		}
	}
	
	public void showCourses() {
		if(index < 1) {
			System.out.println("The student is not enrrolled in any course.");
		}else {
			System.out.println("Currently enrrolled in: ");
			for(int i = 0; i < index; i++) {
				System.out.println("Course " + (i+1) + ": " + courses[i]);
			}
		}
		
	}

	public String getPhone() {
		if(phone == null) {
			System.out.println("There is no phone registered for this student. + "
					+ " Please register one.");
		}
		
		return phone;
		
		
	}

	public void setPhone(String phone) {
		if(phone == null || phone.equals("")) {
			System.out.println("Nothing has been entered. Please enter a valid phone number");
		}else {
			this.phone = phone;
		}
	}

	public String getCity() {
		if(city == null) {
			System.out.println("There is no city registered for this student. + "
					+ " Please register one.");
		}
		return city;
	}

	public void setCity(String city) {
		if(city == null || city.equals("")) {
			System.out.println("Nothing has been entered. Please enter a valid City");
		}else {
			this.city = city;
		}
	}

	public String getState() {
		if(state == null) {
			System.out.println("There is no State registered for this student. + "
					+ " Please register one.");
		}
		return state;
	}

	public void setState(String state) {
		if(state == null || state.equals("")) {
			System.out.println("Nothing has been entered. Please enter a valid State");
		}else {
			this.state = state;
		}
		
		
		
	}

	@Override
	public String toString() {
		return "Student [name: " + name + ", email: " + email + "\n studentID: " + studentID + ", balance: $" + balance
				+ ", phone: " + (phone == null? "No Registered" : phone) + ", city: " + (city == null? "No Registered":city) + ", state: " + (state == null? "No Registered": state) + "]";
	}
	
	
}