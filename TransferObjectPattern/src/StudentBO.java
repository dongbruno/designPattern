import java.util.ArrayList;
import java.util.List;
//业务对象 - 业务服务使用数据填充传输对象。
public class StudentBO {

	List<StudentVO> students;
	
	public StudentBO() {
		students = new ArrayList<StudentVO>();
		StudentVO student1 = new StudentVO("Robert", 0);
		StudentVO student2 = new StudentVO("John", 1);
		students.add(student1);
		students.add(student2);
	}
	public void deleteStudent(StudentVO student) {
		students.remove(student.getRollNo());
		System.out.println("Student:Roll No "+ student.getRollNo()+
				", deleted from the database");
	}
	//retrive list of students from the database
	public List<StudentVO> getAllStudents(){
		return students;
	}
	public StudentVO getStudent(int rollNo) {
		return students.get(rollNo);
	}
	public void updateStudents(StudentVO student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student:Roll No " + student.getRollNo() + ", updated in the database");
	}
}
