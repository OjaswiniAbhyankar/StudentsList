package StudentLinkedList;
public class UserOfLikedList {

	public static void main(String[] args) {
		StudLinkedList StudentList = new StudLinkedList();
		StudLinkedList List1 = new StudLinkedList();
		StudLinkedList	List2 = new StudLinkedList();
		Student student1 = new Student(01,"ABCD","10");
		Student student2 = new Student(02,"PQRS","9");
		Student student3 = new Student(03,"XYZ","9");
		Student student4 = new Student(04,"LMNO","9");
		StudentList.Insert_Last(student1);
		StudentList.Insert_Last(student2);
		StudentList.Insert_Last(student4);
		StudentList.Insert_Last(student3);
		System.out.println(StudentList);
		StudentList.Insert_Last(student2);
		System.out.println(StudentList);
		StudLinkedList.split(StudentList, List1, List2);
		System.out.println("List 1 Odd Numbers");
		System.out.println(List1);
		System.out.println("List 2 Even Numbers ");
		System.out.println(List2);

	}

}
