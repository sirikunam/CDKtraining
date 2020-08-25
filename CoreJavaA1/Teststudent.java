
public class Teststudent {

	public static void main(String[] args) {
        Studentmanipulation obj = new Studentmanipulation();
		Student students[] = obj.createStudents();
		
		System.out.println("List of All Students");
		
		for(Student st : students) {
			st.display();
		}
		
		
		obj.displayTotal(students);

		
		System.out.println("Topper is :");
		Student topper = obj.findMax(students);
		topper.display();
	}

}