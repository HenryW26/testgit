package DesignPattern.ObserverPattern;

public interface Subject {
    public void setState(int state);
    public int getState();
    public void attach(Observer obs);
    public void detach(Observer obs);
    public void notify(String msg);
}
