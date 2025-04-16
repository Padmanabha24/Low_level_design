package observable;
import java.util.*;
import observer.NotificationObserver;

public class NewVideo implements VideoObservable{
    ArrayList <NotificationObserver> observerList=new ArrayList<NotificationObserver>();


    //add method
    public void add_subscribers(NotificationObserver observer){

        observerList.add(observer);

    }


    //remove method
    public void remove_subscribers(NotificationObserver observer){
        observerList.remove(observer);

    }

    //notify method
    public void notify_method(){
        for(NotificationObserver observer:observerList){
            observer.update();
        }
    }
}
