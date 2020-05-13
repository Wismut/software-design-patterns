package patterns.structural.proxy;


public class DevelopmentRunner {
    public static void main(String[] args) {
        Developer realDeveloper = new JavaDeveloper();
        realDeveloper.writeCode();
        System.out.println();
        Developer developer = new JavaDeveloperProxy();
        developer.writeCode();
    }
}
