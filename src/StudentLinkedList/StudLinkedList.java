package StudentLinkedList;

public class StudLinkedList {
	 private StudNode head=null;
	
	//Insert Last function
	public void Insert_Last(Student s) {
		StudNode newStudent = new StudNode(s);
		if(head==null) {
			head=newStudent;
			return;
		}
		else
		{
			StudNode iter=head;
			//traversing to last node
			while(iter.getNext()!=null)
				iter=iter.getNext();
			iter.setNext(newStudent);
			return;
		}
		
	}

	//Display Function
	public String toString() {
		StudNode iter=head;
		while(iter!=null) {
			System.out.println("Roll Number : "+iter.getStud().getRollNo()+"  Name : "+iter.getStud().getName()+"  Standard : "+iter.getStud().getStandard());
			System.out.println("-----------------------------");
			iter=iter.getNext();
		}
		return "";
	}
	
	public static void split(StudLinkedList input, StudLinkedList out1,StudLinkedList out2) {
		StudNode iter = input.head;
		while(iter!=null) {
			if(iter.getStud().getRollNo()%2==0) {
				out2.Insert_Last(iter.getStud());
			}
			else 
			{
				out1.Insert_Last(iter.getStud());
			}
			iter=iter.getNext();
		}
	}
	

}
