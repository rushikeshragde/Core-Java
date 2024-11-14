public class TwontytwoProblem{
public static void main(String []args){
for (int i = 1; i <= 5; i++) {
 switch (i*2-2) {
 case 2:
 case 4:
 System.out.print(i + " ");
 break;
 default:
 System.out.print("D ");
 }
}
}
}