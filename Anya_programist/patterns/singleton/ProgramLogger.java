package Anya_programist.patterns.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is log File";

    public static ProgramLogger getProgramLogger(){
        if(programLogger == null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger(){}

    public void addLogInto(String logInto){
        logFile += logInto + "\n";
    }

    public void showLogFile(){
        System.out.println(logFile);
    }
}
