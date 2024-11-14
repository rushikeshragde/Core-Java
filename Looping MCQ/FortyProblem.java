public class FortyProblem{
public static void main(String[] args) {
 for (int i = 1; i <= 2; i++) {
 for (int j = 1; j <= 3; j++) {
 switch (i) {
 case 1:
 switch (j) {
 case 1:
 System.out.print("A ");
 break;
 case 2:
 System.out.print("B ");
 break;
 case 3:
 System.out.print("C ");
 break;
 }
 break;
 case 2:
 switch (j) {
 case 1:
 System.out.print("D ");
 break;
 case 2:
 System.out.print("E ");
 break;
 case 3:
 System.out.print("F ");
 break;
 }
 break;
 }
 }
 }
 }
}