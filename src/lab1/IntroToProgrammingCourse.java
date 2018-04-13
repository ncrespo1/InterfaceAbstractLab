package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends Course {


    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        System.out.println(prerequisites + " cannot be set as a prerequisite for Intro to Programming");
    }

    @Override
    public String getPrerequisites() {
        return "No prerequisites";
    }
}

