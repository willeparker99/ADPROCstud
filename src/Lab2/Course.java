/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;
import java.util.ArrayList;
/**
 *
 * @author up861063
 */
public class Course {
    //Instance variables
    private String name;
    private ArrayList<Student> studentArray;
    private int noStudents;
    // Constructors
    public Course(){
        studentArray = new ArrayList();
    }
    public Course(String name){
        studentArray = new ArrayList();
        this.name = name;
    }
    
    //Accessors
    public String getCourseName(){
        return name;
    }
    public ArrayList getStudentArray(){
        return studentArray;
    }
    public int getNoStudents(){
        return noStudents;
    }
    public ArrayList<String> getStudentNames(){
        ArrayList<String> StudentNames = new ArrayList();
        int index = 0;
        for(Student i : studentArray){
            StudentName.add(i.)
            index++;
        }
        return StudentNames;
    }
    public Student getBestStudentByScore(){
        Student best = new Student();
        for(Student i : studentArray){
            if(best.avScore() < i.avScore()){
                best = i;
            }
        }
        return best;
    }
    //mutators
    public void setName(String newName){
        name = newName;
    }
    public void addStudent(Student newStudent){
        this.studentArray.add(newStudent);
        noStudents = studentArray.size();
    }
    public double calculateAverage(){
        double total = 0;
        for(Student i : studentArray){
            total += i.avScore();
        }
        total /= noStudents;
        return total;
    }
}
