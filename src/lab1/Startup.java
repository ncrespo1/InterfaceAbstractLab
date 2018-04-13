package lab1;

public class Startup {
    public static void main(String[] args) {

        Course advancedJava = new AdvancedJavaCourse("Advanced Java", "155-555", 4.0);
        Course introToJava = new IntroJavaCourse("Intro to Java", "155-556", 3.0);
        Course introToProgramming = new IntroToProgrammingCourse("Intro to Programming", "155-557", 4.0);

        advancedJava.setCourseNumber("500-100");
        introToJava.setCourseNumber("400-300");
        introToProgramming.setCourseNumber("200-100");
    }
}