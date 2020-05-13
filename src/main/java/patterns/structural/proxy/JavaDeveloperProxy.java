package patterns.structural.proxy;


public class JavaDeveloperProxy implements Developer {
    Developer javaDeveloper;

    public JavaDeveloperProxy() {
        javaDeveloper = new JavaDeveloper();
    }

    @Override
    public void writeCode() {
        javaDeveloper.writeCode();
        System.out.println("Logs for writeCode() method");
    }
}
