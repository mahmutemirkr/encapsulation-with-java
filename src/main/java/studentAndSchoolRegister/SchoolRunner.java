package studentAndSchoolRegister;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SchoolRunner {

    public static void main(String[] args) {


        School school = new School("JavaWithEncapsulation",3);
        List<Student> studentsOfTheSchool = school.getStudents();

        int maxStudentsCounter = 1;

        do {

            Scanner scanner = new Scanner(System.in);

            System.out.print(maxStudentsCounter + ".Student Name:");
            String studentName = scanner.nextLine();

            System.out.print(maxStudentsCounter + ".Student Surname:");
            String studentSurName = scanner.nextLine();

            System.out.print(maxStudentsCounter + ".Student Age:");
            int studentAge = scanner.nextInt();

            System.out.println("----------------------------------------");


            try{

                Student student = new Student(studentName,studentSurName,studentAge);
                studentsOfTheSchool.add(student);
                maxStudentsCounter++;

            } catch (Exception e){

                System.out.println(e.getMessage());

            }

        }while (maxStudentsCounter<=school.getMaxStudentNumbers());

        for(Student student: school.getStudents()){
            System.out.println("Students = " + student);
        }

    }

}
