import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeatingChart {
	
	private Student[][] seats;
	
	public SeatingChart(List<Student> studentList, int rows, int cols) {
	int studentCount = 0;
	this.seats = new Student[rows][cols];
		
		for (int j = 0; j < cols; j++){
			for (int i = 0; i < rows; i++) {
				if (studentCount < studentList.size()) {
					seats[i][j] = studentList.get(studentCount);
					//System.out.println("i: " + i + " j: " + j + " count: " + studentCount);
					studentCount++;
				} else {
					seats[i][j] = null;
				}
			}
		}
		
		//print seating chart
		for (int a = 0; a < seats.length; a++){
			for (int b = 0; b < seats[0].length; b++){
				System.out.print("|" + seats[a][b] + "|");
				//System.out.print("|" + seats[a][b].getName() + "|");
			}
			System.out.println();
		}
	}
	
	
	public int removeAbsentStudent(int allowedAbsences) {
		
		//@return number of student removed from seats
		return 0;
	}
	
	public static void main(String[] args){
		List<Student> students = new ArrayList<Student>();
		Student Karen = new Student("Karen", 3);
		Student Liz = new Student("Liz", 1);
		Student Paul = new Student("Paul", 4);
		Student Lester = new Student("Lester", 1);
		Student Henry = new Student("Henry", 5);
		students.add(Karen);
		students.add(Liz);
		students.add(Paul);
		students.add(Lester);
		students.add(Henry);
		
		SeatingChart chart = new SeatingChart(students, 3, 3);
		
	}
}