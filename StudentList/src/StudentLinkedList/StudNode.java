package StudentLinkedList;

public class StudNode {
	private Student stud;
	private StudNode next;
	
	public StudNode(Student s) {
		stud=s;
		next=null;
	}
	public Student getStud() {
		return stud;
	}
	public void setStud(Student stud) {
		this.stud = stud;
	}
	public StudNode getNext() {
		return next;
	}
	public void setNext(StudNode next) {
		this.next = next;
	}
	

}
