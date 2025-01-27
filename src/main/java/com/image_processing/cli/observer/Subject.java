package com.image_processing.cli.observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
}
