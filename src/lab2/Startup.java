package lab2;

public class Startup {
    public static void main(String[] args) {
        Course advancedJava = new AdvancedJavaCourse("Advanced Java", "222-2222", 4.0);
        Course introToProgramming = new IntroToProgrammingCourse("Intro To Programming", "333-3333", 3.0);
        Course introToJava = new IntroJavaCourse("Intro to Java", "444-4444", 3.5);

        advancedJava.setCredits(3.0);
        introToProgramming.setCredits(2.0);
        introToJava.setCredits(3.0);
    }
}
