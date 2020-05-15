package patterns.behavioral.template;

public class ProgramRunner {
    public static void main(String[] args) {
        Program javaProgram = new JavaProgram();
        Program pythonProgram = new PythonProgram();
        javaProgram.create();
        System.out.println();
        pythonProgram.create();
    }
}
