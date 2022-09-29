package Abstract;

abstract class Student{
	abstract double getPercentage();
}

class StudentA extends Student{
	int sub1,sub2,sub3;
	StudentA(){};
	StudentA(int sub1,int sub2,int sub3){
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	
	double getPercentage() {
		int total=sub1+sub2+sub3;
		return (total*100)/300;
	}
	
}

class StudentB extends Student{
	int sub1,sub2,sub3,sub4;
	StudentB(){};
	StudentB(int sub1,int sub2,int sub3,int sub4){
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
	}
	
	double getPercentage() {
		int total=sub1+sub2+sub3+sub4;
		return (total*100)/400;
	}
	
}
public class Assignment02 {

	public static void main(String[] args) {
		StudentA studentA=new StudentA(65,56,75);
		System.out.println(studentA.getPercentage());
		
		StudentB studentB=new StudentB(75,85,95,87);
		System.out.println(studentB.getPercentage());

	}

}
