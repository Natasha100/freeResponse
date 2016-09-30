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
					//System.out.println("i: " + i + " j: " + j + " count: " + seats[i][j].getName());
					studentCount++;
				} else {
					seats[i][j] = null;
				}
			}
		}
		
	}
	
	public void printChart() {
		System.out.println();
		for (int a = 0; a < seats.length; a++){
			for (int b = 0; b < seats[0].length; b++){
				
				if (seats[a][b] != null) {
					System.out.print("| " + seats[a][b].getName() + " ");
				} else {
					System.out.print("| null ");
				}
			}
			System.out.println("|");
		}
		System.out.println();
	}
	
	public int removeAbsentStudent(int allowedAbsences) {
		int removedStudents = 0;
		
		for (int i = 0; i < seats.length; i++){
			for (int j = 0; j < seats.length; j++){
				if (seats[i][j] != null){
					if (seats[i][j].getAbsenceCount() > allowedAbsences) {
						seats[i][j] = null;
						removedStudents++;
					}
				}
			}
		}
		return removedStudents;
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
		chart.printChart();
		System.out.println("Students removed from seating chart: " + chart.removeAbsentStudent(4));
		chart.printChart();
	}
}