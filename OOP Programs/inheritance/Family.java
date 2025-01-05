class Family{
String name;
static String fatherName;
int noOfSons;
int noOfDaughters;
int children;

public static void main(String [] args){
Family S1 = new Family();
S1.name = "Shoaib";
S1.fatherName = "Saifullah";
S1.noOfSons = 2;
S1.noOfDaughters = 2;
S1.children = 4;

Family S2 = new Family();
S2.name = "Saad";
S2.noOfSons = 1;
S2.noOfDaughters = 2;
S2.children = 3;

Family S3 = new Family();
S3.name = "Saeed";
S3.noOfSons = 2;
S3.noOfDaughters = 1;
S3.children = 3;

Family S4 = new Family();
S4.name = "Sarmad";
S4.noOfSons = 2;
S4.noOfDaughters = 2;
S4.children = 4;

System.out.println("Information Of Saifullah's Family");
System.out.println(" ");
System.out.println("Name Of First Son: " + S1.name );
System.out.println("Father Name: " + S1.fatherName);
System.out.println("No Of Sons: "+ S1.noOfSons);
System.out.println("No Of Daughters: "+S1.noOfDaughters);
System.out.println("Total Childrens: "+S1.children);
System.out.println(" ");
System.out.println("Name Of Second Son: " + S2.name );
System.out.println("Father Name: " +fatherName);
System.out.println("No Of Sons: "+ S2.noOfSons);
System.out.println("No Of Daughters: "+S2.noOfDaughters);
System.out.println("Total Childrens: "+S2.children);
System.out.println(" ");
System.out.println("Name Of Third Son: " + S3.name );
System.out.println("Fathers Name: " +fatherName);
System.out.println("No Of Sons: "+ S3.noOfSons);
System.out.println("No Of Daughters: "+S3.noOfDaughters);
System.out.println("Total Childrens: "+S3.children);
System.out.println(" ");
System.out.println("Name Of Fourth Son: " + S4.name );
System.out.println("Fathers Name: " + fatherName);
System.out.println("No Of Sons: "+ S4.noOfSons);
System.out.println("No Of Daughters: "+S4.noOfDaughters);
System.out.println("Total Childrens: "+S4.children);
}
}