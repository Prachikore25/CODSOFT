import java.util.Scanner;
public class StudentGrade {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter student name:");
		String name=sc.next();
		System.out.println("ENTER MARKS OUT 0F 100");
		System.out.println("Marathi:");
		int M=sc.nextInt();
		System.out.println("English:");
		int E=sc.nextInt();
		System.out.println("Hindi:");
		int H=sc.nextInt();
		System.out.println("Maths:");
		int Ms=sc.nextInt();
		System.out.println("Science:");
		int S=sc.nextInt();
		char grade = 0;
		int sum=M+E+H+Ms+S;
		int avg=(sum/5);
		if(avg>=90) {
			 grade='O';
		}else if(avg>=80) {
			grade='A';
		}else if(avg>=70) {
			grade='B';
		}else if(avg>=60) {
			grade='C';
		}else if(avg>=50) {
			grade='D';
		}else if(avg>=40) {
			grade='P';
		}else{
			grade='F';
		}
		System.out.println("RESULLT OF "+name);
		System.out.println("Total Marks Out of 500:"+sum);
		System.out.println("Average Percentage:"+avg+"%");
        System.out.println("Grade obtained:"+grade);		
	}
}
