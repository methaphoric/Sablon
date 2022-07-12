public class Subject implements Observable {

    private Observer[] observers = {};

    @Override
    public void addObserver(Observer s) {
        Observer[] newObservers = new Observer[observers.length + 1];
        System.arraycopy(observers, 0, newObservers, 0, observers.length);
        newObservers[observers.length] = s;
        observers = newObservers;
    }

    @Override
    public void removeObserver(Observer s) {
        int indexOfElementToRemove = -1;
        for (int i = 0; i < observers.length; i++) {
            if (s.equals(observers[i]))
                indexOfElementToRemove = i;
        }
        Observer[] newObservers = new Observer[observers.length - 1];

        System.arraycopy(observers, 0, newObservers, 0, indexOfElementToRemove);
        System.arraycopy(observers, indexOfElementToRemove + 1, newObservers, indexOfElementToRemove, observers.length - indexOfElementToRemove - 1);
        observers = newObservers;
    }

    @Override
    public void notifyObservers(String msg) {

        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}
