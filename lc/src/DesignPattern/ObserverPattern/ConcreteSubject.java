package DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer> observerList = new ArrayList<Observer>();
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
        notify("new state: " + state);
    }

    @Override
    public int getState() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void attach(Observer obs) {
        // TODO Auto-generated method stub
        observerList.add(obs);
    }

    @Override
    public void detach(Observer obs) {
        // TODO Auto-generated method stub
        observerList.remove(obs);
    }

    @Override
    public void notify(String msg) {
        // TODO Auto-generated method stub
        for (Observer obs: observerList) {
            obs.update(msg);
        }
    }
}
