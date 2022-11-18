package studentAndSchoolRegister;

public class Student {

    private String name;
    private String surName;
    private int age;

    public Student(String name, String surName, int age) {
       setName(name);
       setSurName(surName);
       setAge(age);
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {

        if(age<15)
            throw new RuntimeException("The age limit for registration is 15");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }

}
