public class TwontyFisrtValue
{
	public static void main(String []args)
	{	
	int a[]=new int[]{10,20,30,40,50};
	int i, j, k;
	i=j=k=0;
	i+=1;       //i=1
	a[i]=a [j]+10;    //a[1]=20
	a[++j]=a[i++] ;//i=2
	a[k++]=a [i+j>>2]+10; //20
System.out.println("Display array value");
for (int m=0; m<a.length;m++)
{
	System.out.printf("%d\t",a[m]);
	}
	}
}