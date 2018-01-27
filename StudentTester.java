import java.util.Scanner;

/**
This program is an extension of WorkShop 8 and 
calculates the average quiz score for a Student
This is the Test Class for the program.

@author Timothy McWatters
@version 1.0

COP2253    WorkShop 9
File Name: StudentTester.java
File 2 of 2
*/

public class StudentTester {
   public static void main(String[] args) {
      // creates a new instance of the Scanner class
      Scanner keyboard = new Scanner(System.in);
      
      // variables
      String name = "";
      String runAgain = "";
      int quizScore = 0;
      String classification = "";
      int grade = 0;
      
      System.out.println("What is your name? ");
      name = keyboard.nextLine();
      System.out.println("Are you a freshman, softmore, junior or senior? ");
      classification = keyboard.next();
      Student student1 = new Student(name, classification);  
      // do-while loop is to run the program once and then determine if you want to run the program again.
      do {  
            System.out.println("Please enter a quiz score: ");
            quizScore = keyboard.nextInt();  
            student1.addQuiz(quizScore);
            
            System.out.println("Would you like to enter more quiz scores? (Y/N)");
            runAgain = keyboard.next();
      } while (runAgain.equalsIgnoreCase("Y"));
      //prints student1's info to test the 2 parameter Student constructor, plus the addQuiz() and toString() methods
      System.out.println(student1.toString());
      
      Student student2 = new Student();
      System.out.println("What is the new students name? ");
      keyboard.nextLine();
      name = keyboard.nextLine();
      System.out.println("Is the new student a freshman, softmore, junior or senior? ");
      classification = keyboard.next();
      student2.setName(name);
      student2.setClassification(classification);
      // do-while loop is to run the program once and then determine if you want to run the program again.
      do {  
            System.out.println("Please enter a quiz score: ");
            quizScore = keyboard.nextInt();  
            student2.addQuiz(quizScore);
            
            System.out.println("Would you like to enter more quiz scores? (Y/N)");
            runAgain = keyboard.next();
      } while (runAgain.equalsIgnoreCase("Y"));
      //prints student2's info to test the default Student constructor, plus the setName() and setClassification() mutator methods
      System.out.println(student2.toString());
      
      //tests the equals() method with an if/else statement      
      if (student1.equals(student2)) {
         System.out.println("These two students are in the same grade and have the same quiz average");
      } else {
         System.out.println("These two students are either not in the same grade or do not have the same quiz average");
      }
      
      System.out.println();
      System.out.println("Change the new students grade by using their class code: ");
      System.out.println("1 - freshman, 2 - softmore, 3 - junior, or 4 - senior");
      grade = keyboard.nextInt();
      student2.setClassification(grade);
      //prints student2's information to test the overloaded setClassification() method.
      System.out.println(student2.toString());
   }
}