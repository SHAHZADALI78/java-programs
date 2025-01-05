class University{
String name;
String location;
long admissionFees;
String fieldName;

public void displayData(){
System.out.println("Name :"+name+ "   Location :"+location+ "   Admission Fees :"+admissionFees+ "    Field Name :"+fieldName);
}

public void totalFees(long admissionFees){
long securityCharges = 10000;
long totalAdmissionFees = admissionFees + securityCharges;
System.out.println("The Total Admission Of Fees Is: "+totalAdmissionFees);
}

public static void main(String []args){
University dowUniversity = new University(); 
dowUniversity.name = "Dow University";
dowUniversity.location = "Saddar Karachi";
dowUniversity.admissionFees = 50000;
dowUniversity.fieldName = "Medical University";

University karachiUniversity = new University(); 
karachiUniversity.name = "Karachi University";
karachiUniversity.location = "Main University Road Karachi";
karachiUniversity.admissionFees = 45000;
karachiUniversity.fieldName = "General University";

University nedUniversity = new University();
nedUniversity.name = "Ned University ";
nedUniversity.location = "Main University Road Karachi";
nedUniversity.admissionFees = 55000;
nedUniversity.fieldName = "Engineerig University" ;

University mehranUniversity = new University(); 
mehranUniversity.name = "Mehran University";
mehranUniversity.location = "Jamshoro Hyderabad";
mehranUniversity.admissionFees = 50000;
mehranUniversity.fieldName = "Engineering University";

University lumhsUniversity = new University(); 
lumhsUniversity.name = "Lumhs University";
lumhsUniversity.location = "Jamshoro";
lumhsUniversity.admissionFees = 55000;
lumhsUniversity.fieldName = "Medical University";

University ibaUniversity = new University(); 
ibaUniversity.name = "IBA University";
ibaUniversity.location = "Sukkur";
ibaUniversity.admissionFees = 60000;
ibaUniversity.fieldName = "General University";

System.out.println("............OBJECTS OF UNIVERSITY.............");
System.out.println("Name : " +dowUniversity.name);
System.out.println("Location : " +dowUniversity.location);
System.out.println("Admission Fees : " +dowUniversity.admissionFees);
System.out.println("Field Name : " +dowUniversity.fieldName);
dowUniversity.totalFees(dowUniversity.admissionFees);
dowUniversity.displayData();
System.out.println(" ");

System.out.println("Name : " +karachiUniversity.name);
System.out.println("Location : " +karachiUniversity.location);
System.out.println("Admission Fees : " +karachiUniversity.admissionFees);
System.out.println("Field Name : " +karachiUniversity.fieldName);
karachiUniversity.totalFees(karachiUniversity.admissionFees);
karachiUniversity.displayData();
System.out.println(" ");

System.out.println("Name : " +nedUniversity.name);
System.out.println("Location : " +nedUniversity.location);
System.out.println("Admission Fees : " +nedUniversity.admissionFees);
System.out.println("Field Name : " +nedUniversity.fieldName);
nedUniversity.totalFees(nedUniversity.admissionFees);
nedUniversity.displayData();
System.out.println(" ");

System.out.println("Name : " +mehranUniversity.name);
System.out.println("Location : " +mehranUniversity.location);
System.out.println("Admission Fees : " +mehranUniversity.admissionFees);
System.out.println("Field Name : " +mehranUniversity.fieldName);
mehranUniversity.totalFees(mehranUniversity.admissionFees);
mehranUniversity.displayData();
System.out.println(" ");

System.out.println("Name : " +lumhsUniversity.name);
System.out.println("Location : " +lumhsUniversity.location);
System.out.println("Admission Fees : " +lumhsUniversity.admissionFees);
System.out.println("Field Name : " +lumhsUniversity.fieldName);
lumhsUniversity.totalFees(lumhsUniversity.admissionFees);
lumhsUniversity.displayData();
System.out.println(" ");

System.out.println("Name : " +ibaUniversity.name);
System.out.println("Location : " +ibaUniversity.location);
System.out.println("Admission Fees : " +ibaUniversity.admissionFees);
System.out.println("Field Name : " +ibaUniversity.fieldName);
ibaUniversity.totalFees(ibaUniversity.admissionFees);
ibaUniversity.displayData();
}
}












