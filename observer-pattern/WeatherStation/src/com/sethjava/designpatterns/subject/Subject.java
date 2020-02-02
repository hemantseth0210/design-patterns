package com.sethjava.designpatterns.subject;

import com.sethjava.designpatterns.observers.Observer;

public interface Subject {
    public void register(Observer observer);
    public void remove(Observer observer);
    public void notifyObservers();
}
