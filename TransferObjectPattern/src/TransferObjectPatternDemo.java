//客户端 - 客户端请求或发送传输对象到业务对象。
public class TransferObjectPatternDemo {

	public static void main(String[] args) {
		StudentBO studentBusinessObject = new StudentBO();
		
		// print all students
		for(StudentVO student: studentBusinessObject.getAllStudents()) {
			System.out.println("Student: [RollNo: "+student.getRollNo()+
					", Name: "+ student.getName()+"]");
		}
		// update student
		StudentVO student = studentBusinessObject.getAllStudents().get(0);
		student.setName("Michael");
		// get the student
		student = studentBusinessObject.getStudent(0);
		System.out.println("before updated: Student: [RollNo:" + student.getRollNo() + ", Name:" + student.getName() + "]");
		
		studentBusinessObject.updateStudents(student);

		//get the student
		student = studentBusinessObject.getStudent(0);
		System.out.println("after updated: Student: [RollNo:"+ student.getRollNo()+
				", Name:"+student.getName()+"]");
		
		
	}
}
