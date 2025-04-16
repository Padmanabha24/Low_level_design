package observable;

import observer.NotificationObserver;

public interface VideoObservable {
    public void add_subscribers(NotificationObserver observer);
    public void remove_subscribers(NotificationObserver observer);
    public void notify_method();
}
