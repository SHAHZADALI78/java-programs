class Student{
String name;
String studentId;
String department;
int semester;
Double gpa;

public void displayStudentInfo(){
System.out.println("Name : "+name+ "      Student ID : "+studentId+ "      Department : "+department+    "Semester : " +semester+ "     GPA : "+gpa);
}

public void semesterClearOrNot(Double gpa){
if(gpa >= 2.0){
System.out.println("    You Have Cleared The Semester ");
} 
else {
System.out.println("    You Have Not Cleared The Semester ");
}
}
public static void main(String [] args){
Student ali = new Student();
ali.name = "student Ali";
ali.studentId = "CSE-22F-001";
ali.department = "Computer Science";
ali.semester = 5;
ali.gpa = 3.5;

Student ahmed = new Student();
ahmed.name = "student Ali";
ahmed.studentId = "BSE-22F-020";
ahmed.department = "Software Engineering";
ahmed.semester = 4;
ahmed.gpa = 1.5;

Student saad = new Student();
saad.name = "student Ali";
saad.studentId = "BBA-23S-012";
saad.department = "Business Administration";
saad.semester = 4;
saad.gpa = 3.0;

Student sameer = new Student();
sameer.name = "student Sameer";
sameer.studentId = "BSE-22F-011";
sameer.department = "Software Engineering";
sameer.semester = 4;
sameer.gpa = 2.7;

Student adil = new Student();
adil.name = "student Adil";
adil.studentId = "CSE-22F-022";
adil.department = "Computer Science";
adil.semester = 5;
adil.gpa = 1.7;

System.out.println("Name:       "+ ali.name);
System.out.println("Student ID: "+ ali.studentId);
System.out.println("Department: "+ ali.department);
System.out.println("Semester:   "+ ali.semester); 
System.out.println("GPA:        "+ ali.gpa);
ali.displayStudentInfo();
ali.semesterClearOrNot(ali.gpa);
System.out.println(" ");

System.out.println("Name:       "+ ahmed.name);
System.out.println("Student ID: "+ ahmed.studentId);
System.out.println("Department: "+ ahmed.department);
System.out.println("Semester:   "+ ahmed.semester); 
System.out.println("GPA:        "+ ahmed.gpa);
ahmed.displayStudentInfo();
ahmed.semesterClearOrNot(ahmed.gpa);
System.out.println(" ");

System.out.println("Name:       "+ saad.name);
System.out.println("Student ID: "+ saad.studentId);
System.out.println("Department: "+ saad.department);
System.out.println("Semester:   "+ saad.semester); 
System.out.println("GPA:        "+ saad.gpa);
saad.displayStudentInfo();
saad.semesterClearOrNot(saad.gpa);
System.out.println(" ");

System.out.println("Name:       "+ sameer.name);
System.out.println("Student ID: "+ sameer.studentId);
System.out.println("Department: "+ sameer.department);
System.out.println("Semester:   "+ sameer.semester); 
System.out.println("GPA:        "+ sameer.gpa);
sameer.displayStudentInfo();
sameer.semesterClearOrNot(sameer.gpa);
System.out.println(" ");

System.out.println("Name:       "+ adil.name);
System.out.println("Student ID: "+ adil.studentId);
System.out.println("Department: "+ adil.department);
System.out.println("Semester:   "+ adil.semester); 
System.out.println("GPA:        "+ adil.gpa);
adil.displayStudentInfo();
adil.semesterClearOrNot(adil.gpa);
System.out.println(" ");
}
}


 