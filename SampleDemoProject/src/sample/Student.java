/**
 * 
 */
package sample;

/**
 * @author SGS-DEV4
 *
 */
public class Student {

	int rollNo;
	double marks;
	String name;
	public Student(int rollNo, double marks, String name){
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
		
	}
	void display() {
	
		System.out.println("RollNo :"+rollNo);
		
		System.out.println("Marks :"+marks);
		
		System.out.println("Name :" +name);
	
}
	
	public static void main(String[] args) {
		System.out.println("Student Information");
		Student st = new Student(100, 100.00, "cvcvcvccc");
		st.display();
		// TODO Auto-generated method stub

	}

}
