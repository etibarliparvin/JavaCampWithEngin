package main.inheritance2;

public class EmailLogger extends Logger {
    @Override
    public void log() {
        System.out.println("Email log");
    }
}