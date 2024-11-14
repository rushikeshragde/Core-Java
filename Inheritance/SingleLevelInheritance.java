import java.util.*;
class STD
{ 
  int marks[];
  String stdName,studName;
void setMarks(String stdName,String studName,int smarks[]);
	{
	this.stdName=stdName;
	this.studName=studName;
	this.marks= ssmarks;	
	}
}
class Result extends STD
{
  void showResult()
	{
	System.out.println("STD Name is"+stdName);
	System.out.println("Stud Name is"+studName);
		int per0;
		for(int i=0; i<marks.length; i++)
		{ per = per + marks[i];
		}
		System.out.println("Percentage is "+(per/marks.length));
	}
}
public class SingleLevelInheritance
{
	public static void main(String []args)
	{
		Result r= new Result();
		Scanner xyz = new Scanner(System.in);
		int a[]=new int [6];
		System.out.println("Enter Standard name: ");
		String stdName=xyz.nextLine();
		System.out.println("Enter Student name: ");
		String studName=xyz.nextLine();
		System.out.println("Enter Marks of Student: ");
		for (int i=0; i<a.length; i++)
		{
		a[i]=xyz.nextInt();
		}
		r.setMarks(stdName,studName,a);
		r.showResult();
	}
}