package week7;

import java.util.ArrayList;
import java.util.List;

public class ITECCourse {

    // Adding this data to ITECCourse object
    // We have to make the variables private
    private String name;        // name will store the name of our college course
    private int code;       // code will store the code of our college course
    private List<String> students;      // this will declare a list of students
    private int maxStudents;        // this will store the variable that declares the max...
    // number of students able to be enrolled in a course.

    // We need to get methods for private variables
    // Only need these if other classes will need to modify the variables
    // Often times we will use get methods to simply read our values, etc


    public int getMaxStudents() {
        return maxStudents;
    }       // our getter method for getMaxStudents
    // these public methods allow other public classes to access private variables
    public void setMaxStudents(int maxStudents) {   // our setter method with 1 argument, maxStudents.
        if (maxStudents < 0) {      // if maxStudents is less than 0...
            return;         // return maxStudents to main method
        }       // end of if statement
        this.maxStudents = maxStudents;     // "this." sets our private variables to hold a value
    }       // end of setter method

    public int getCode() {      // our getter method for college course code
        return code;        // return college course code to main method using getCode()
    }       //  end of getter method

    public void setCode(int code) {     // our setter method for our code
        this.code = code;       // "this." will set a private variable to be used in other classes
    }       // end of setter method

    public String getName() {       // our getter method for our code
        return name;        // returns name of college course
    }       // end of getter method for our code. this public method can be accessed outside of this java class.

    public void setName(String name) {      // our setter method for this code
        this.name = name;       // returns name of college course
    }       // end of setter method for "name" variable

    // We need to declare the constructor (public method)

    public ITECCourse(String courseName, int courseCode, int courseMaxStudents) {
        // our ITECCourse method! contains 3 arguments. 1 string and 2 int arguments.
        this.name = courseName;     // ".this" refers to an instance variable vs a local variable
        this.code = courseCode;     // ".this" sets instance variables
        this.students = new ArrayList<>();      // this will initiate the students list
        this.maxStudents = courseMaxStudents;       // initiates courseMaxStudents as a instance variable
    }       // end of public method ITECCourse

    public void addStudent(String studentName) {    // our addStudent method using 1 argument "studentName"
        // will initialize students if not already initialized
        if (students == null) {     // if students is equal to null...
            students = new ArrayList<>();       // create new ArrayList for students variable
        }       // end of if loop

        if (students.size() == maxStudents) {           // .size() is how many elements in the students array
            // if students length is equal to max students,
            System.out.println("Course is full. Cannot add " + studentName);        //print negative message for user
            System.out.println("The max number of students is " + maxStudents);     //print maxStudents for user
        } else {        // if-else block, if the students array does not exceed max students...
            students.add(studentName);      // add studentName to the "students" array list
        }       // end of if-else block
    }       // end of addStudent method

    public void removeStudent(String studentName) {     // our removeStudent method using 1 argument "studentName"
        if (students.contains(studentName)) {       //if our students array contains the student name we want to remove
            students.remove(studentName);       // we can remove it in this line!
            System.out.println(studentName + " was un-enrolled from " + name);      // removed from student array list
        } else {        // if studentName we are trying to remove was NOT found in the students array,
            System.out.println(studentName + " was not found in " + name);      //print negative message for user
        }       // end of if-else statement
    }       // end of removeStudent method

    public void writeCourseInfo() {     // this is how we will write our course info template...
        System.out.println("Course name: " + name);     // print the course name for our user
        System.out.println("Course code: " + code);     // print the course code for our user
        System.out.println("Students enrolled: ");      // print list of names enrolled in course
        for (String student : students) {               // loop over students array
            System.out.println(student);                // student represents a single element of the students array
        }       // end of for loop over entire students array
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");    // use method here
        System.out.println("The max number of students that can enroll in this course is " + maxStudents);
        //print max students value for our user
    }       // end of writeCourseInfo

    public int getNumberOfStudents() {      // getNumberOfStudents method for our user
        return students.size();         // return the size of our students array list
    }       // end of getNumberOfStudents method

}       // end of public java class
