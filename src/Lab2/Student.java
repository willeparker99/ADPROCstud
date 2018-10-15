package Lab2;
// in the Student class
public class Student {
  private String name, id;      // private instance variables - accessed only within this class
  private int [] score = new int[]{}; // score[] is an array of three integers for the exam marks
  // Constructor (default)
  public Student( )
  {
      score = new int[]{0,0,0}; 
  }
  // Constructor (to initialise the name, the id, and the exam marks)
  public Student( String stName, String stID, int stScore[])
  {
      this.name = stName;
      this.id = stID;
      this.score = stScore;
  }
/* Assign the name, ID, and the exam scores from the formal parameters 
    to the class instance variables here */
//[WRITE CODE HERE]
   // Modifier methods
   public void setName( String nameIn)	// to modify the student name
   {   
       this.name = nameIn;
   }
       
//[WRITE CODE HERE]
   public void setID(String newID){
       this.id = newID;
   }
   public void setScore(int[] newScore){
       this.score = newScore;
   }  
	// ...
// Access methods
   public String  getName ( )  		// to access the student name
  {
       return this.name;
//[WRITE CODE HERE]
  }
   public String getID(){
       return this.id;
   }
   public int[] setScore(){
       return this.score;
   }

  // Calculates the average score
    public double avScore( )		// calculate the total and divide it by 3
    { 
        int average = 0;
        for(int i : this.score){
             average += i;       
        }
        return average/3;
    }
//[WRITE CODE HERE]
// Displays the student data attributes
    public void printOut( )
    { 
        String printInfo = String.format("Student name: %1$s\n Student id: %2$s\nStudent Test Scores: ", name, id);
        for(int i : this.score){
            printInfo += i + ", ";
        }
        printInfo += "\nAverage Test Score: " + avScore();
        System.out.println(printInfo);
}
//[WRITE CODE HERE]
    
}	// end of class Student