//传输对象 - 具有仅设置/获取属性的方法的简单POJO。
public class StudentVO {

	private String name;
	private int rollNo;
	public StudentVO(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}
