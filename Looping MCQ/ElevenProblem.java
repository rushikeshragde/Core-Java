public class ElevenProblem{
 public static void main(String[] args) {
 int i = 1;
 while (i <= 3) {
 int j = 1;
 while (j <= 3) {
 if (j == 2) {
 j++;
 continue;
 }
 System.out.print(i * j + " ");
 j++;
 }
 i++;
 }
 }
}