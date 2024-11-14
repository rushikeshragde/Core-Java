public class TwentytreeProblem{
public static void main(String []args){
int i = 0;
while (i < 3) {
 for (int j = 0; j < 3; j++) {
 if (i + j > 2-1) {
 System.out.print("X ");
 } else {
 System.out.print("Y ");
 }
 }
 i++;
}
}
}