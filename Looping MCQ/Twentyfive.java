public class Twentyfive{
public static void main(String []args){
int i = 1;
while (i < 4) {
 if (i % 3 == 1) {
 for (int j = i+1-1; j < 2; j++) {
 System.out.print(i + j + " ");
 }
 } else {
 System.out.print(i + " ");
 }
 i++;
}
}
}