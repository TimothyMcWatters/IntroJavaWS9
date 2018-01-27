/**
This program is an extension of WorkShop 8 and 
calculates the average quiz score for a Student

@author Timothy McWatters
@version 1.0

COP2253    WorkShop 9
File Name: Student.java
File 1 of 2
*/

public class Student {
   //instance variables
   private String name = "";
   private double totalQuizScore = 0.0;
   private int numQuizesTaken = 0;
   private String classification = "";
   
   /**
   Constructs the Student object with default values for instance fields
   */
   public Student() {
      name = "";
      totalQuizScore = 0.0;
      numQuizesTaken = 0;
      classification = "";
   } //end of Student w/ 0 parameters (default)
   
   /**
   Constructs the Student object with a given name and the rest default values
   @param name: student name
   @param classification: students grade (freshman, softmore, junior, senior)
   */   
   public Student(String name, String classification) {
      this.name = name;
      this.totalQuizScore = 0.0;
      this.numQuizesTaken = 0;
      this.classification = classification;
   } //end of Student w/ 2 parameters
   
   /**
   Sets the instance variable name
   @param name: the name of the student
   */   
   public void setName(String name) {
      this.name = name;
   } // end of setName method
   
   /**
   Returns the name of the student
   @return name: the name of the student
   */   
   public String getName() {
      return name;
   } // end of getName method
 
   /**
   Sets the instance variable classification
   @param classification: the grade year of the student
   */   
   public void setClassification(String classification) {
      this.classification = classification;
   } // end of setClassification method
   
   /**
   overloaded method setClassification
   Sets the instance variable classification to a string based off an int parameter
   @param classCode: int representation of students grade year
   */   
   public void setClassification(int classCode) {
      if (classCode == 1) {
         this.classification = "freshmen";
      } else if (classCode == 2) {
         this.classification = "softmore";
      } else if (classCode == 3) {
         this.classification = "junior";
      } else if (classCode == 4) {
         this.classification = "senior";
      } else {
         System.out.println("The class code entered is invalid.");
      }
   } // end of setClassification method

   /**
   Returns the classification of the student
   @return classification: the grade year of the student
   */   
   public String getClassification() {
      return classification;
   } // end of getClassification method

   /**
   Calculates and returns the average quiz score
   @returns a double representation of average quiz score
   */   
   public double getAverageScore() {
      return totalQuizScore / (double)numQuizesTaken;
   } // end of getAverageScore method
   
   /**
   Returns the number of quizzes the student has taken
   @return classification: the grade year of the student
   */   
   public int getNumQuizesTaken() {
      return numQuizesTaken;
   } // end of getNumQuizesTaken
   
   /**
   Adds another quiz score to the student, both adding the score to the total and incrementing the number of quizes taken. 
   @param score: a new quiz score to add to the totalQuizScore.
   */   
   public void addQuiz(int score) {
      if ((score >= 0) && (score <= 100)) {
         totalQuizScore += score;
         numQuizesTaken++;
      } else {
         System.out.println("ERROR: The score you entered is not valid and will not be counted.");
      }
   } // end of addQuiz method
   
   /**
   Returns the total quiz score 
   @return totalQuizScore: returns a double representation of the total quiz score
   */   
   public double getTotalQuizScore() {
      return totalQuizScore;
   } // end of getTotalQuizScore method
   
   public String toString() {
      return String.format("%s is a %s, has a total score of %.2f after %d quizzes, and has an average quiz score of %.2f.\n", getName(), getClassification(), getTotalQuizScore(), getNumQuizesTaken(), getAverageScore());
   }
   
   public boolean equals(Student otherStudent) {
      if ((this.classification.equals(otherStudent.classification)) && (this.getAverageScore() == otherStudent.getAverageScore())) {
         return true;
      } else {
         return false;
      }
   }
   
} // end of Student class