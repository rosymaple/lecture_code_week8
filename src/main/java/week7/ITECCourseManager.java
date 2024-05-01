package week7;

import java.util.ArrayList;

public class ITECCourseManager {

        public static void main(String[] args) {

            ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);
            // use ITECCourse as an object
            // we need to write a method using ITECCourse and call it "maintenanceCourse"
            // the three variables we need to set are courseName, courseCode and courseMaxStudents

//            maintenanceCourse.name = "Microcomputer Systems Maintenance";
//            maintenanceCourse.code = 1310;
//            maintenanceCourse.maxStudents = 20;
//            String maintenanceCourseName = "Microcomputer Systems Maintenance";
//            int maintenanceCourseCode = 1310;
//            ArrayList<String> maintenanceCourseStudentList = new ArrayList<>();
//            int maintenanceCourseMaxStudents = 20;

            // add some students. TODO check that we have not exceeded the max number for the class
            // add some students. TODO check that we have not exceeded the max number for the class
            maintenanceCourse.addStudent("Anna");       //add student to maintenanceCourse x3
            maintenanceCourse.addStudent("Bill");
            maintenanceCourse.addStudent("Carl");
            maintenanceCourse.removeStudent("Carl");        // remove carl from maintenanceCourse

            maintenanceCourse.writeCourseInfo();        // print our writeCourseInfo() method
            // this prints a user-friendly list of information for our user

            // new ITECCourse object called datacomCourse
            ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30);
//            datacomCourse.name = "Data Communications";
//            datacomCourse.code = 1425;
//            datacomCourse.maxStudents = 30;
//            String datacomCourseName = "Data Communications";
//            int datacomCourseCode = 1425;
//            ArrayList<String> datacomCourseStudentList = new ArrayList<>();
//            int datacomCourseMaxStudents = 30;

            // add some students
            datacomCourse.addStudent("Dave");       // add 3 students to datacomCourse
            // using .addStudent method, creates an array list for our datacomCourse method
            datacomCourse.addStudent("Ed");
            datacomCourse.addStudent("Flora");

            //print information about these courses in a user-friendly easy to read format
            datacomCourse.writeCourseInfo();

            // new ITECCourse object called softwareDevelopmentProjects
            // needs three variables to be initialized here
            ITECCourse softwareDevelopmentProjects = new ITECCourse("Software Development Projects", 2903, 24);
            softwareDevelopmentProjects.addStudent("Gus");      // add four names to the students array
            softwareDevelopmentProjects.addStudent("Harry");
            softwareDevelopmentProjects.addStudent("Izzy");
            softwareDevelopmentProjects.addStudent("Jake");


            // create a new int variable called "totalEnrolled" ...
            // to hold the integer value that getNumberOfStudents() returns
            int totalEnrolled = softwareDevelopmentProjects.getNumberOfStudents();
            // print two templates of data below. use our getter methods to get name and code. show off our new variable
            System.out.println("The " + softwareDevelopmentProjects.getName() + " class has " + totalEnrolled + " students");
            System.out.println("ITEC " + softwareDevelopmentProjects.getCode() + " " + softwareDevelopmentProjects.getName());

            // set values for methods to set our instance variables
            softwareDevelopmentProjects.setMaxStudents(30);
            softwareDevelopmentProjects.writeCourseInfo();      // print our user friendly easy to read data for...
            // softwareDevelopmentProjects.

            ITECCourse smallCourse = new ITECCourse("Made up course", 1234, 3);
            // make up a course object above ^
            // testing to see what happens if we add too many students to a course
            smallCourse.addStudent("Kirby");        // add three students to smallCourse
            smallCourse.addStudent("Liam");
            smallCourse.addStudent("Miriam");
            smallCourse.removeStudent("Kirby");     // delete first student added to smallCourse
            smallCourse.addStudent("Nita");         // add another student to smallCourse students array

            smallCourse.writeCourseInfo();      // print user friendly easy to read data for smallCourse
            // our fake college course

        }       // end of main method

        public static void writeCourseInfo(String name, int code, ArrayList<String>students, int maxStudents) {
            // this method takes 4 arguments
            // this method will print easy to read data about any course object we want to create.
            System.out.println("Course Name: " + name);         // print course name for user
            System.out.println("Course Code: " + code);         // print course code for user
            System.out.println("Students enrolled:");           // print students enrolled for user
            for (String student : students) {               // loop through our students array list ...
                // for any college course object
                System.out.println(student);            // print each element in our students array list
            }       // end of for loop over our students array list
            System.out.println("There are " + getNumberOfStudents(students) + " students enrolled");
            // print the maxStudents variable and tell the user the max number of students that can enroll in the class
            System.out.println("The max number of students that can enroll in this course is " + maxStudents);
        }       // end of writeCourseInfo method


        public static int getNumberOfStudents(ArrayList<String> students) {
            return students.size();
        }
        // create getNumberOfStudents method which consists of one argument: students array list
        // getNumberOfStudents consists of one function: returning our .size() of our students array
        // getNumberOfStudents will return an int value

}       // end of public class ITECCourseManager