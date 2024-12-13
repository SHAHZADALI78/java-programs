class DemoArray{
public static void main(String [] args){
int marks [] = new int[5];
int sum = 0;
marks[0] = 50;
marks[1] = 60;
marks[2] = 70;
marks[3] = 80;
marks[4] = 90;
for(int index =0; index<marks.length;index++){
sum = sum+marks[index];
System.out.println(marks[index]);
System.out.println(marks[index]*marks[index]);
}
System.out.println(sum);
}
}


