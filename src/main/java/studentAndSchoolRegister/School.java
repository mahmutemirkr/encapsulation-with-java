package studentAndSchoolRegister;

import java.util.ArrayList;

public class School {

    private String schoolName;

    private int maxStudentNumbers;

    private ArrayList<Student> students = new ArrayList<>();

    public School(String schoolName, int maxStudentNumbers) {
       setSchoolName(schoolName);
       setMaxStudentNumbers(maxStudentNumbers);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getMaxStudentNumbers() {
        return maxStudentNumbers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setMaxStudentNumbers(int maxStudentNumbers) {
        this.maxStudentNumbers = maxStudentNumbers;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }


}
