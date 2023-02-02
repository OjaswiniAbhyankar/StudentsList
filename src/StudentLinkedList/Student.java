package StudentLinkedList;

public class Student {
	private int RollNo;
	private String Name;
	private String Standard;
	
	
	public Student() {
		RollNo=01;
		Name="ABCD";
		Standard="10";
	}
	public Student(int rollNo, String name, String standard) {
		RollNo = rollNo;
		Name = name;
		Standard = standard;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getStandard() {
		return Standard;
	}
	public void setStandard(String standard) {
		Standard = standard;
	}

}
