public class TirdProblem {
 public static void main(String[] args) {
 int i = 1;
 while (i <= 2) {
 int j = 1;
 while (j <= 3) {
 if (i == 2 && j == 2) break;
 System.out.println(i + " " + j);
 j++;
 }
 i++;
 }
 }
}