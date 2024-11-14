public class TwoleProblem {
 public static void main(String[] args) {
 int i = 1;
 while (i <= 2) {
 switch (i) {
 case 1:
 System.out.print("P ");
 switch (i + 1) {
 case 2:
 System.out.print("Q ");
 break;
 case 3:
 System.out.print("R ");
 break;
 }
 break;
 case 2:
 System.out.print("S ");
 switch (i + 1) {
 case 3:
 System.out.print("T ");
 break;
 case 4:
 System.out.print("U ");
 break;
 }
 break;
 }
 i++;
 }
 }
}
