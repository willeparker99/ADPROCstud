/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;
import Lab2.*;
public class Main {
   public static void main(String[] args){
       
        /* LAB 2 CODE
        Student stud1 = new Student("Jo", "UP123456", new int[]{2,4,6});
        Student stud2 = new Student("Ann", "UP654321", new int[]{6,8,10});
        stud1.printOut( );
        stud2.printOut( );

        Student stud3 = new Student("Dave", "UP246810", new int[]{10,10,5});

        stud3.setName("Allan");
        stud3.setID("UP019876");
        stud3.setScore(new int[]{3,3,5});
        stud3.printOut();

        stud1.avScore();
        stud2.avScore();
        stud3.avScore();
      
        stud1.printOut();
        stud2.printOut();
        stud3.printOut();
        END OF LAB 2 CODE */
        Student stud1 = new Student("Jo", "UP123456", new int[]{2,4,6});
        Student stud2 = new Student("Ann", "UP654321", new int[]{6,8,10});
        Student stud3 = new Student("Dave", "UP246810", new int[]{10,10,5});
        Student stud4 = new Student();
        stud4.setScore(new int[]{40,50,60,70});
        Student stud5 = new Student();
        stud5.setScore(new int[]{30,40,50,70});
        Student stud6 = new Student();
        stud6.setScore(new int[]{10,50,80,100});
        
        Course courseBio = new Course("Biology");
        Course coursePhys = new Course("Physics");
        
        courseBio.addStudent(stud1);
        courseBio.addStudent(stud2);
        courseBio.addStudent(stud3);
        
        coursePhys.addStudent(stud4);
        coursePhys.addStudent(stud5);
        coursePhys.addStudent(stud6);
        
        System.out.println(courseBio.getCourseName());
        System.out.println("Number of Students: " + courseBio.getNoStudents());
        System.out.println("Average Score: " + courseBio.calculateAverage());
        System.out.println("Students: ");
        for(String studentName : courseBio.getStudentNames()) {
            System.out.println(studentName);
        }
        System.out.println("Best Student: " + courseBio.getBestStudentByScore().getName());
        
        System.out.println(coursePhys.getCourseName());
 	System.out.println("Number of Students: " + coursePhys.getNoStudents());
        System.out.println("Average Score: " + coursePhys.calculateAverage());
        System.out.println("Students: ");
        for(String studentName : coursePhys.getStudentNames()) {
            System.out.println(studentName);
        }
        System.out.println("Best Student: " + coursePhys.getBestStudentByScore().getName());
   }
}
