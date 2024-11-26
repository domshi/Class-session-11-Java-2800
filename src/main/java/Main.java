import java.util.*;

  
public class Main {
  
  public static void main(String[] args) {

    System.out.println("Multi dimensional arrays");

    Random rand = new Random(10);
    int x = rand.nextInt(10);

   // float[][] myGrades = new float[2][10];
    //String[] myStudents = new String[10];
    
    double[][] myGrades = {{55.5, 66.6}, {56.6, 54.3}, {99.9,55.2}, {77.7, 88.8}};
    String[] myStudents = { "Johan", "Jaylen", "Anthony","Long"};
    
    for (int i = 0; i<myGrades.length; i++) {
      
      for (int j = 0; j<myGrades[i].length; j++) {
        
        System.out.println(myStudents[i] + " has grades of " + myGrades[i][j] + "");
        
      }//end inner loop
      
    }//end outer loop
    
  }

}