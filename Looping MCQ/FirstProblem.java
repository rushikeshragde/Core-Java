public class FirstProblem
{
public static void main(String[] args) {
int i = 1;
while (i != 5) {
switch (i) {
case 1:
System.out.println("First");
case 2:
System.out.println("Second");
break;
case 3:
System.out.println("Third");
case 4: System.out.println("Fourth");
break;
case 5:
System.out.println("Fifth");
default:
System.out.println("Invalid");
}
i++;
}
}
}