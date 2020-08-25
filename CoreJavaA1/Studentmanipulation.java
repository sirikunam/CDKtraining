public class Studentmanipulation {

	Student[] createStudents() {

		Student[] students = new Student[5];
        
		students[0] = new Student();
		students[0].setId(200);
		students[0].setName("ABC");
		students[0].setAge(23);
		students[0].setMarks(new int[]{14 , 24  , 13 , 32 , 42});
        
		students[1] = new Student();
		students[1].setId(300);
		students[1].setName("XYZ");
		students[1].setAge(21);
		students[1].setMarks(new int[]{34 , 44  , 27 , 19 , 28});
		
		students[2] = new Student();
		students[2].setId(400);
		students[2].setName("PQR");
		students[2].setAge(20);
		students[2].setMarks(new int[]{21 , 18  , 11 , 40 , 24});
		
		students[3] = new Student();
		students[3].setId(500);
		students[3].setName("HIJ");
		students[3].setAge(22);
		students[3].setMarks(new int[]{21 , 22  , 20 , 24 , 26});
		
		students[4] = new Student();
		students[4].setId(600);
		students[4].setName("EFG");
		students[4].setAge(25);
		students[4].setMarks(new int[]{30, 44  , 64 , 24 , 25});
		
		
		return students;
		
		
	}

	int total(Student student) {

		int total = 0;
		for (int m : student.getMarks()) {

			total += m;
		}

		return total;
	}

	Student findMax(Student students[]) {

		int max = Integer.MIN_VALUE;
		Student topper = new Student();
		
		for(Student student : students) {
			
			int tot = total(student);
			
			if(tot > max) {
				max = tot;
				topper = student;
			}
		}
		
		
		return topper;
	}
	
	
	void displayTotal(Student students[]){
		
		for(Student st: students) {
		
			System.out.println("Total marks for student "+st.getName()+" : "+total(st));
			
		}
	}

}